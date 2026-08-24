import 'dart:async';
import 'package:cloud_firestore/cloud_firestore.dart';
import 'package:flutter/material.dart';
import '../models/models.dart';
import '../services/firebase_service.dart';
import '../services/notification_service.dart';

class GoalProvider extends ChangeNotifier {
  final FirebaseService _firebaseService = FirebaseService();
  List<Goal> _goals = [];
  bool _isLoading = false;
  StreamSubscription? _subscription;

  List<Goal> get goals => _goals;
  bool get isLoading => _isLoading;

  void _setLoading(bool val) {
    _isLoading = val;
    notifyListeners();
  }

  void initListener() {
    _subscription?.cancel();
    _setLoading(true);
    try {
      _subscription = _firebaseService.goalsCol.orderBy('createdAt', descending: true).snapshots().listen((snapshot) {
        _goals = snapshot.docs.map((doc) => Goal.fromFirestore(doc)).toList();
        _isLoading = false;
        notifyListeners();
      }, onError: (e) {
        _isLoading = false;
        notifyListeners();
      });
    } catch (e) {
      _isLoading = false;
      notifyListeners();
    }
  }

  void clearListener() {
    _subscription?.cancel();
    _goals = [];
  }

  Future<void> addGoal({
    required String title,
    required String type,
    required double targetValue,
    required String attachedActivityId,
    required String timeframe,
    DateTime? deadline,
  }) async {
    try {
      final docRef = _firebaseService.goalsCol.doc();
      final goal = Goal(
        id: docRef.id,
        title: title,
        type: type,
        targetValue: targetValue,
        currentValue: 0.0,
        attachedActivityId: attachedActivityId,
        timeframe: timeframe,
        deadline: deadline,
        createdAt: DateTime.now(),
        isAchieved: false,
        notifiedMilestones: const [],
      );
      await docRef.set(goal.toFirestore());
    } catch (e) {
      debugPrint('Error adding goal: $e');
      rethrow;
    }
  }

  Future<void> deleteGoal(String goalId) async {
    try {
      await _firebaseService.goalsCol.doc(goalId).delete();
    } catch (e) {
      debugPrint('Error deleting goal: $e');
      rethrow;
    }
  }

  // Calculate dynamic progress value for a single Goal
  double calculateProgressValue(
    Goal goal, {
    required List<StudySession> sessions,
    required List<Habit> habits,
    required List<Expense> expenses,
    required double cgpa,
    required double totalCredits,
  }) {
    switch (goal.type) {
      case 'study':
        // Sum study duration (in hours) since goal creation
        final relevantSessions = sessions.where((s) {
          final isAfter = s.date.isAfter(goal.createdAt) || s.date.isAtSameMomentAs(goal.createdAt);
          if (!isAfter) return false;
          if (goal.attachedActivityId == 'all') return true;
          return s.subject.toLowerCase() == goal.attachedActivityId.toLowerCase();
        });
        final totalSeconds = relevantSessions.fold<int>(0, (sum, s) => sum + s.duration);
        return double.parse((totalSeconds / 3600.0).toStringAsFixed(2)); // in hours

      case 'habit':
        // Count habit completions since goal creation
        if (goal.attachedActivityId == 'all') {
          int totalCompletions = 0;
          for (var h in habits) {
            totalCompletions += h.completedDates.where((d) => d.isAfter(goal.createdAt) || d.isAtSameMomentAs(goal.createdAt)).length;
          }
          return totalCompletions.toDouble();
        } else {
          final habit = habits.where((h) => h.id == goal.attachedActivityId).firstOrNull;
          if (habit == null) return 0.0;
          final completions = habit.completedDates.where((d) => d.isAfter(goal.createdAt) || d.isAtSameMomentAs(goal.createdAt)).length;
          return completions.toDouble();
        }

      case 'academic':
        if (goal.attachedActivityId == 'gpa') {
          return cgpa;
        } else {
          return totalCredits;
        }

      case 'expense':
        // Sum expenses since goal creation
        final relevantExpenses = expenses.where((e) {
          final isAfter = e.date.isAfter(goal.createdAt) || e.date.isAtSameMomentAs(goal.createdAt);
          if (!isAfter) return false;
          if (goal.attachedActivityId == 'all') return true;
          return e.category.toLowerCase() == goal.attachedActivityId.toLowerCase();
        });
        final totalSpent = relevantExpenses.fold<double>(0.0, (sum, e) => sum + e.amount);
        return totalSpent;

      default:
        return 0.0;
    }
  }

  // Check progress and trigger push notifications if milestones are crossed
  Future<void> checkProgressAndAlerts({
    required List<StudySession> sessions,
    required List<Habit> habits,
    required List<Expense> expenses,
    required double cgpa,
    required double totalCredits,
  }) async {
    if (_goals.isEmpty) return;

    for (var goal in _goals) {
      final double computedValue = calculateProgressValue(
        goal,
        sessions: sessions,
        habits: habits,
        expenses: expenses,
        cgpa: cgpa,
        totalCredits: totalCredits,
      );

      final bool valueChanged = computedValue != goal.currentValue;
      double newCurrentValue = computedValue;

      bool isNowAchieved = goal.isAchieved;
      final List<int> newMilestones = List<int>.from(goal.notifiedMilestones);
      bool shouldTriggerNotification = false;
      String notificationTitle = '';
      String notificationBody = '';

      if (goal.type == 'expense') {
        if (goal.targetValue > 0) {
          final percent = (computedValue / goal.targetValue) * 100;
          if (percent >= 100 && !newMilestones.contains(100)) {
            newMilestones.add(100);
            shouldTriggerNotification = true;
            notificationTitle = 'Budget Exceeded! ⚠️';
            notificationBody = 'You have spent ₦${computedValue.toStringAsFixed(0)} of your ₦${goal.targetValue.toStringAsFixed(0)} budget for "${goal.title}".';
          } else if (percent >= 85 && !newMilestones.contains(85)) {
            newMilestones.add(85);
            shouldTriggerNotification = true;
            notificationTitle = 'Budget Warning! 🚨';
            notificationBody = 'You have used 85% of your ₦${goal.targetValue.toStringAsFixed(0)} budget for "${goal.title}".';
          } else if (percent >= 50 && !newMilestones.contains(50)) {
            newMilestones.add(50);
            shouldTriggerNotification = true;
            notificationTitle = 'Budget Alert 💳';
            notificationBody = 'You have spent 50% of your ₦${goal.targetValue.toStringAsFixed(0)} budget for "${goal.title}".';
          }
        }
      } else if (goal.type == 'academic' && goal.attachedActivityId == 'gpa') {
        if (computedValue >= goal.targetValue && !isNowAchieved) {
          isNowAchieved = true;
          shouldTriggerNotification = true;
          notificationTitle = 'GPA Goal Achieved! 🎓';
          notificationBody = 'Outstanding! Your GPA is ${computedValue.toStringAsFixed(2)}, reaching your goal of ${goal.targetValue.toStringAsFixed(2)}!';
        }
      } else {
        if (goal.targetValue > 0) {
          final percent = (computedValue / goal.targetValue) * 100;
          if (percent >= 100 && !isNowAchieved) {
            isNowAchieved = true;
            if (!newMilestones.contains(100)) newMilestones.add(100);
            shouldTriggerNotification = true;
            notificationTitle = 'Goal Achieved! 🎉';
            notificationBody = 'Fantastic! You hit 100% of your goal: "${goal.title}".';
          } else if (percent >= 80 && !newMilestones.contains(80)) {
            newMilestones.add(80);
            shouldTriggerNotification = true;
            notificationTitle = 'Goal is 80% Complete! 🚀';
            notificationBody = 'You are almost there! 80% achieved for "${goal.title}".';
          } else if (percent >= 50 && !newMilestones.contains(50)) {
            newMilestones.add(50);
            shouldTriggerNotification = true;
            notificationTitle = 'Goal is 50% Complete! 👍';
            notificationBody = 'Halfway there! Keep going to reach your goal: "${goal.title}".';
          }
        }
      }

      final bool milestonesChanged = newMilestones.length != goal.notifiedMilestones.length;
      final bool achievedChanged = isNowAchieved != goal.isAchieved;

      if (valueChanged || milestonesChanged || achievedChanged) {
        try {
          await _firebaseService.goalsCol.doc(goal.id).update({
            'currentValue': newCurrentValue,
            'isAchieved': isNowAchieved,
            'notifiedMilestones': newMilestones,
          });

          if (shouldTriggerNotification) {
            await NotificationService().showNotification(
              id: goal.id.hashCode,
              title: notificationTitle,
              body: notificationBody,
            );
          }
        } catch (e) {
          debugPrint('Error updating goal progress: $e');
        }
      }
    }
  }

  @override
  void dispose() {
    _subscription?.cancel();
    super.dispose();
  }
}

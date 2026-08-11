import 'dart:async';
import 'package:cloud_firestore/cloud_firestore.dart';
import 'package:flutter/material.dart';
import '../models/models.dart';
import '../services/firebase_service.dart';
import '../services/notification_service.dart';

class HabitProvider extends ChangeNotifier {
  final FirebaseService _firebaseService = FirebaseService();
  List<Habit> _habits = [];
  List<CalendarTask> _tasks = [];
  bool _isLoading = false;
  StreamSubscription? _subscription;
  StreamSubscription? _tasksSubscription;

  List<Habit> get habits => _habits;
  List<CalendarTask> get tasks => _tasks;
  bool get isLoading => _isLoading;

  void _setLoading(bool val) {
    _isLoading = val;
    notifyListeners();
  }

  void initListener() {
    _subscription?.cancel();
    _setLoading(true);
    try {
      _subscription = _firebaseService.habitsCol.snapshots().listen((snapshot) {
        _habits = snapshot.docs.map((doc) => Habit.fromFirestore(doc)).toList();
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
    initTasksListener();
  }

  void initTasksListener() {
    _tasksSubscription?.cancel();
    try {
      _tasksSubscription = _firebaseService.tasksCol.snapshots().listen((snapshot) {
        _tasks = snapshot.docs.map((doc) => CalendarTask.fromFirestore(doc)).toList();
        notifyListeners();
      }, onError: (e) {
        debugPrint('Error listening to tasks: $e');
      });
    } catch (e) {
      debugPrint('Error starting tasks listener: $e');
    }
  }

  void clearListener() {
    _subscription?.cancel();
    _tasksSubscription?.cancel();
    _habits = [];
    _tasks = [];
  }

  Future<void> addHabit(String title, String frequency) async {
    try {
      final docRef = _firebaseService.habitsCol.doc();
      final habit = Habit(
        id: docRef.id,
        title: title,
        streak: 0,
        streakCount: 0,
        frequency: frequency,
        completedDates: const [],
      );
      await docRef.set(habit.toFirestore());
    } catch (e) {
      debugPrint('Error adding habit: $e');
      rethrow;
    }
  }

  Future<void> deleteHabit(String habitId) async {
    try {
      await _firebaseService.habitsCol.doc(habitId).delete();
    } catch (e) {
      debugPrint('Error deleting habit: $e');
      rethrow;
    }
  }

  Future<void> addTask(String title, DateTime date) async {
    try {
      final docRef = _firebaseService.tasksCol.doc();
      final task = CalendarTask(
        id: docRef.id,
        title: title,
        isCompleted: false,
        date: date,
      );
      await docRef.set(task.toFirestore());
    } catch (e) {
      debugPrint('Error adding task: $e');
      rethrow;
    }
  }

  Future<void> deleteTask(String taskId) async {
    try {
      await _firebaseService.tasksCol.doc(taskId).delete();
    } catch (e) {
      debugPrint('Error deleting task: $e');
      rethrow;
    }
  }

  Future<void> toggleTaskCompletion(String taskId, bool currentStatus) async {
    try {
      await _firebaseService.tasksCol.doc(taskId).update({
        'isCompleted': !currentStatus,
      });
    } catch (e) {
      debugPrint('Error toggling task: $e');
      rethrow;
    }
  }

  Future<void> toggleHabitCompletion(String habitId, DateTime date) async {
    try {
      final docRef = _firebaseService.habitsCol.doc(habitId);
      final docSnapshot = await docRef.get();
      if (docSnapshot.exists) {
        final habit = Habit.fromFirestore(docSnapshot);
        final List<DateTime> completed = List<DateTime>.from(habit.completedDates);
        
        // Check if date is already in completed list (compare day/month/year)
        final sameDayIndex = completed.indexWhere((d) => 
          d.year == date.year && d.month == date.month && d.day == date.day
        );

        if (sameDayIndex != -1) {
          // Remove completion
          completed.removeAt(sameDayIndex);
        } else {
          // Add completion
          completed.add(date);
        }

        // Sort dates
        completed.sort((a, b) => a.compareTo(b));
        
        // Calculate new streak
        final newStreak = calculateStreak(completed);

        await docRef.update({
          'completedDates': completed.map((d) => Timestamp.fromDate(d)).toList(),
          'streak': newStreak,
          'streakCount': newStreak,
        });

        await NotificationService().showNotification(
          id: habitId.hashCode,
          title: sameDayIndex != -1 ? 'Habit Reset' : 'Habit Completed!',
          body: sameDayIndex != -1 
              ? 'Marked "${habit.title}" as incomplete for today.' 
              : 'Keep it up! "${habit.title}" completed. Current streak: $newStreak.',
        );
      }
    } catch (e) {
      debugPrint('Error toggling habit completion: $e');
      rethrow;
    }
  }

  int calculateStreak(List<DateTime> completedDates) {
    if (completedDates.isEmpty) return 0;
    
    // Normalize to dates only (midnight)
    final Set<String> dateStrings = completedDates
        .map((d) => "${d.year}-${d.month.toString().padLeft(2, '0')}-${d.day.toString().padLeft(2, '0')}")
        .toSet();

    final now = DateTime.now();
    DateTime checkDate = DateTime(now.year, now.month, now.day);
    
    // Check if completed today, if not check yesterday.
    // If not completed either, streak is 0.
    String todayStr = "${checkDate.year}-${checkDate.month.toString().padLeft(2, '0')}-${checkDate.day.toString().padLeft(2, '0')}";
    
    final yesterday = checkDate.subtract(const Duration(days: 1));
    String yesterdayStr = "${yesterday.year}-${yesterday.month.toString().padLeft(2, '0')}-${yesterday.day.toString().padLeft(2, '0')}";

    if (!dateStrings.contains(todayStr) && !dateStrings.contains(yesterdayStr)) {
      return 0;
    }

    // Start traversing backward to find consecutive days
    int currentStreak = 0;
    if (dateStrings.contains(todayStr)) {
      currentStreak = 1;
      checkDate = yesterday;
    } else {
      currentStreak = 1;
      checkDate = yesterday.subtract(const Duration(days: 1));
    }

    while (true) {
      String checkStr = "${checkDate.year}-${checkDate.month.toString().padLeft(2, '0')}-${checkDate.day.toString().padLeft(2, '0')}";
      if (dateStrings.contains(checkStr)) {
        currentStreak++;
        checkDate = checkDate.subtract(const Duration(days: 1));
      } else {
        break;
      }
    }
    return currentStreak;
  }

  @override
  void dispose() {
    _subscription?.cancel();
    _tasksSubscription?.cancel();
    super.dispose();
  }
}

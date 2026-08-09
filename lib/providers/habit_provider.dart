import 'dart:async';
import 'package:cloud_firestore/cloud_firestore.dart';
import 'package:flutter/material.dart';
import '../models/habit_model.dart';
import '../services/firebase_service.dart';

class HabitProvider extends ChangeNotifier {
  final FirebaseService _firebaseService = FirebaseService();
  List<Habit> _habits = [];
  bool _isLoading = false;
  StreamSubscription? _subscription;

  List<Habit> get habits => _habits;
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
  }

  void clearListener() {
    _subscription?.cancel();
    _habits = [];
  }

  Future<void> addHabit(String title, String frequency) async {
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
  }

  Future<void> deleteHabit(String habitId) async {
    await _firebaseService.habitsCol.doc(habitId).delete();
  }

  Future<void> toggleHabitCompletion(String habitId, DateTime date) async {
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
    super.dispose();
  }
}

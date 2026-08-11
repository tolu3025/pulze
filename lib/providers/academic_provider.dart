import 'dart:async';
import 'package:flutter/material.dart';
import '../models/academic_record_model.dart';
import '../services/firebase_service.dart';
import '../services/notification_service.dart';

class AcademicProvider extends ChangeNotifier {
  final FirebaseService _firebaseService = FirebaseService();
  List<Semester> _semesters = [];
  bool _isLoading = false;
  StreamSubscription? _subscription;

  List<Semester> get semesters => _semesters;
  bool get isLoading => _isLoading;

  double get cgpa {
    return calculateCgpa();
  }

  void _setLoading(bool val) {
    _isLoading = val;
    notifyListeners();
  }

  // Bind snapshot listeners to academic records
  void initListener() {
    _subscription?.cancel();
    _setLoading(true);
    try {
      _subscription = _firebaseService.academicsCol.snapshots().listen((snapshot) {
        _semesters = snapshot.docs.map((doc) => Semester.fromFirestore(doc)).toList();
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
    _semesters = [];
  }

  Future<void> addSemester(String name) async {
    try {
      final docRef = _firebaseService.academicsCol.doc();
      final newSem = Semester(
        id: docRef.id,
        name: name,
        gpa: 0.0,
        totalCreditUnits: 0.0,
        courses: const [],
      );
      await docRef.set(newSem.toFirestore());
    } catch (e) {
      debugPrint('Error adding semester: $e');
      rethrow;
    }
  }

  Future<void> deleteSemester(String semesterId) async {
    try {
      await _firebaseService.academicsCol.doc(semesterId).delete();
    } catch (e) {
      debugPrint('Error deleting semester: $e');
      rethrow;
    }
  }

  Future<void> updateSemester(String semesterId, String name) async {
    try {
      await _firebaseService.academicsCol.doc(semesterId).update({'name': name});
    } catch (e) {
      debugPrint('Error updating semester: $e');
      rethrow;
    }
  }

  Future<void> addCourse(String semesterId, String name, double credits, String grade, double gradePoints) async {
    try {
      final docRef = _firebaseService.academicsCol.doc(semesterId);
      final docSnapshot = await docRef.get();
      if (docSnapshot.exists) {
        final sem = Semester.fromFirestore(docSnapshot);
        final updatedCourses = List<Course>.from(sem.courses);
        
        final newCourse = Course(
          id: DateTime.now().millisecondsSinceEpoch.toString(),
          name: name,
          credits: credits,
          grade: grade,
          gradePoints: gradePoints,
        );
        updatedCourses.add(newCourse);
        
        final newTotals = _recalculateGpaLocally(updatedCourses);
        await docRef.update({
          'courses': updatedCourses.map((c) => {'id': c.id, ...c.toMap()}).toList(),
          'gpa': newTotals['gpa'],
          'totalCreditUnits': newTotals['totalCreditUnits'],
        });
      }
    } catch (e) {
      debugPrint('Error adding course: $e');
      rethrow;
    }
  }

  Future<void> deleteCourse(String semesterId, String courseId) async {
    try {
      final docRef = _firebaseService.academicsCol.doc(semesterId);
      final docSnapshot = await docRef.get();
      if (docSnapshot.exists) {
        final sem = Semester.fromFirestore(docSnapshot);
        final updatedCourses = sem.courses.where((c) => c.id != courseId).toList();
        
        final newTotals = _recalculateGpaLocally(updatedCourses);
        await docRef.update({
          'courses': updatedCourses.map((c) => {'id': c.id, ...c.toMap()}).toList(),
          'gpa': newTotals['gpa'],
          'totalCreditUnits': newTotals['totalCreditUnits'],
        });
      }
    } catch (e) {
      debugPrint('Error deleting course: $e');
      rethrow;
    }
  }

  Future<void> updateCourse(String semesterId, String courseId, String name, double credits, String grade, double gradePoints) async {
    try {
      final docRef = _firebaseService.academicsCol.doc(semesterId);
      final docSnapshot = await docRef.get();
      if (docSnapshot.exists) {
        final sem = Semester.fromFirestore(docSnapshot);
        final updatedCourses = sem.courses.map((c) {
          if (c.id == courseId) {
            return Course(id: courseId, name: name, credits: credits, grade: grade, gradePoints: gradePoints);
          }
          return c;
        }).toList();
        
        final newTotals = _recalculateGpaLocally(updatedCourses);
        await docRef.update({
          'courses': updatedCourses.map((c) => {'id': c.id, ...c.toMap()}).toList(),
          'gpa': newTotals['gpa'],
          'totalCreditUnits': newTotals['totalCreditUnits'],
        });
      }
    } catch (e) {
      debugPrint('Error updating course: $e');
      rethrow;
    }
  }

  Map<String, double> _recalculateGpaLocally(List<Course> courses) {
    if (courses.isEmpty) {
      return {'gpa': 0.0, 'totalCreditUnits': 0.0};
    }
    double totalPoints = 0.0;
    double totalCredits = 0.0;
    for (var c in courses) {
      totalPoints += (c.gradePoints * c.credits);
      totalCredits += c.credits;
    }
    double gpa = totalCredits > 0 ? (totalPoints / totalCredits) : 0.0;
    return {
      'gpa': double.parse(gpa.toStringAsFixed(2)),
      'totalCreditUnits': totalCredits,
    };
  }

  double calculateCgpa() {
    if (_semesters.isEmpty) return 0.0;
    for (var sem in _semesters) {
      if (sem.courses.isEmpty) return 0.0;
    }
    double totalPoints = 0.0;
    double totalCredits = 0.0;
    for (var sem in _semesters) {
      totalPoints += (sem.gpa * sem.totalCreditUnits);
      totalCredits += sem.totalCreditUnits;
    }
    double cgpaVal = totalCredits > 0 ? (totalPoints / totalCredits) : 0.0;
    return double.parse(cgpaVal.toStringAsFixed(2));
  }

  @override
  void dispose() {
    _subscription?.cancel();
    super.dispose();
  }
}

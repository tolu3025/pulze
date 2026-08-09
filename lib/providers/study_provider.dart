import 'dart:async';
import 'package:flutter/material.dart';
import '../models/study_session_model.dart';
import '../services/firebase_service.dart';

class StudyProvider extends ChangeNotifier {
  final FirebaseService _firebaseService = FirebaseService();
  List<StudySession> _sessions = [];
  bool _isLoading = false;
  StreamSubscription? _subscription;

  // Active Focus Timer State
  Timer? _timer;
  int _timerSeconds = 0; // standard focus time is 25 min (1500s)
  bool _isTimerRunning = false;
  String _selectedSubject = 'General';

  List<StudySession> get sessions => _sessions;
  bool get isLoading => _isLoading;

  int get timerSeconds => _timerSeconds;
  bool get isTimerRunning => _isTimerRunning;
  String get selectedSubject => _selectedSubject;

  int get totalStudyTime {
    return _sessions.fold(0, (sum, session) => sum + session.duration);
  }

  void _setLoading(bool val) {
    _isLoading = val;
    notifyListeners();
  }

  void setSubject(String subject) {
    _selectedSubject = subject;
    notifyListeners();
  }

  void initListener() {
    _subscription?.cancel();
    _setLoading(true);
    try {
      _subscription = _firebaseService.sessionsCol.orderBy('date', descending: true).snapshots().listen((snapshot) {
        _sessions = snapshot.docs.map((doc) => StudySession.fromFirestore(doc)).toList();
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
    _sessions = [];
  }

  // Timer Control Methods
  void startTimer(int seconds) {
    if (_isTimerRunning) return;
    _timerSeconds = seconds;
    _isTimerRunning = true;
    notifyListeners();

    _timer = Timer.periodic(const Duration(seconds: 1), (timer) {
      if (_timerSeconds > 0) {
        _timerSeconds--;
        notifyListeners();
      } else {
        stopTimer(saveSession: true);
      }
    });
  }

  void pauseTimer() {
    _timer?.cancel();
    _isTimerRunning = false;
    notifyListeners();
  }

  void resumeTimer() {
    if (_isTimerRunning) return;
    _isTimerRunning = true;
    notifyListeners();

    _timer = Timer.periodic(const Duration(seconds: 1), (timer) {
      if (_timerSeconds > 0) {
        _timerSeconds--;
        notifyListeners();
      } else {
        stopTimer(saveSession: true);
      }
    });
  }

  void stopTimer({required bool saveSession}) async {
    _timer?.cancel();
    _isTimerRunning = false;
    
    if (saveSession && _timerSeconds == 0) {
      // Finished session
      await addStudySession(_selectedSubject, 1500); // 25 mins
    }
    
    _timerSeconds = 0;
    notifyListeners();
  }

  // Database operations
  Future<void> addStudySession(String subject, int durationInSeconds) async {
    final docRef = _firebaseService.sessionsCol.doc();
    final session = StudySession(
      id: docRef.id,
      subject: subject,
      duration: durationInSeconds,
      date: DateTime.now(),
    );
    await docRef.set(session.toFirestore());
  }

  Future<void> deleteStudySession(String sessionId) async {
    await _firebaseService.sessionsCol.doc(sessionId).delete();
  }

  Map<String, int> getSubjectTotals() {
    final Map<String, int> totals = {};
    for (var s in _sessions) {
      totals[s.subject] = (totals[s.subject] ?? 0) + s.duration;
    }
    return totals;
  }

  @override
  void dispose() {
    _subscription?.cancel();
    _timer?.cancel();
    super.dispose();
  }
}

import 'package:firebase_auth/firebase_auth.dart';
import 'package:flutter/material.dart';

class AuthProvider extends ChangeNotifier {
  final FirebaseAuth _auth = FirebaseAuth.instance;
  User? _user;
  bool _isLoading = false;

  AuthProvider() {
    _auth.authStateChanges().listen((User? user) {
      _user = user;
      notifyListeners();
    });
  }

  User? get user => _user;
  bool get isAuthenticated => _user != null;
  bool get isLoading => _isLoading;

  void _setLoading(bool value) {
    _isLoading = value;
    notifyListeners();
  }

  Future<void> signInWithEmailAndPassword(String email, String password) async {
    _setLoading(true);
    try {
      await _auth.signInWithEmailAndPassword(email: email, password: password)
          .timeout(const Duration(seconds: 10));
    } finally {
      _setLoading(false);
    }
  }

  Future<void> createUserWithEmailAndPassword(String email, String password, String firstName, String lastName) async {
    _setLoading(true);
    try {
      final userCredential = await _auth.createUserWithEmailAndPassword(email: email, password: password)
          .timeout(const Duration(seconds: 10));
      final displayName = '$firstName $lastName'.trim();
      if (displayName.isNotEmpty) {
        await userCredential.user?.updateDisplayName(displayName)
            .timeout(const Duration(seconds: 5));
        await userCredential.user?.reload()
            .timeout(const Duration(seconds: 5));
        _user = _auth.currentUser;
      }
    } finally {
      _setLoading(false);
    }
  }

  Future<void> updateProfileName(String firstName, String lastName) async {
    _setLoading(true);
    try {
      final displayName = '$firstName $lastName'.trim();
      await _user?.updateDisplayName(displayName)
          .timeout(const Duration(seconds: 5));
      await _user?.reload()
          .timeout(const Duration(seconds: 5));
      _user = _auth.currentUser;
      notifyListeners();
    } finally {
      _setLoading(false);
    }
  }

  Future<void> sendPasswordResetEmail(String email) async {
    _setLoading(true);
    try {
      await _auth.sendPasswordResetEmail(email: email)
          .timeout(const Duration(seconds: 10));
    } finally {
      _setLoading(false);
    }
  }

  Future<void> signOut() async {
    _setLoading(true);
    try {
      await _auth.signOut()
          .timeout(const Duration(seconds: 5));
    } finally {
      _setLoading(false);
    }
  }

  Future<void> updateProfilePhoto(String photoUrl) async {
    _setLoading(true);
    try {
      await _user?.updatePhotoURL(photoUrl)
          .timeout(const Duration(seconds: 5));
      await _user?.reload()
          .timeout(const Duration(seconds: 5));
      _user = _auth.currentUser;
      notifyListeners();
    } finally {
      _setLoading(false);
    }
  }
}

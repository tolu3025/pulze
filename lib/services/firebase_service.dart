import 'package:cloud_firestore/cloud_firestore.dart';
import 'package:firebase_auth/firebase_auth.dart';

class FirebaseService {
  final FirebaseFirestore _firestore = FirebaseFirestore.instance;
  final FirebaseAuth _auth = FirebaseAuth.instance;

  // Get current user ID
  String get uid {
    final user = _auth.currentUser;
    if (user == null) {
      throw FirebaseAuthException(
        code: 'no-user',
        message: 'No user is currently signed in.',
      );
    }
    return user.uid;
  }

  // Scoped User Document reference
  DocumentReference get userDoc => _firestore.collection('users').doc(uid);

  // Scoped Collection references
  CollectionReference get academicsCol => userDoc.collection('academic_records');
  CollectionReference get expensesCol => userDoc.collection('expenses');
  CollectionReference get habitsCol => userDoc.collection('habits');
  CollectionReference get sessionsCol => userDoc.collection('study_sessions');
  CollectionReference get tasksCol => userDoc.collection('tasks');
  CollectionReference get goalsCol => userDoc.collection('goals');
}

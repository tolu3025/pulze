import 'dart:async';
import 'package:flutter/material.dart';
import '../models/expense_model.dart';
import '../services/firebase_service.dart';
import '../services/notification_service.dart';

class ExpenseProvider extends ChangeNotifier {
  final FirebaseService _firebaseService = FirebaseService();
  List<Expense> _expenses = [];
  bool _isLoading = false;
  StreamSubscription? _subscription;

  List<Expense> get expenses => _expenses;
  bool get isLoading => _isLoading;

  double get totalExpenses {
    return _expenses.fold(0.0, (sum, item) => sum + item.amount);
  }

  void _setLoading(bool val) {
    _isLoading = val;
    notifyListeners();
  }

  void initListener() {
    _subscription?.cancel();
    _setLoading(true);
    try {
      _subscription = _firebaseService.expensesCol.orderBy('date', descending: true).snapshots().listen((snapshot) {
        _expenses = snapshot.docs.map((doc) => Expense.fromFirestore(doc)).toList();
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
    _expenses = [];
  }

  Future<void> addExpense(String title, String category, double amount, DateTime date) async {
    try {
      final docRef = _firebaseService.expensesCol.doc();
      final expense = Expense(
        id: docRef.id,
        title: title,
        category: category,
        amount: amount,
        date: date,
      );
      await docRef.set(expense.toFirestore());
    } catch (e) {
      debugPrint('Error adding expense: $e');
      rethrow;
    }
  }

  Future<void> deleteExpense(String expenseId) async {
    try {
      await _firebaseService.expensesCol.doc(expenseId).delete();
    } catch (e) {
      debugPrint('Error deleting expense: $e');
      rethrow;
    }
  }

  Map<String, double> getCategoryTotals() {
    final Map<String, double> totals = {};
    for (var exp in _expenses) {
      totals[exp.category] = (totals[exp.category] ?? 0.0) + exp.amount;
    }
    return totals;
  }

  @override
  void dispose() {
    _subscription?.cancel();
    super.dispose();
  }
}

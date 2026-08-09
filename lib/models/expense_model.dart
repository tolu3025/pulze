import 'package:cloud_firestore/cloud_firestore.dart';
import 'package:equatable/equatable.dart';

class Expense extends Equatable {
  final String id;
  final String title;
  final String category;
  final double amount;
  final DateTime date;

  const Expense({
    required this.id,
    required this.title,
    required this.category,
    required this.amount,
    required this.date,
  });

  factory Expense.fromFirestore(DocumentSnapshot doc) {
    final data = doc.data() as Map<String, dynamic>? ?? {};
    final timestamp = data['date'] as Timestamp?;
    
    return Expense(
      id: doc.id,
      title: data['title'] ?? data['description'] ?? '',
      category: data['category'] ?? 'Other',
      amount: (data['amount'] ?? data['cost'] ?? 0.0) is int 
          ? (data['amount'] ?? data['cost'] ?? 0).toDouble() 
          : (data['amount'] ?? data['cost'] ?? 0.0),
      date: timestamp != null ? timestamp.toDate() : DateTime.now(),
    );
  }

  Map<String, dynamic> toFirestore() {
    return {
      'title': title,
      'category': category,
      'amount': amount,
      'cost': amount, // Store both to be safe
      'date': Timestamp.fromDate(date),
    };
  }

  @override
  List<Object?> get props => [id, title, category, amount, date];
}

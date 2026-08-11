import 'package:cloud_firestore/cloud_firestore.dart';

class CalendarTask {
  final String id;
  final String title;
  final bool isCompleted;
  final DateTime date;

  const CalendarTask({
    required this.id,
    required this.title,
    required this.isCompleted,
    required this.date,
  });

  factory CalendarTask.fromFirestore(DocumentSnapshot doc) {
    final data = doc.data() as Map<String, dynamic>;
    return CalendarTask(
      id: doc.id,
      title: data['title'] ?? '',
      isCompleted: data['isCompleted'] ?? false,
      date: (data['date'] as Timestamp).toDate(),
    );
  }

  Map<String, dynamic> toFirestore() {
    return {
      'title': title,
      'isCompleted': isCompleted,
      'date': Timestamp.fromDate(date),
    };
  }
}

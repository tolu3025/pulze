import 'package:cloud_firestore/cloud_firestore.dart';
import 'package:equatable/equatable.dart';

class Habit extends Equatable {
  final String id;
  final String title;
  final int streak;
  final int streakCount;
  final String frequency;
  final List<DateTime> completedDates;

  const Habit({
    required this.id,
    required this.title,
    required this.streak,
    required this.streakCount,
    required this.frequency,
    required this.completedDates,
  });

  factory Habit.fromFirestore(DocumentSnapshot doc) {
    final data = doc.data() as Map<String, dynamic>? ?? {};
    
    // Parse completedDates
    final completedData = data['completedDates'] as List<dynamic>? ?? [];
    final parsedDates = completedData.map((d) {
      if (d is Timestamp) return d.toDate();
      if (d is String) return DateTime.tryParse(d) ?? DateTime.now();
      return DateTime.now();
    }).toList();

    return Habit(
      id: doc.id,
      title: data['title'] ?? data['name'] ?? '',
      streak: data['streak'] ?? data['streakCount'] ?? 0,
      streakCount: data['streakCount'] ?? data['streak'] ?? 0,
      frequency: data['frequency'] ?? 'Daily',
      completedDates: parsedDates,
    );
  }

  Map<String, dynamic> toFirestore() {
    return {
      'title': title,
      'name': title,
      'streak': streak,
      'streakCount': streakCount,
      'frequency': frequency,
      'completedDates': completedDates.map((d) => Timestamp.fromDate(d)).toList(),
    };
  }

  @override
  List<Object?> get props => [id, title, streak, streakCount, frequency, completedDates];
}

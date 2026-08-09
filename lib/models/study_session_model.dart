import 'package:cloud_firestore/cloud_firestore.dart';
import 'package:equatable/equatable.dart';

class StudySession extends Equatable {
  final String id;
  final String subject;
  final int duration; // in seconds
  final DateTime date;

  const StudySession({
    required this.id,
    required this.subject,
    required this.duration,
    required this.date,
  });

  factory StudySession.fromFirestore(DocumentSnapshot doc) {
    final data = doc.data() as Map<String, dynamic>? ?? {};
    final timestamp = data['date'] as Timestamp?;
    
    // Duration could be stored as duration (seconds) or durationMinutes
    int parsedDuration = 0;
    if (data['duration'] != null) {
      parsedDuration = data['duration'] as int;
    } else if (data['durationMinutes'] != null) {
      parsedDuration = (data['durationMinutes'] as int) * 60;
    }

    return StudySession(
      id: doc.id,
      subject: data['subject'] ?? 'General',
      duration: parsedDuration,
      date: timestamp != null ? timestamp.toDate() : DateTime.now(),
    );
  }

  Map<String, dynamic> toFirestore() {
    return {
      'subject': subject,
      'duration': duration,
      'durationMinutes': (duration / 60).round(),
      'date': Timestamp.fromDate(date),
    };
  }

  @override
  List<Object?> get props => [id, subject, duration, date];
}

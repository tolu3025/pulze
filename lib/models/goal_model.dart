import 'package:cloud_firestore/cloud_firestore.dart';
import 'package:equatable/equatable.dart';

class Goal extends Equatable {
  final String id;
  final String title;
  final String type; // 'study', 'habit', 'academic', 'expense'
  final double targetValue;
  final double currentValue;
  final String attachedActivityId; // ID of specific habit, category name, subject name, or 'all'
  final String timeframe; // 'Daily', 'Weekly', 'Monthly', 'Semester', 'All Time'
  final DateTime? deadline;
  final DateTime createdAt;
  final bool isAchieved;
  final List<int> notifiedMilestones; // List of notified thresholds e.g. [50, 80]

  const Goal({
    required this.id,
    required this.title,
    required this.type,
    required this.targetValue,
    required this.currentValue,
    required this.attachedActivityId,
    required this.timeframe,
    this.deadline,
    required this.createdAt,
    required this.isAchieved,
    required this.notifiedMilestones,
  });

  factory Goal.fromFirestore(DocumentSnapshot doc) {
    final data = doc.data() as Map<String, dynamic>? ?? {};
    final deadlineTimestamp = data['deadline'] as Timestamp?;
    final createdAtTimestamp = data['createdAt'] as Timestamp?;

    // Parse notifiedMilestones
    final milestonesData = data['notifiedMilestones'] as List<dynamic>? ?? [];
    final parsedMilestones = milestonesData.map((e) => e as int).toList();

    return Goal(
      id: doc.id,
      title: data['title'] ?? '',
      type: data['type'] ?? 'study',
      targetValue: (data['targetValue'] ?? 0.0) is int
          ? (data['targetValue'] ?? 0).toDouble()
          : (data['targetValue'] ?? 0.0),
      currentValue: (data['currentValue'] ?? 0.0) is int
          ? (data['currentValue'] ?? 0).toDouble()
          : (data['currentValue'] ?? 0.0),
      attachedActivityId: data['attachedActivityId'] ?? 'all',
      timeframe: data['timeframe'] ?? 'Weekly',
      deadline: deadlineTimestamp?.toDate(),
      createdAt: createdAtTimestamp != null ? createdAtTimestamp.toDate() : DateTime.now(),
      isAchieved: data['isAchieved'] ?? false,
      notifiedMilestones: parsedMilestones,
    );
  }

  Map<String, dynamic> toFirestore() {
    return {
      'title': title,
      'type': type,
      'targetValue': targetValue,
      'currentValue': currentValue,
      'attachedActivityId': attachedActivityId,
      'timeframe': timeframe,
      'deadline': deadline != null ? Timestamp.fromDate(deadline!) : null,
      'createdAt': Timestamp.fromDate(createdAt),
      'isAchieved': isAchieved,
      'notifiedMilestones': notifiedMilestones,
    };
  }

  Goal copyWith({
    String? id,
    String? title,
    String? type,
    double? targetValue,
    double? currentValue,
    String? attachedActivityId,
    String? timeframe,
    DateTime? deadline,
    DateTime? createdAt,
    bool? isAchieved,
    List<int>? notifiedMilestones,
  }) {
    return Goal(
      id: id ?? this.id,
      title: title ?? this.title,
      type: type ?? this.type,
      targetValue: targetValue ?? this.targetValue,
      currentValue: currentValue ?? this.currentValue,
      attachedActivityId: attachedActivityId ?? this.attachedActivityId,
      timeframe: timeframe ?? this.timeframe,
      deadline: deadline ?? this.deadline,
      createdAt: createdAt ?? this.createdAt,
      isAchieved: isAchieved ?? this.isAchieved,
      notifiedMilestones: notifiedMilestones ?? this.notifiedMilestones,
    );
  }

  @override
  List<Object?> get props => [
        id,
        title,
        type,
        targetValue,
        currentValue,
        attachedActivityId,
        timeframe,
        deadline,
        createdAt,
        isAchieved,
        notifiedMilestones,
      ];
}

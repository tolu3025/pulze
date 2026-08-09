import 'package:cloud_firestore/cloud_firestore.dart';
import 'package:equatable/equatable.dart';

class Course extends Equatable {
  final String id;
  final String name;
  final double credits; // credit units
  final String grade;
  final double gradePoints;

  const Course({
    required this.id,
    required this.name,
    required this.credits,
    required this.grade,
    required this.gradePoints,
  });

  factory Course.fromMap(Map<String, dynamic> map, String id) {
    return Course(
      id: id,
      name: map['name'] ?? '',
      credits: (map['credits'] ?? map['creditUnits'] ?? 0.0) is int 
          ? (map['credits'] ?? map['creditUnits'] ?? 0).toDouble() 
          : (map['credits'] ?? map['creditUnits'] ?? 0.0),
      grade: map['grade'] ?? '',
      gradePoints: (map['gradePoints'] ?? 0.0) is int 
          ? (map['gradePoints'] ?? 0).toDouble() 
          : (map['gradePoints'] ?? 0.0),
    );
  }

  Map<String, dynamic> toMap() {
    return {
      'name': name,
      'credits': credits,
      'grade': grade,
      'gradePoints': gradePoints,
    };
  }

  @override
  List<Object?> get props => [id, name, credits, grade, gradePoints];
}

class Semester extends Equatable {
  final String id;
  final String name;
  final double gpa;
  final double totalCreditUnits;
  final List<Course> courses;

  const Semester({
    required this.id,
    required this.name,
    required this.gpa,
    required this.totalCreditUnits,
    required this.courses,
  });

  factory Semester.fromFirestore(DocumentSnapshot doc) {
    final data = doc.data() as Map<String, dynamic>? ?? {};
    
    // Parse courses list if nested
    final coursesData = data['courses'] as List<dynamic>? ?? [];
    final parsedCourses = coursesData.map((c) {
      final cMap = c as Map<String, dynamic>;
      return Course.fromMap(cMap, cMap['id'] ?? '');
    }).toList();

    return Semester(
      id: doc.id,
      name: data['name'] ?? '',
      gpa: (data['gpa'] ?? 0.0) is int ? (data['gpa'] ?? 0).toDouble() : (data['gpa'] ?? 0.0),
      totalCreditUnits: (data['totalCreditUnits'] ?? data['creditUnits'] ?? 0.0) is int 
          ? (data['totalCreditUnits'] ?? data['creditUnits'] ?? 0).toDouble() 
          : (data['totalCreditUnits'] ?? data['creditUnits'] ?? 0.0),
      courses: parsedCourses,
    );
  }

  Map<String, dynamic> toFirestore() {
    return {
      'name': name,
      'gpa': gpa,
      'totalCreditUnits': totalCreditUnits,
      'courses': courses.map((c) => {
        'id': c.id,
        ...c.toMap(),
      }).toList(),
    };
  }

  @override
  List<Object?> get props => [id, name, gpa, totalCreditUnits, courses];
}

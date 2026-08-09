import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '../providers/academic_provider.dart';

class AcademicsScreen extends StatelessWidget {
  const AcademicsScreen({super.key});

  void _showSemesterFormDialog(BuildContext context) {
    final nameController = TextEditingController();
    showDialog(
      context: context,
      builder: (context) => AlertDialog(
        backgroundColor: const Color(0xFF1E293B),
        title: const Text('Add Semester'),
        content: TextField(
          controller: nameController,
          decoration: const InputDecoration(
            labelText: 'Semester Name (e.g. Fall 2026)',
            border: OutlineInputBorder(),
          ),
          autofocus: true,
        ),
        actions: [
          TextButton(
            onPressed: () => Navigator.pop(context),
            child: const Text('Cancel', style: TextStyle(color: Color(0xFF94A3B8))),
          ),
          ElevatedButton(
            onPressed: () {
              final name = nameController.text.trim();
              if (name.isNotEmpty) {
                Provider.of<AcademicProvider>(context, listen: false).addSemester(name);
                Navigator.pop(context);
              }
            },
            style: ElevatedButton.styleFrom(backgroundColor: const Color(0xFF6366F1)),
            child: const Text('Add', style: TextStyle(color: Colors.white)),
          ),
        ],
      ),
    );
  }

  void _showDeleteSemesterDialog(BuildContext context, String semesterId, String name) {
    showDialog(
      context: context,
      builder: (context) => AlertDialog(
        backgroundColor: const Color(0xFF1E293B),
        title: const Text('Delete Semester'),
        content: Text('Are you sure you want to delete "$name" and all its courses?'),
        actions: [
          TextButton(
            onPressed: () => Navigator.pop(context),
            child: const Text('Cancel', style: TextStyle(color: Color(0xFF94A3B8))),
          ),
          ElevatedButton(
            onPressed: () {
              Provider.of<AcademicProvider>(context, listen: false).deleteSemester(semesterId);
              Navigator.pop(context);
            },
            style: ElevatedButton.styleFrom(backgroundColor: const Color(0xFFEF4444)),
            child: const Text('Delete', style: TextStyle(color: Colors.white)),
          ),
        ],
      ),
    );
  }

  void _showCourseFormBottomSheet(BuildContext context, String semesterId) {
    final nameController = TextEditingController();
    final creditsController = TextEditingController();
    String selectedGrade = 'A';
    final Map<String, double> gradeScale = {
      'A': 4.0,
      'B': 3.0,
      'C': 2.0,
      'D': 1.0,
      'F': 0.0,
    };

    showModalBottomSheet(
      context: context,
      backgroundColor: const Color(0xFF1E293B),
      isScrollControlled: true,
      builder: (context) {
        return StatefulBuilder(
          builder: (context, setState) {
            return Padding(
              padding: EdgeInsets.only(
                bottom: MediaQuery.of(context).viewInsets.bottom,
                left: 20,
                right: 20,
                top: 20,
              ),
              child: Column(
                mainAxisSize: MainAxisSize.min,
                crossAxisAlignment: CrossAxisAlignment.stretch,
                children: [
                  const Text(
                    'Add Course',
                    style: TextStyle(fontSize: 18, fontWeight: FontWeight.bold, color: Colors.white),
                  ),
                  const SizedBox(height: 16),
                  TextField(
                    controller: nameController,
                    decoration: const InputDecoration(
                      labelText: 'Course Name (e.g. Calculus I)',
                      border: OutlineInputBorder(),
                    ),
                  ),
                  const SizedBox(height: 16),
                  TextField(
                    controller: creditsController,
                    decoration: const InputDecoration(
                      labelText: 'Credits / Units (e.g. 4.0)',
                      border: OutlineInputBorder(),
                    ),
                    keyboardType: const TextInputType.numberWithOptions(decimal: true),
                  ),
                  const SizedBox(height: 16),
                  DropdownButtonFormField<String>(
                    value: selectedGrade,
                    dropdownColor: const Color(0xFF1E293B),
                    decoration: const InputDecoration(
                      labelText: 'Grade Earned',
                      border: OutlineInputBorder(),
                    ),
                    items: gradeScale.keys.map((grade) {
                      return DropdownMenuItem(
                        value: grade,
                        child: Text('$grade (Points: ${gradeScale[grade]})'),
                      );
                    }).toList(),
                    onChanged: (val) {
                      if (val != null) {
                        setState(() {
                          selectedGrade = val;
                        });
                      }
                    },
                  ),
                  const SizedBox(height: 24),
                  ElevatedButton(
                    onPressed: () {
                      final name = nameController.text.trim();
                      final credits = double.tryParse(creditsController.text) ?? 0.0;
                      if (name.isNotEmpty && credits > 0) {
                        final pts = gradeScale[selectedGrade] ?? 0.0;
                        Provider.of<AcademicProvider>(context, listen: false)
                            .addCourse(semesterId, name, credits, selectedGrade, pts);
                        Navigator.pop(context);
                      }
                    },
                    style: ElevatedButton.styleFrom(
                      backgroundColor: const Color(0xFF6366F1),
                      padding: const EdgeInsets.symmetric(vertical: 16),
                    ),
                    child: const Text('Add Course', style: TextStyle(color: Colors.white, fontSize: 16)),
                  ),
                  const SizedBox(height: 20),
                ],
              ),
            );
          },
        );
      },
    );
  }

  void _showDeleteCourseDialog(BuildContext context, String semesterId, String courseId, String courseName) {
    showDialog(
      context: context,
      builder: (context) => AlertDialog(
        backgroundColor: const Color(0xFF1E293B),
        title: const Text('Remove Course'),
        content: Text('Are you sure you want to remove "$courseName"?'),
        actions: [
          TextButton(
            onPressed: () => Navigator.pop(context),
            child: const Text('Cancel', style: TextStyle(color: Color(0xFF94A3B8))),
          ),
          ElevatedButton(
            onPressed: () {
              Provider.of<AcademicProvider>(context, listen: false).deleteCourse(semesterId, courseId);
              Navigator.pop(context);
            },
            style: ElevatedButton.styleFrom(backgroundColor: const Color(0xFFEF4444)),
            child: const Text('Remove', style: TextStyle(color: Colors.white)),
          ),
        ],
      ),
    );
  }

  @override
  Widget build(BuildContext context) {
    final academic = Provider.of<AcademicProvider>(context);

    return Scaffold(
      appBar: AppBar(
        title: const Text('Academics'),
        actions: [
          IconButton(
            icon: const Icon(Icons.add_rounded),
            onPressed: () => _showSemesterFormDialog(context),
          ),
        ],
      ),
      body: Column(
        children: [
          // CGPA Header Banner
          Container(
            padding: const EdgeInsets.all(24.0),
            margin: const EdgeInsets.all(20.0),
            decoration: BoxDecoration(
              gradient: const LinearGradient(
                colors: [Color(0xFF6366F1), Color(0xFF4F46E5)],
                begin: Alignment.topLeft,
                end: Alignment.bottomRight,
              ),
              borderRadius: BorderRadius.circular(20),
            ),
            child: Row(
              children: [
                Expanded(
                  child: Column(
                    crossAxisAlignment: CrossAxisAlignment.start,
                    children: [
                      const Text(
                        'Cumulative GPA',
                        style: TextStyle(fontSize: 16, color: Colors.white70, fontWeight: FontWeight.bold),
                      ),
                      const SizedBox(height: 4),
                      Text(
                        academic.cgpa.toStringAsFixed(2),
                        style: const TextStyle(fontSize: 38, fontWeight: FontWeight.w900, color: Colors.white),
                      ),
                    ],
                  ),
                ),
                Container(
                  padding: const EdgeInsets.all(12),
                  decoration: BoxDecoration(
                    color: Colors.white.withOpacity(0.15),
                    shape: BoxShape.circle,
                  ),
                  child: const Icon(Icons.school, size: 36, color: Colors.white),
                ),
              ],
            ),
          ),
          
          Expanded(
            child: academic.isLoading
                ? const Center(child: CircularProgressIndicator(color: Color(0xFF6366F1)))
                : academic.semesters.isEmpty
                    ? const Center(
                        child: Text(
                          'No semesters added yet.\nTap "+" in the top right to start.',
                          style: TextStyle(color: Color(0xFF94A3B8), fontSize: 16),
                          textAlign: TextAlign.center,
                        ),
                      )
                    : ListView.builder(
                        itemCount: academic.semesters.length,
                        padding: const EdgeInsets.symmetric(horizontal: 20),
                        itemBuilder: (context, index) {
                          final sem = academic.semesters[index];
                          return Card(
                            margin: const EdgeInsets.only(bottom: 16),
                            child: ExpansionTile(
                              title: Text(
                                sem.name,
                                style: const TextStyle(fontWeight: FontWeight.bold, fontSize: 16, color: Colors.white),
                              ),
                              subtitle: Text(
                                'GPA: ${sem.gpa.toStringAsFixed(2)} | Credits: ${sem.totalCreditUnits}',
                                style: const TextStyle(color: Color(0xFF94A3B8), fontSize: 13),
                              ),
                              trailing: IconButton(
                                icon: const Icon(Icons.delete_outline, color: Color(0xFFEF4444)),
                                onPressed: () => _showDeleteSemesterDialog(context, sem.id, sem.name),
                              ),
                              children: [
                                const Divider(color: Colors.white10),
                                ...sem.courses.map((course) => ListTile(
                                      title: Text(course.name, style: const TextStyle(fontSize: 14, color: Colors.white)),
                                      subtitle: Text(
                                        'Grade: ${course.grade} (${course.gradePoints} pts) | Units: ${course.credits}',
                                        style: const TextStyle(fontSize: 12, color: Color(0xFF94A3B8)),
                                      ),
                                      trailing: IconButton(
                                        icon: const Icon(Icons.remove_circle_outline, size: 20, color: Color(0xFFEF4444)),
                                        onPressed: () => _showDeleteCourseDialog(context, sem.id, course.id, course.name),
                                      ),
                                    )),
                                Padding(
                                  padding: const EdgeInsets.all(12.0),
                                  child: TextButton.icon(
                                    onPressed: () => _showCourseFormBottomSheet(context, sem.id),
                                    icon: const Icon(Icons.add, size: 18, color: Color(0xFF818CF8)),
                                    label: const Text('Add Course', style: TextStyle(color: Color(0xFF818CF8))),
                                  ),
                                )
                              ],
                            ),
                          );
                        },
                      ),
          ),
        ],
      ),
    );
  }
}

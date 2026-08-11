import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'package:fl_chart/fl_chart.dart';
import '../providers/academic_provider.dart';
import '../models/academic_record_model.dart';

class AcademicsScreen extends StatefulWidget {
  const AcademicsScreen({super.key});

  @override
  State<AcademicsScreen> createState() => _AcademicsScreenState();
}

class _AcademicsScreenState extends State<AcademicsScreen> with SingleTickerProviderStateMixin {
  late TabController _tabController;

  @override
  void initState() {
    super.initState();
    _tabController = TabController(length: 2, vsync: this);
  }

  @override
  void dispose() {
    _tabController.dispose();
    super.dispose();
  }

  void _showSemesterFormDialog(BuildContext context) {
    final nameController = TextEditingController();
    showDialog(
      context: context,
      builder: (context) => AlertDialog(
        backgroundColor: Colors.white,
        shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(16)),
        title: const Text('Add Semester', style: TextStyle(color: Color(0xFF1C1A24))),
        content: TextField(
          controller: nameController,
          style: const TextStyle(color: Color(0xFF1C1A24)),
          decoration: InputDecoration(
            labelText: 'Semester Name (e.g. year 1)',
            labelStyle: const TextStyle(color: Color(0xFF787587)),
            enabledBorder: OutlineInputBorder(
              borderRadius: BorderRadius.circular(12),
              borderSide: const BorderSide(color: Color(0xFFEBE8E1)),
            ),
            focusedBorder: OutlineInputBorder(
              borderRadius: BorderRadius.circular(12),
              borderSide: const BorderSide(color: Color(0xFF6B4EFF), width: 2),
            ),
          ),
          autofocus: true,
        ),
        actions: [
          TextButton(
            onPressed: () => Navigator.pop(context),
            child: const Text('Cancel', style: TextStyle(color: Color(0xFF787587))),
          ),
          ElevatedButton(
            onPressed: () {
              final name = nameController.text.trim();
              if (name.isNotEmpty) {
                Provider.of<AcademicProvider>(context, listen: false).addSemester(name);
                Navigator.pop(context);
              }
            },
            style: ElevatedButton.styleFrom(
              backgroundColor: const Color(0xFF6B4EFF),
              shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(12)),
            ),
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
        backgroundColor: Colors.white,
        shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(16)),
        title: const Text('Delete Semester', style: TextStyle(color: Color(0xFF1C1A24))),
        content: Text('Are you sure you want to delete "$name" and all its courses?', style: const TextStyle(color: Color(0xFF787587))),
        actions: [
          TextButton(
            onPressed: () => Navigator.pop(context),
            child: const Text('Cancel', style: TextStyle(color: Color(0xFF787587))),
          ),
          ElevatedButton(
            onPressed: () {
              Provider.of<AcademicProvider>(context, listen: false).deleteSemester(semesterId);
              Navigator.pop(context);
            },
            style: ElevatedButton.styleFrom(
              backgroundColor: const Color(0xFFBA1A1A),
              shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(12)),
            ),
            child: const Text('Delete', style: TextStyle(color: Colors.white)),
          ),
        ],
      ),
    );
  }

  void _showEditSemesterDialog(BuildContext context, String semesterId, String currentName) {
    final nameController = TextEditingController(text: currentName);
    showDialog(
      context: context,
      builder: (context) => AlertDialog(
        backgroundColor: Colors.white,
        shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(16)),
        title: const Text('Edit Semester', style: TextStyle(color: Color(0xFF1C1A24))),
        content: TextField(
          controller: nameController,
          style: const TextStyle(color: Color(0xFF1C1A24)),
          decoration: InputDecoration(
            labelText: 'Semester Name',
            labelStyle: const TextStyle(color: Color(0xFF787587)),
            enabledBorder: OutlineInputBorder(
              borderRadius: BorderRadius.circular(12),
              borderSide: const BorderSide(color: Color(0xFFEBE8E1)),
            ),
            focusedBorder: OutlineInputBorder(
              borderRadius: BorderRadius.circular(12),
              borderSide: const BorderSide(color: Color(0xFF6B4EFF), width: 2),
            ),
          ),
          autofocus: true,
        ),
        actions: [
          TextButton(
            onPressed: () => Navigator.pop(context),
            child: const Text('Cancel', style: TextStyle(color: Color(0xFF787587))),
          ),
          ElevatedButton(
            onPressed: () {
              final name = nameController.text.trim();
              if (name.isNotEmpty) {
                Provider.of<AcademicProvider>(context, listen: false).updateSemester(semesterId, name);
                Navigator.pop(context);
              }
            },
            style: ElevatedButton.styleFrom(
              backgroundColor: const Color(0xFF6B4EFF),
              shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(12)),
            ),
            child: const Text('Save', style: TextStyle(color: Colors.white)),
          ),
        ],
      ),
    );
  }

  void _showEditCourseBottomSheet(BuildContext context, String semesterId, Course course) {
    final nameController = TextEditingController(text: course.name);
    final creditsController = TextEditingController(text: course.credits.toInt().toString());
    String selectedGrade = course.grade;
    final Map<String, double> gradeScale = {
      'A': 5.0,
      'B': 4.0,
      'C': 3.0,
      'D': 2.0,
      'E': 1.0,
      'F': 0.0,
    };

    showModalBottomSheet(
      context: context,
      backgroundColor: Colors.white,
      shape: const RoundedRectangleBorder(borderRadius: BorderRadius.vertical(top: Radius.circular(20))),
      isScrollControlled: true,
      builder: (context) {
        return StatefulBuilder(
          builder: (context, setState) {
            return Padding(
              padding: EdgeInsets.only(
                bottom: MediaQuery.of(context).viewInsets.bottom,
                left: 20,
                right: 20,
                top: 24,
              ),
              child: Column(
                mainAxisSize: MainAxisSize.min,
                crossAxisAlignment: CrossAxisAlignment.stretch,
                children: [
                  const Text(
                    'Edit Course',
                    style: TextStyle(fontSize: 18, fontWeight: FontWeight.bold, color: Color(0xFF1C1A24)),
                  ),
                  const SizedBox(height: 16),
                  TextField(
                    controller: nameController,
                    style: const TextStyle(color: Color(0xFF1C1A24)),
                    decoration: InputDecoration(
                      labelText: 'Course Name',
                      labelStyle: const TextStyle(color: Color(0xFF787587)),
                      enabledBorder: OutlineInputBorder(
                        borderRadius: BorderRadius.circular(12),
                        borderSide: const BorderSide(color: Color(0xFFEBE8E1)),
                      ),
                      focusedBorder: OutlineInputBorder(
                        borderRadius: BorderRadius.circular(12),
                        borderSide: const BorderSide(color: Color(0xFF6B4EFF), width: 2),
                      ),
                    ),
                  ),
                  const SizedBox(height: 16),
                  TextField(
                    controller: creditsController,
                    style: const TextStyle(color: Color(0xFF1C1A24)),
                    decoration: InputDecoration(
                      labelText: 'Credit Units',
                      labelStyle: const TextStyle(color: Color(0xFF787587)),
                      enabledBorder: OutlineInputBorder(
                        borderRadius: BorderRadius.circular(12),
                        borderSide: const BorderSide(color: Color(0xFFEBE8E1)),
                      ),
                      focusedBorder: OutlineInputBorder(
                        borderRadius: BorderRadius.circular(12),
                        borderSide: const BorderSide(color: Color(0xFF6B4EFF), width: 2),
                      ),
                    ),
                    keyboardType: const TextInputType.numberWithOptions(decimal: true),
                  ),
                  const SizedBox(height: 16),
                  DropdownButtonFormField<String>(
                    value: selectedGrade,
                    dropdownColor: Colors.white,
                    style: const TextStyle(color: Color(0xFF1C1A24)),
                    decoration: InputDecoration(
                      labelText: 'Grade Earned',
                      labelStyle: const TextStyle(color: Color(0xFF787587)),
                      enabledBorder: OutlineInputBorder(
                        borderRadius: BorderRadius.circular(12),
                        borderSide: const BorderSide(color: Color(0xFFEBE8E1)),
                      ),
                      focusedBorder: OutlineInputBorder(
                        borderRadius: BorderRadius.circular(12),
                        borderSide: const BorderSide(color: Color(0xFF6B4EFF), width: 2),
                      ),
                    ),
                    items: gradeScale.keys.map((grade) {
                      return DropdownMenuItem(
                        value: grade,
                        child: Text('$grade (${gradeScale[grade]} Points)'),
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
                            .updateCourse(semesterId, course.id, name, credits, selectedGrade, pts);
                        Navigator.pop(context);
                      }
                    },
                    style: ElevatedButton.styleFrom(
                      backgroundColor: const Color(0xFF6B4EFF),
                      padding: const EdgeInsets.symmetric(vertical: 16),
                      shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(12)),
                    ),
                    child: const Text('Save Changes', style: TextStyle(color: Colors.white, fontSize: 16, fontWeight: FontWeight.bold)),
                  ),
                  const SizedBox(height: 24),
                ],
              ),
            );
          },
        );
      },
    );
  }

  void _showCourseFormBottomSheet(BuildContext context, String semesterId) {
    final nameController = TextEditingController();
    final creditsController = TextEditingController();
    String selectedGrade = 'A';
    final Map<String, double> gradeScale = {
      'A': 5.0,
      'B': 4.0,
      'C': 3.0,
      'D': 2.0,
      'E': 1.0,
      'F': 0.0,
    };

    showModalBottomSheet(
      context: context,
      backgroundColor: Colors.white,
      shape: const RoundedRectangleBorder(borderRadius: BorderRadius.vertical(top: Radius.circular(20))),
      isScrollControlled: true,
      builder: (context) {
        return StatefulBuilder(
          builder: (context, setState) {
            return Padding(
              padding: EdgeInsets.only(
                bottom: MediaQuery.of(context).viewInsets.bottom,
                left: 20,
                right: 20,
                top: 24,
              ),
              child: Column(
                mainAxisSize: MainAxisSize.min,
                crossAxisAlignment: CrossAxisAlignment.stretch,
                children: [
                  const Text(
                    'Add Course',
                    style: TextStyle(fontSize: 18, fontWeight: FontWeight.bold, color: Color(0xFF1C1A24)),
                  ),
                  const SizedBox(height: 16),
                  TextField(
                    controller: nameController,
                    style: const TextStyle(color: Color(0xFF1C1A24)),
                    decoration: InputDecoration(
                      labelText: 'Course Name (e.g. data)',
                      labelStyle: const TextStyle(color: Color(0xFF787587)),
                      enabledBorder: OutlineInputBorder(
                        borderRadius: BorderRadius.circular(12),
                        borderSide: const BorderSide(color: Color(0xFFEBE8E1)),
                      ),
                      focusedBorder: OutlineInputBorder(
                        borderRadius: BorderRadius.circular(12),
                        borderSide: const BorderSide(color: Color(0xFF6B4EFF), width: 2),
                      ),
                    ),
                  ),
                  const SizedBox(height: 16),
                  TextField(
                    controller: creditsController,
                    style: const TextStyle(color: Color(0xFF1C1A24)),
                    decoration: InputDecoration(
                      labelText: 'Credit Units (e.g. 2)',
                      labelStyle: const TextStyle(color: Color(0xFF787587)),
                      enabledBorder: OutlineInputBorder(
                        borderRadius: BorderRadius.circular(12),
                        borderSide: const BorderSide(color: Color(0xFFEBE8E1)),
                      ),
                      focusedBorder: OutlineInputBorder(
                        borderRadius: BorderRadius.circular(12),
                        borderSide: const BorderSide(color: Color(0xFF6B4EFF), width: 2),
                      ),
                    ),
                    keyboardType: const TextInputType.numberWithOptions(decimal: true),
                  ),
                  const SizedBox(height: 16),
                  DropdownButtonFormField<String>(
                    value: selectedGrade,
                    dropdownColor: Colors.white,
                    style: const TextStyle(color: Color(0xFF1C1A24)),
                    decoration: InputDecoration(
                      labelText: 'Grade Earned',
                      labelStyle: const TextStyle(color: Color(0xFF787587)),
                      enabledBorder: OutlineInputBorder(
                        borderRadius: BorderRadius.circular(12),
                        borderSide: const BorderSide(color: Color(0xFFEBE8E1)),
                      ),
                      focusedBorder: OutlineInputBorder(
                        borderRadius: BorderRadius.circular(12),
                        borderSide: const BorderSide(color: Color(0xFF6B4EFF), width: 2),
                      ),
                    ),
                    items: gradeScale.keys.map((grade) {
                      return DropdownMenuItem(
                        value: grade,
                        child: Text('$grade (${gradeScale[grade]} Points)'),
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
                      backgroundColor: const Color(0xFF6B4EFF),
                      padding: const EdgeInsets.symmetric(vertical: 16),
                      shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(12)),
                    ),
                    child: const Text('Add Course', style: TextStyle(color: Colors.white, fontSize: 16, fontWeight: FontWeight.bold)),
                  ),
                  const SizedBox(height: 24),
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
        backgroundColor: Colors.white,
        shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(16)),
        title: const Text('Remove Course', style: TextStyle(color: Color(0xFF1C1A24))),
        content: Text('Are you sure you want to remove "$courseName"?', style: const TextStyle(color: Color(0xFF787587))),
        actions: [
          TextButton(
            onPressed: () => Navigator.pop(context),
            child: const Text('Cancel', style: TextStyle(color: Color(0xFF787587))),
          ),
          ElevatedButton(
            onPressed: () {
              Provider.of<AcademicProvider>(context, listen: false).deleteCourse(semesterId, courseId);
              Navigator.pop(context);
            },
            style: ElevatedButton.styleFrom(
              backgroundColor: const Color(0xFFBA1A1A),
              shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(12)),
            ),
            child: const Text('Remove', style: TextStyle(color: Colors.white)),
          ),
        ],
      ),
    );
  }

  @override
  Widget build(BuildContext context) {
    final academic = Provider.of<AcademicProvider>(context);
    final cgpaValue = academic.cgpa > 0 ? academic.cgpa.toStringAsFixed(2) : '5.00';

    return Scaffold(
      backgroundColor: const Color(0xFFF9F8F6),
      appBar: AppBar(
        backgroundColor: const Color(0xFFF9F8F6),
        title: const Text(
          'Academics Manager',
          style: TextStyle(
            color: Color(0xFF1C1A24),
            fontSize: 22,
            fontWeight: FontWeight.bold,
          ),
        ),
        bottom: TabBar(
          controller: _tabController,
          indicatorColor: const Color(0xFF6B4EFF),
          indicatorWeight: 3,
          labelColor: const Color(0xFF6B4EFF),
          unselectedLabelColor: const Color(0xFF787587),
          labelStyle: const TextStyle(fontWeight: FontWeight.bold, fontSize: 14),
          tabs: const [
            Tab(text: 'Semesters'),
            Tab(text: 'GPA Trend'),
          ],
        ),
      ),
      body: TabBarView(
        controller: _tabController,
        children: [
          // Semesters Tab
          SingleChildScrollView(
            padding: const EdgeInsets.all(20.0),
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                // CUMULATIVE CGPA Card
                Container(
                  width: double.infinity,
                  padding: const EdgeInsets.all(20.0),
                  decoration: BoxDecoration(
                    color: Colors.white,
                    borderRadius: BorderRadius.circular(16),
                    border: Border.all(color: const Color(0xFFEBE8E1)),
                  ),
                  child: Column(
                    crossAxisAlignment: CrossAxisAlignment.start,
                    children: [
                      const Text(
                        'CUMULATIVE CGPA',
                        style: TextStyle(
                          fontSize: 11,
                          fontWeight: FontWeight.bold,
                          letterSpacing: 0.8,
                          color: Color(0xFF787587),
                        ),
                      ),
                      const SizedBox(height: 12),
                      Row(
                        crossAxisAlignment: CrossAxisAlignment.baseline,
                        textBaseline: TextBaseline.alphabetic,
                        children: [
                          Text(
                            cgpaValue,
                            style: const TextStyle(
                              fontSize: 42,
                              fontWeight: FontWeight.w900,
                              color: Color(0xFF6B4EFF),
                            ),
                          ),
                          const SizedBox(width: 8),
                          const Text(
                            '/ 5.00',
                            style: TextStyle(
                              fontSize: 16,
                              fontWeight: FontWeight.w500,
                              color: Color(0xFF787587),
                            ),
                          ),
                        ],
                      ),
                    ],
                  ),
                ),
                const SizedBox(height: 28),

                // SEMESTERS Section Header
                Row(
                  mainAxisAlignment: MainAxisAlignment.spaceBetween,
                  children: [
                    const Text(
                      'SEMESTERS',
                      style: TextStyle(
                        fontSize: 11,
                        fontWeight: FontWeight.bold,
                        letterSpacing: 0.8,
                        color: Color(0xFF787587),
                      ),
                    ),
                    IconButton(
                      icon: const Icon(Icons.add, color: Color(0xFF6B4EFF), size: 24),
                      onPressed: () => _showSemesterFormDialog(context),
                    ),
                  ],
                ),
                const SizedBox(height: 12),

                // Semesters List
                academic.isLoading
                    ? const Center(child: CircularProgressIndicator(color: Color(0xFF6B4EFF)))
                    : academic.semesters.isEmpty
                        ? Container(
                            width: double.infinity,
                            padding: const EdgeInsets.all(24),
                            decoration: BoxDecoration(
                              color: Colors.white,
                              borderRadius: BorderRadius.circular(16),
                              border: Border.all(color: const Color(0xFFEBE8E1)),
                            ),
                            child: Column(
                              children: [
                                const Text(
                                  'No semesters added yet.',
                                  style: TextStyle(
                                    fontSize: 16,
                                    color: Color(0xFF787587),
                                  ),
                                ),
                                const SizedBox(height: 16),
                                ElevatedButton.icon(
                                  onPressed: () => _showSemesterFormDialog(context),
                                  icon: const Icon(Icons.add, color: Colors.white),
                                  label: const Text('Add Semester', style: TextStyle(color: Colors.white, fontWeight: FontWeight.bold)),
                                  style: ElevatedButton.styleFrom(
                                    backgroundColor: const Color(0xFF6B4EFF),
                                    shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(12)),
                                    minimumSize: const Size(double.infinity, 48),
                                  ),
                                ),
                              ],
                            ),
                          )
                        : ListView.builder(
                            shrinkWrap: true,
                            physics: const NeverScrollableScrollPhysics(),
                            itemCount: academic.semesters.length,
                            itemBuilder: (context, index) {
                              final sem = academic.semesters[index];
                              return Container(
                                margin: const EdgeInsets.only(bottom: 16),
                                padding: const EdgeInsets.all(16),
                                decoration: BoxDecoration(
                                  color: Colors.white,
                                  borderRadius: BorderRadius.circular(16),
                                  border: Border.all(color: const Color(0xFFEBE8E1)),
                                ),
                                child: Column(
                                  crossAxisAlignment: CrossAxisAlignment.start,
                                  children: [
                                    Row(
                                      mainAxisAlignment: MainAxisAlignment.spaceBetween,
                                      children: [
                                        Text(
                                          sem.name,
                                          style: const TextStyle(
                                            fontSize: 18,
                                            fontWeight: FontWeight.bold,
                                            color: Color(0xFF1C1A24),
                                          ),
                                        ),
                                        Row(
                                          children: [
                                            IconButton(
                                              icon: const Icon(Icons.edit_outlined, color: Color(0xFF787587), size: 20),
                                              onPressed: () => _showEditSemesterDialog(context, sem.id, sem.name),
                                            ),
                                            IconButton(
                                              icon: const Icon(Icons.delete_outline, color: Color(0xFFE07A5F), size: 20),
                                              onPressed: () => _showDeleteSemesterDialog(context, sem.id, sem.name),
                                            ),
                                          ],
                                        ),
                                      ],
                                    ),
                                    Text(
                                      'GPA: ${sem.gpa.toStringAsFixed(2)}   ${sem.totalCreditUnits.toInt()} Credit Units',
                                      style: const TextStyle(
                                        color: Color(0xFF6B4EFF),
                                        fontWeight: FontWeight.bold,
                                        fontSize: 13,
                                      ),
                                    ),
                                    const Divider(height: 24, color: Color(0xFFEBE8E1)),
                                    ...sem.courses.map((course) => ListTile(
                                          contentPadding: EdgeInsets.zero,
                                          leading: CircleAvatar(
                                            backgroundColor: const Color(0xFFF1ECFA),
                                            child: Text(
                                              course.grade,
                                              style: const TextStyle(color: Color(0xFF6B4EFF), fontWeight: FontWeight.bold),
                                            ),
                                          ),
                                          title: Text(
                                            course.name,
                                            style: const TextStyle(fontWeight: FontWeight.bold, color: Color(0xFF1C1A24)),
                                          ),
                                          subtitle: Text(
                                            'COS 201 • ${course.credits.toInt()} Credit Units',
                                            style: const TextStyle(color: Color(0xFF787587), fontSize: 12),
                                          ),
                                          trailing: Row(
                                            mainAxisSize: MainAxisSize.min,
                                            children: [
                                              IconButton(
                                                icon: const Icon(Icons.edit_outlined, color: Color(0xFF787587), size: 18),
                                                onPressed: () => _showEditCourseBottomSheet(context, sem.id, course),
                                              ),
                                              IconButton(
                                                icon: const Icon(Icons.delete_outline, color: Color(0xFFE07A5F), size: 18),
                                                onPressed: () => _showDeleteCourseDialog(context, sem.id, course.id, course.name),
                                              ),
                                            ],
                                          ),
                                        )),
                                    const SizedBox(height: 12),
                                    OutlinedButton.icon(
                                      onPressed: () => _showCourseFormBottomSheet(context, sem.id),
                                      icon: const Icon(Icons.add, color: Color(0xFF6B4EFF)),
                                      label: const Text('Add Course', style: TextStyle(color: Color(0xFF6B4EFF), fontWeight: FontWeight.bold)),
                                      style: OutlinedButton.styleFrom(
                                        side: const BorderSide(color: Color(0xFF6B4EFF)),
                                        shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(12)),
                                        minimumSize: const Size(double.infinity, 48),
                                      ),
                                    ),
                                  ],
                                ),
                              );
                            },
                          ),
              ],
            ),
          ),
          
          // GPA Trend Tab
          academic.semesters.isEmpty
              ? const Center(
                  child: Text(
                    'No semesters added yet.',
                    style: TextStyle(color: Color(0xFF787587), fontSize: 16),
                  ),
                )
              : Padding(
                  padding: const EdgeInsets.all(24.0),
                  child: Column(
                    crossAxisAlignment: CrossAxisAlignment.start,
                    children: [
                      const Text(
                        'GPA Trend over Semesters',
                        style: TextStyle(
                          fontSize: 16,
                          fontWeight: FontWeight.bold,
                          color: Color(0xFF1C1A24),
                        ),
                      ),
                      const SizedBox(height: 32),
                      Expanded(
                        child: LineChart(
                          LineChartData(
                            lineTouchData: LineTouchData(
                              touchTooltipData: LineTouchTooltipData(
                                tooltipBgColor: const Color(0xFF1C1A24),
                                tooltipRoundedRadius: 8,
                                getTooltipItems: (touchedSpots) {
                                  return touchedSpots.map((spot) {
                                    final semName = academic.semesters[spot.x.toInt()].name;
                                    return LineTooltipItem(
                                      '$semName\n${spot.y.toStringAsFixed(2)} GPA',
                                      const TextStyle(
                                        color: Colors.white,
                                        fontWeight: FontWeight.bold,
                                        fontSize: 12,
                                      ),
                                    );
                                  }).toList();
                                },
                              ),
                            ),
                            gridData: const FlGridData(show: false),
                            titlesData: FlTitlesData(
                              leftTitles: AxisTitles(
                                sideTitles: SideTitles(
                                  showTitles: true,
                                  reservedSize: 40,
                                  getTitlesWidget: (value, meta) {
                                    return Text(
                                      value.toStringAsFixed(1),
                                      style: const TextStyle(color: Color(0xFF787587), fontSize: 12),
                                    );
                                  },
                                ),
                              ),
                              bottomTitles: AxisTitles(
                                sideTitles: SideTitles(
                                  showTitles: true,
                                  getTitlesWidget: (value, meta) {
                                    final index = value.toInt();
                                    if (index >= 0 && index < academic.semesters.length) {
                                      return Padding(
                                        padding: const EdgeInsets.only(top: 8.0),
                                        child: Text(
                                          academic.semesters[index].name,
                                          style: const TextStyle(color: Color(0xFF787587), fontSize: 10),
                                        ),
                                      );
                                    }
                                    return const Text('');
                                  },
                                ),
                              ),
                              rightTitles: const AxisTitles(sideTitles: SideTitles(showTitles: false)),
                              topTitles: const AxisTitles(sideTitles: SideTitles(showTitles: false)),
                            ),
                            borderData: FlBorderData(show: false),
                            minX: 0,
                            maxX: (academic.semesters.length - 1).toDouble() > 0 ? (academic.semesters.length - 1).toDouble() : 1.0,
                            minY: 0,
                            maxY: 5.0,
                            lineBarsData: [
                              LineChartBarData(
                                spots: List.generate(
                                  academic.semesters.length,
                                  (index) => FlSpot(
                                    index.toDouble(),
                                    academic.semesters[index].gpa,
                                  ),
                                ),
                                isCurved: true,
                                gradient: const LinearGradient(
                                  colors: [Color(0xFF6B4EFF), Color(0xFF00BFA5)],
                                ),
                                barWidth: 4,
                                isStrokeCapRound: true,
                                dotData: FlDotData(
                                  show: true,
                                  getDotPainter: (spot, percent, barData, index) => FlDotCirclePainter(
                                    radius: 6,
                                    color: Colors.white,
                                    strokeWidth: 3,
                                    strokeColor: const Color(0xFF6B4EFF),
                                  ),
                                ),
                                belowBarData: BarAreaData(
                                  show: true,
                                  gradient: LinearGradient(
                                    colors: [
                                      const Color(0xFF6B4EFF).withOpacity(0.2),
                                      const Color(0xFF00BFA5).withOpacity(0.0),
                                    ],
                                    begin: Alignment.topCenter,
                                    end: Alignment.bottomCenter,
                                  ),
                                ),
                              ),
                            ],
                          ),
                        ),
                      ),
                    ],
                  ),
                ),
        ],
      ),
    );
  }
}

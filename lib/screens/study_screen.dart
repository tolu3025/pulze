import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'package:intl/intl.dart';
import '../providers/study_provider.dart';
import '../providers/goal_provider.dart';
import '../models/models.dart';

class StudyScreen extends StatefulWidget {
  const StudyScreen({super.key});

  @override
  State<StudyScreen> createState() => _StudyScreenState();
}

class _StudyScreenState extends State<StudyScreen> with SingleTickerProviderStateMixin {
  late TabController _tabController;
  final List<String> _modes = ['Self Study', 'Library', 'Assignment', 'Exam Prep'];
  String _selectedMode = 'Self Study';
  int _durationMinutes = 25;

  @override
  void initState() {
    super.initState();
    _tabController = TabController(length: 3, vsync: this);
  }

  @override
  void dispose() {
    _tabController.dispose();
    super.dispose();
  }

  void _showEditDurationDialog(BuildContext context, StudyProvider study) {
    final controller = TextEditingController(text: '$_durationMinutes');
    showDialog(
      context: context,
      builder: (context) => AlertDialog(
        backgroundColor: Colors.white,
        shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(16)),
        title: const Text('Set Timer Duration', style: TextStyle(color: Color(0xFF1C1A24))),
        content: TextField(
          controller: controller,
          keyboardType: TextInputType.number,
          style: const TextStyle(color: Color(0xFF1C1A24)),
          decoration: const InputDecoration(
            labelText: 'Duration in Minutes',
            border: OutlineInputBorder(),
          ),
        ),
        actions: [
          TextButton(
            onPressed: () => Navigator.pop(context),
            child: const Text('Cancel', style: TextStyle(color: Color(0xFF787587))),
          ),
          ElevatedButton(
            onPressed: () {
              final dur = int.tryParse(controller.text) ?? 25;
              setState(() {
                _durationMinutes = dur;
              });
              Navigator.pop(context);
            },
            style: ElevatedButton.styleFrom(backgroundColor: const Color(0xFF6B4EFF)),
            child: const Text('Save', style: TextStyle(color: Colors.white)),
          ),
        ],
      ),
    );
  }

  String _formatSeconds(int seconds) {
    final m = seconds ~/ 60;
    final s = seconds % 60;
    return '${m.toString().padLeft(2, '0')}:${s.toString().padLeft(2, '0')}';
  }

  @override
  Widget build(BuildContext context) {
    final study = Provider.of<StudyProvider>(context);

    return Scaffold(
      backgroundColor: const Color(0xFFF9F8F6),
      appBar: AppBar(
        backgroundColor: const Color(0xFFF9F8F6),
        title: const Text(
          'Focus & Study Log',
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
            Tab(text: 'Pomodoro Timer'),
            Tab(text: 'History & Analytics'),
            Tab(text: 'Study Goals'),
          ],
        ),
      ),
      body: TabBarView(
        controller: _tabController,
        children: [
          // Pomodoro Timer Tab
          SingleChildScrollView(
            padding: const EdgeInsets.symmetric(horizontal: 20.0, vertical: 32.0),
            child: Column(
              children: [
                // Big Circular Timer Ring
                GestureDetector(
                  onTap: () {
                    if (!study.isTimerRunning) {
                      _showEditDurationDialog(context, study);
                    }
                  },
                  child: Stack(
                    alignment: Alignment.center,
                    children: [
                      Container(
                        width: 240,
                        height: 240,
                        decoration: BoxDecoration(
                          shape: BoxShape.circle,
                          border: Border.all(
                            color: const Color(0xFF6B4EFF),
                            width: 6,
                          ),
                        ),
                      ),
                      Column(
                        mainAxisSize: MainAxisSize.min,
                        children: [
                          Row(
                            mainAxisSize: MainAxisSize.min,
                            children: [
                              Text(
                                study.timerSeconds > 0
                                    ? _formatSeconds(study.timerSeconds)
                                    : '${_durationMinutes.toString().padLeft(2, '0')}:00',
                                style: const TextStyle(
                                  fontSize: 48,
                                  fontWeight: FontWeight.w900,
                                  color: Color(0xFF1C1A24),
                                ),
                              ),
                              const SizedBox(width: 6),
                              const Icon(Icons.edit_outlined, color: Color(0xFF6B4EFF), size: 22),
                            ],
                          ),
                          const SizedBox(height: 8),
                          Text(
                            study.isTimerRunning
                                ? 'RUNNING'
                                : (study.timerSeconds > 0 ? 'PAUSED' : 'PAUSED'),
                            style: const TextStyle(
                              fontSize: 12,
                              fontWeight: FontWeight.bold,
                              letterSpacing: 1.5,
                              color: Color(0xFF787587),
                            ),
                          ),
                          const SizedBox(height: 4),
                          const Text(
                            'Tap to edit duration',
                            style: TextStyle(
                              fontSize: 11,
                              color: Color(0xFF787587),
                            ),
                          ),
                        ],
                      ),
                    ],
                  ),
                ),
                const SizedBox(height: 36),

                // Active Selected Mode Display Box
                Container(
                  width: double.infinity,
                  padding: const EdgeInsets.symmetric(vertical: 16),
                  decoration: BoxDecoration(
                    color: Colors.white,
                    borderRadius: BorderRadius.circular(16),
                    border: Border.all(color: const Color(0xFFEBE8E1)),
                  ),
                  child: Center(
                    child: Text(
                      _selectedMode,
                      style: const TextStyle(
                        fontSize: 16,
                        fontWeight: FontWeight.bold,
                        color: Color(0xFF1C1A24),
                      ),
                    ),
                  ),
                ),
                const SizedBox(height: 20),

                // Mode Pills Selector Row
                SingleChildScrollView(
                  scrollDirection: Axis.horizontal,
                  child: Row(
                    children: _modes.map((mode) {
                      final isSelected = mode == _selectedMode;
                      return GestureDetector(
                        onTap: () {
                          setState(() {
                            _selectedMode = mode;
                          });
                          study.setSubject(mode);
                        },
                        child: Container(
                          margin: const EdgeInsets.only(right: 10),
                          padding: const EdgeInsets.symmetric(horizontal: 16, vertical: 10),
                          decoration: BoxDecoration(
                            color: isSelected ? const Color(0xFFF1ECFA) : Colors.white,
                            borderRadius: BorderRadius.circular(12),
                            border: Border.all(
                              color: isSelected ? const Color(0xFF6B4EFF) : const Color(0xFFEBE8E1),
                              width: isSelected ? 1.5 : 1,
                            ),
                          ),
                          child: Row(
                            children: [
                              if (isSelected) ...[
                                const Icon(Icons.check, size: 16, color: Color(0xFF6B4EFF)),
                                const SizedBox(width: 6),
                              ],
                              Text(
                                mode,
                                style: TextStyle(
                                  fontSize: 13,
                                  fontWeight: isSelected ? FontWeight.bold : FontWeight.w500,
                                  color: isSelected ? const Color(0xFF6B4EFF) : const Color(0xFF1C1A24),
                                ),
                              ),
                            ],
                          ),
                        ),
                      );
                    }).toList(),
                  ),
                ),
                const SizedBox(height: 48),

                // Action Control Buttons: Stop (Orange Square) & Play (Teal Triangle)
                Row(
                  mainAxisAlignment: MainAxisAlignment.center,
                  children: [
                    // Stop Button
                    GestureDetector(
                      onTap: () {
                        study.stopTimer(saveSession: false);
                      },
                      child: Container(
                        width: 64,
                        height: 64,
                        decoration: const BoxDecoration(
                          color: Color(0xFFE07A5F),
                          shape: BoxShape.circle,
                        ),
                        child: const Icon(Icons.stop_rounded, color: Colors.white, size: 32),
                      ),
                    ),
                    const SizedBox(width: 32),

                    // Play / Pause Button
                    GestureDetector(
                      onTap: () {
                        if (study.isTimerRunning) {
                          study.pauseTimer();
                        } else if (study.timerSeconds > 0) {
                          study.resumeTimer();
                        } else {
                          study.startTimer(_durationMinutes * 60);
                        }
                      },
                      child: Container(
                        width: 72,
                        height: 72,
                        decoration: const BoxDecoration(
                          color: Color(0xFF00BFA5),
                          shape: BoxShape.circle,
                        ),
                        child: Icon(
                          study.isTimerRunning ? Icons.pause_rounded : Icons.play_arrow_rounded,
                          color: Colors.white,
                          size: 40,
                        ),
                      ),
                    ),
                  ],
                ),
              ],
            ),
          ),

          // History & Analytics Tab
          study.isLoading
              ? const Center(child: CircularProgressIndicator(color: Color(0xFF6B4EFF)))
              : study.sessions.isEmpty
                  ? const Center(
                      child: Text(
                        'No study sessions logged yet.',
                        style: TextStyle(color: Color(0xFF787587), fontSize: 16),
                      ),
                    )
                  : ListView.builder(
                      itemCount: study.sessions.length,
                      padding: const EdgeInsets.all(20),
                      itemBuilder: (context, index) {
                        final session = study.sessions[index];
                        final minStr = (session.duration / 60).toStringAsFixed(1);
                        return Container(
                          margin: const EdgeInsets.only(bottom: 12),
                          padding: const EdgeInsets.all(16),
                          decoration: BoxDecoration(
                            color: Colors.white,
                            borderRadius: BorderRadius.circular(16),
                            border: Border.all(color: const Color(0xFFEBE8E1)),
                          ),
                          child: Row(
                            children: [
                              const CircleAvatar(
                                backgroundColor: Color(0xFFF1ECFA),
                                child: Icon(Icons.timer_outlined, color: Color(0xFF6B4EFF), size: 20),
                              ),
                              const SizedBox(width: 16),
                              Expanded(
                                child: Column(
                                  crossAxisAlignment: CrossAxisAlignment.start,
                                  children: [
                                    Text(
                                      session.subject,
                                      style: const TextStyle(fontWeight: FontWeight.bold, color: Color(0xFF1C1A24), fontSize: 15),
                                    ),
                                    Text(
                                      DateFormat('MMM d, y @ h:mm a').format(session.date),
                                      style: const TextStyle(color: Color(0xFF787587), fontSize: 12),
                                    ),
                                  ],
                                ),
                              ),
                              Text(
                                '$minStr min',
                                style: const TextStyle(color: Color(0xFF6B4EFF), fontWeight: FontWeight.bold, fontSize: 15),
                              ),
                              const SizedBox(width: 8),
                              IconButton(
                                icon: const Icon(Icons.delete_outline, color: Color(0xFFE07A5F), size: 20),
                                onPressed: () {
                                  showDialog(
                                    context: context,
                                    builder: (context) => AlertDialog(
                                      backgroundColor: Colors.white,
                                      title: const Text('Delete Session', style: TextStyle(color: Color(0xFF1C1A24))),
                                      content: const Text('Are you sure you want to delete this study session?', style: TextStyle(color: Color(0xFF787587))),
                                      actions: [
                                        TextButton(
                                          onPressed: () => Navigator.pop(context),
                                          child: const Text('Cancel', style: TextStyle(color: Color(0xFF787587))),
                                        ),
                                        ElevatedButton(
                                          onPressed: () {
                                            study.deleteStudySession(session.id);
                                            Navigator.pop(context);
                                          },
                                          style: ElevatedButton.styleFrom(backgroundColor: const Color(0xFFBA1A1A)),
                                          child: const Text('Delete', style: TextStyle(color: Colors.white)),
                                        ),
                                      ],
                                    ),
                                  );
                                },
                              ),
                            ],
                          ),
                        );
                      },
                    ),
          // Study Goals Tab
          _buildStudyGoalsTabContent(context, study),
        ],
      ),
    );
  }

  Widget _buildStudyGoalsTabContent(BuildContext context, StudyProvider studyProvider) {
    final goalProvider = Provider.of<GoalProvider>(context);

    // Filter for study goals
    final List<Map<String, dynamic>> calculatedGoals = goalProvider.goals
        .where((g) => g.type == 'study')
        .map((g) {
      final double progressVal = goalProvider.calculateProgressValue(
        g,
        sessions: studyProvider.sessions,
        habits: const [],
        expenses: const [],
        cgpa: 0.0,
        totalCredits: 0.0,
      );
      return {
        'goal': g,
        'value': progressVal,
      };
    }).toList();

    return Column(
      children: [
        Expanded(
          child: calculatedGoals.isEmpty
              ? Center(
                  child: Padding(
                    padding: const EdgeInsets.all(24.0),
                    child: Column(
                      mainAxisAlignment: MainAxisAlignment.center,
                      children: [
                        Icon(Icons.timer_outlined, size: 64, color: const Color(0xFF6B4EFF).withOpacity(0.3)),
                        const SizedBox(height: 16),
                        const Text(
                          'No study goals set yet.',
                          style: TextStyle(fontSize: 16, fontWeight: FontWeight.bold, color: Color(0xFF1C1A24)),
                        ),
                        const SizedBox(height: 8),
                        const Text(
                          'Set focus hour targets for Self Study, Exam Prep, or Assignments to track your progress!',
                          textAlign: TextAlign.center,
                          style: TextStyle(fontSize: 13, color: Color(0xFF787587)),
                        ),
                      ],
                    ),
                  ),
                )
              : ListView.builder(
                  padding: const EdgeInsets.symmetric(horizontal: 20.0, vertical: 16.0),
                  itemCount: calculatedGoals.length,
                  itemBuilder: (context, index) {
                    final item = calculatedGoals[index];
                    final goal = item['goal'] as Goal;
                    final double val = item['value'] as double;

                    double percent = 0.0;
                    if (goal.targetValue > 0) {
                      percent = val / goal.targetValue;
                      if (percent > 1.0) percent = 1.0;
                      if (percent < 0.0) percent = 0.0;
                    }

                    Color statusColor = const Color(0xFF6B4EFF); // Violet
                    final percentageText = '${(percent * 100).toStringAsFixed(0)}%';
                    final String subjectText = goal.attachedActivityId == 'all' ? 'All Study' : goal.attachedActivityId;

                    return Card(
                      color: Colors.white,
                      margin: const EdgeInsets.only(bottom: 16.0),
                      shape: RoundedRectangleBorder(
                        borderRadius: BorderRadius.circular(16),
                        side: const BorderSide(color: Color(0xFFEBE8E1)),
                      ),
                      child: Padding(
                        padding: const EdgeInsets.all(16.0),
                        child: Column(
                          crossAxisAlignment: CrossAxisAlignment.start,
                          children: [
                            Row(
                              mainAxisAlignment: MainAxisAlignment.spaceBetween,
                              children: [
                                Row(
                                  children: [
                                    CircleAvatar(
                                      radius: 18,
                                      backgroundColor: statusColor.withOpacity(0.12),
                                      child: Icon(Icons.timer_outlined, color: statusColor, size: 20),
                                    ),
                                    const SizedBox(width: 12),
                                    Column(
                                      crossAxisAlignment: CrossAxisAlignment.start,
                                      children: [
                                        Text(
                                          goal.title,
                                          style: const TextStyle(
                                            fontSize: 15,
                                            fontWeight: FontWeight.bold,
                                            color: Color(0xFF1C1A24),
                                          ),
                                        ),
                                        Text(
                                          '${goal.timeframe} • Subject: $subjectText',
                                          style: const TextStyle(
                                            fontSize: 11,
                                            color: Color(0xFF787587),
                                          ),
                                        ),
                                      ],
                                    ),
                                  ],
                                ),
                                IconButton(
                                  icon: const Icon(Icons.delete_outline_rounded, color: Color(0xFFBA1A1A)),
                                  onPressed: () => goalProvider.deleteGoal(goal.id),
                                ),
                              ],
                            ),
                            const SizedBox(height: 16),
                            Row(
                              mainAxisAlignment: MainAxisAlignment.spaceBetween,
                              children: [
                                Text(
                                  'Focused: ${val.toStringAsFixed(1)} / ${goal.targetValue.toStringAsFixed(1)} hrs',
                                  style: const TextStyle(fontSize: 12, fontWeight: FontWeight.w600, color: Color(0xFF1C1A24)),
                                ),
                                Text(
                                  percentageText,
                                  style: TextStyle(fontSize: 13, fontWeight: FontWeight.bold, color: statusColor),
                                ),
                              ],
                            ),
                            const SizedBox(height: 8),
                            ClipRRect(
                              borderRadius: BorderRadius.circular(4),
                              child: LinearProgressIndicator(
                                value: percent,
                                color: statusColor,
                                backgroundColor: const Color(0xFFEBE8E1),
                                minHeight: 8,
                              ),
                            ),
                            const SizedBox(height: 12),
                            if (goal.deadline != null) ...[
                              Row(
                                children: [
                                  const Icon(Icons.event_outlined, size: 14, color: Color(0xFF787587)),
                                  const SizedBox(width: 4),
                                  Text(
                                    'Target date: ${DateFormat('MMM dd, yyyy').format(goal.deadline!)}',
                                    style: const TextStyle(fontSize: 11, color: Color(0xFF787587)),
                                  ),
                                ],
                              ),
                              const SizedBox(height: 10),
                            ],
                            // Smart suggestion block
                            Container(
                              width: double.infinity,
                              padding: const EdgeInsets.all(12),
                              decoration: BoxDecoration(
                                color: const Color(0xFFF9F8F6),
                                borderRadius: BorderRadius.circular(12),
                              ),
                              child: Row(
                                crossAxisAlignment: CrossAxisAlignment.start,
                                children: [
                                  Icon(Icons.lightbulb_outline_rounded, size: 16, color: statusColor),
                                  const SizedBox(width: 8),
                                  Expanded(
                                    child: Text(
                                      _generateStudyGoalTip(goal, val),
                                      style: const TextStyle(
                                        fontSize: 12,
                                        color: Color(0xFF1C1A24),
                                        height: 1.35,
                                      ),
                                    ),
                                  ),
                                ],
                              ),
                            ),
                            const SizedBox(height: 12),
                            // Start Timer Button
                            ElevatedButton.icon(
                              onPressed: () {
                                if (_modes.contains(goal.attachedActivityId)) {
                                  setState(() {
                                    _selectedMode = goal.attachedActivityId;
                                  });
                                  studyProvider.setSubject(goal.attachedActivityId);
                                }
                                _tabController.animateTo(0);
                              },
                              icon: const Icon(Icons.play_arrow, color: Colors.white, size: 18),
                              label: const Text('Start Timer for Goal', style: TextStyle(color: Colors.white, fontWeight: FontWeight.bold, fontSize: 12)),
                              style: ElevatedButton.styleFrom(
                                backgroundColor: const Color(0xFF00BFA5), // Teal/Green
                                minimumSize: const Size(double.infinity, 38),
                                shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(8)),
                              ),
                            ),
                          ],
                        ),
                      ),
                    );
                  },
                ),
        ),
        Padding(
          padding: const EdgeInsets.all(20.0),
          child: ElevatedButton.icon(
            onPressed: () => _showAddStudyGoalBottomSheet(context),
            icon: const Icon(Icons.add, color: Colors.white),
            label: const Text('Add Study Goal', style: TextStyle(color: Colors.white, fontWeight: FontWeight.bold)),
            style: ElevatedButton.styleFrom(
              backgroundColor: const Color(0xFF6B4EFF),
              minimumSize: const Size(double.infinity, 50),
              shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(12)),
            ),
          ),
        ),
      ],
    );
  }

  String _generateStudyGoalTip(Goal goal, double progressVal) {
    if (goal.isAchieved) {
      return "Goal achieved! Excellent work staying on track.";
    }

    final double remaining = goal.targetValue - progressVal;
    if (goal.deadline != null) {
      final daysLeft = goal.deadline!.difference(DateTime.now()).inDays;
      if (daysLeft > 0) {
        final dailyHours = remaining / daysLeft;
        final dailyMinutes = (dailyHours * 60).round();
        if (dailyMinutes > 0) {
          return "To hit your target, study for approx. $dailyMinutes mins daily for the next $daysLeft days.";
        }
      }
    }
    return "Log focus sessions using the Pomodoro timer in the Study tab to hit your ${goal.targetValue} hours target.";
  }

  void _showAddStudyGoalBottomSheet(BuildContext context) {
    final titleController = TextEditingController();
    final targetController = TextEditingController();
    String selectedMode = 'all';
    String selectedTimeframe = 'Weekly';
    DateTime? selectedDeadline;

    showModalBottomSheet(
      context: context,
      backgroundColor: Colors.white,
      shape: const RoundedRectangleBorder(borderRadius: BorderRadius.vertical(top: Radius.circular(20))),
      isScrollControlled: true,
      builder: (context) {
        return StatefulBuilder(
          builder: (context, setSheetState) {
            return Padding(
              padding: EdgeInsets.only(
                bottom: MediaQuery.of(context).viewInsets.bottom,
                left: 20,
                right: 20,
                top: 24,
              ),
              child: SingleChildScrollView(
                child: Column(
                  mainAxisSize: MainAxisSize.min,
                  crossAxisAlignment: CrossAxisAlignment.stretch,
                  children: [
                    Row(
                      mainAxisAlignment: MainAxisAlignment.spaceBetween,
                      children: [
                        const Text(
                          'Create Study Goal',
                          style: TextStyle(fontSize: 18, fontWeight: FontWeight.bold, color: Color(0xFF1C1A24)),
                        ),
                        IconButton(
                          icon: const Icon(Icons.close, color: Color(0xFF787587)),
                          onPressed: () => Navigator.pop(context),
                        )
                      ],
                    ),
                    const SizedBox(height: 12),
                    TextField(
                      controller: titleController,
                      style: const TextStyle(color: Color(0xFF1C1A24)),
                      decoration: InputDecoration(
                        labelText: 'Goal Title',
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
                    DropdownButtonFormField<String>(
                      value: selectedMode,
                      dropdownColor: Colors.white,
                      style: const TextStyle(color: Color(0xFF1C1A24)),
                      decoration: InputDecoration(
                        labelText: 'Study Mode / Subject',
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
                      items: const [
                        DropdownMenuItem(value: 'all', child: Text('All Study')),
                        DropdownMenuItem(value: 'Self Study', child: Text('Self Study')),
                        DropdownMenuItem(value: 'Library', child: Text('Library')),
                        DropdownMenuItem(value: 'Assignment', child: Text('Assignment')),
                        DropdownMenuItem(value: 'Exam Prep', child: Text('Exam Prep')),
                      ],
                      onChanged: (val) {
                        if (val != null) {
                          setSheetState(() {
                            selectedMode = val;
                          });
                        }
                      },
                    ),
                    const SizedBox(height: 16),
                    TextField(
                      controller: targetController,
                      style: const TextStyle(color: Color(0xFF1C1A24)),
                      decoration: InputDecoration(
                        labelText: 'Target Focus Hours',
                        helperText: 'e.g. 10.5 hours',
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
                      value: selectedTimeframe,
                      dropdownColor: Colors.white,
                      style: const TextStyle(color: Color(0xFF1C1A24)),
                      decoration: InputDecoration(
                        labelText: 'Goal Timeframe',
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
                      items: const [
                        DropdownMenuItem(value: 'Daily', child: Text('Daily')),
                        DropdownMenuItem(value: 'Weekly', child: Text('Weekly')),
                        DropdownMenuItem(value: 'Monthly', child: Text('Monthly')),
                        DropdownMenuItem(value: 'Semester', child: Text('Semester')),
                        DropdownMenuItem(value: 'All Time', child: Text('All Time')),
                      ],
                      onChanged: (val) {
                        if (val != null) {
                          setSheetState(() {
                            selectedTimeframe = val;
                          });
                        }
                      },
                    ),
                    const SizedBox(height: 16),
                    InkWell(
                      onTap: () async {
                        final picked = await showDatePicker(
                          context: context,
                          initialDate: DateTime.now().add(const Duration(days: 7)),
                          firstDate: DateTime.now(),
                          lastDate: DateTime.now().add(const Duration(days: 365)),
                          builder: (context, child) {
                            return Theme(
                              data: Theme.of(context).copyWith(
                                colorScheme: const ColorScheme.light(
                                  primary: Color(0xFF6B4EFF),
                                  onPrimary: Colors.white,
                                  onSurface: Color(0xFF1C1A24),
                                ),
                              ),
                              child: child!,
                            );
                          },
                        );
                        if (picked != null) {
                          setSheetState(() {
                            selectedDeadline = picked;
                          });
                        }
                      },
                      child: Container(
                        padding: const EdgeInsets.symmetric(vertical: 16, horizontal: 12),
                        decoration: BoxDecoration(
                          borderRadius: BorderRadius.circular(12),
                          border: Border.all(color: const Color(0xFFEBE8E1)),
                        ),
                        child: Row(
                          mainAxisAlignment: MainAxisAlignment.spaceBetween,
                          children: [
                            Text(
                              selectedDeadline == null
                                  ? 'Set Goal Deadline (Optional)'
                                  : 'Deadline: ${DateFormat('yyyy-MM-dd').format(selectedDeadline!)}',
                              style: TextStyle(
                                color: selectedDeadline == null ? const Color(0xFF787587) : const Color(0xFF1C1A24),
                                fontSize: 15,
                              ),
                            ),
                            const Icon(Icons.calendar_month_outlined, color: Color(0xFF6B4EFF)),
                          ],
                        ),
                      ),
                    ),
                    const SizedBox(height: 24),
                    ElevatedButton(
                      onPressed: () async {
                        final title = titleController.text.trim();
                        final target = double.tryParse(targetController.text) ?? 0.0;

                        if (title.isEmpty) {
                          ScaffoldMessenger.of(context).showSnackBar(
                            const SnackBar(content: Text('Please enter a goal title.')),
                          );
                          return;
                        }
                        if (target <= 0.0) {
                          ScaffoldMessenger.of(context).showSnackBar(
                            const SnackBar(content: Text('Please enter a valid target value.')),
                          );
                          return;
                        }

                        try {
                          await Provider.of<GoalProvider>(context, listen: false).addGoal(
                            title: title,
                            type: 'study',
                            targetValue: target,
                            attachedActivityId: selectedMode,
                            timeframe: selectedTimeframe,
                            deadline: selectedDeadline,
                          );
                          if (context.mounted) Navigator.pop(context);
                        } catch (e) {
                          if (context.mounted) {
                            ScaffoldMessenger.of(context).showSnackBar(
                              SnackBar(content: Text('Failed to add goal: $e')),
                            );
                          }
                        }
                      },
                      style: ElevatedButton.styleFrom(
                        backgroundColor: const Color(0xFF6B4EFF),
                        padding: const EdgeInsets.symmetric(vertical: 16),
                        shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(12)),
                      ),
                      child: const Text(
                        'Create Goal',
                        style: TextStyle(color: Colors.white, fontSize: 16, fontWeight: FontWeight.bold),
                      ),
                    ),
                    const SizedBox(height: 24),
                  ],
                ),
              ),
            );
          },
        );
      },
    );
  }
}

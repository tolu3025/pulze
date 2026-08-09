import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'package:intl/intl.dart';
import '../providers/study_provider.dart';

class StudyScreen extends StatefulWidget {
  const StudyScreen({super.key});

  @override
  State<StudyScreen> createState() => _StudyScreenState();
}

class _StudyScreenState extends State<StudyScreen> {
  final List<String> _subjects = ['General', 'Math', 'Science', 'Languages', 'Engineering', 'History'];
  int _selectedDurationMinutes = 25; // default pomodoro is 25 minutes

  void _showSessionFormBottomSheet(BuildContext context) {
    final subjectController = TextEditingController();
    final durationController = TextEditingController();

    showModalBottomSheet(
      context: context,
      backgroundColor: const Color(0xFF1E293B),
      isScrollControlled: true,
      builder: (context) {
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
                'Manual Log Session',
                style: TextStyle(fontSize: 18, fontWeight: FontWeight.bold, color: Colors.white),
              ),
              const SizedBox(height: 16),
              TextField(
                controller: subjectController,
                decoration: const InputDecoration(
                  labelText: 'Subject (e.g. Physics)',
                  border: OutlineInputBorder(),
                ),
              ),
              const SizedBox(height: 16),
              TextField(
                controller: durationController,
                decoration: const InputDecoration(
                  labelText: 'Duration (minutes)',
                  border: OutlineInputBorder(),
                ),
                keyboardType: TextInputType.number,
              ),
              const SizedBox(height: 24),
              ElevatedButton(
                onPressed: () {
                  final subj = subjectController.text.trim();
                  final dur = int.tryParse(durationController.text) ?? 0;
                  if (subj.isNotEmpty && dur > 0) {
                    Provider.of<StudyProvider>(context, listen: false)
                        .addStudySession(subj, dur * 60);
                    Navigator.pop(context);
                  }
                },
                style: ElevatedButton.styleFrom(
                  backgroundColor: const Color(0xFF6366F1),
                  padding: const EdgeInsets.symmetric(vertical: 16),
                ),
                child: const Text('Save Log', style: TextStyle(color: Colors.white, fontSize: 16)),
              ),
              const SizedBox(height: 20),
            ],
          ),
        );
      },
    );
  }

  void _showDeleteSessionConfirm(BuildContext context, String sessionId) {
    showDialog(
      context: context,
      builder: (context) => AlertDialog(
        backgroundColor: const Color(0xFF1E293B),
        title: const Text('Delete Session'),
        content: const Text('Are you sure you want to delete this study session record?'),
        actions: [
          TextButton(
            onPressed: () => Navigator.pop(context),
            child: const Text('Cancel', style: TextStyle(color: Color(0xFF94A3B8))),
          ),
          ElevatedButton(
            onPressed: () {
              Provider.of<StudyProvider>(context, listen: false).deleteStudySession(sessionId);
              Navigator.pop(context);
            },
            style: ElevatedButton.styleFrom(backgroundColor: const Color(0xFFEF4444)),
            child: const Text('Delete', style: TextStyle(color: Colors.white)),
          ),
        ],
      ),
    );
  }

  String _formatTimerText(int seconds) {
    final int minutes = seconds ~/ 60;
    final int remainingSec = seconds % 60;
    return '${minutes.toString().padLeft(2, '0')}:${remainingSec.toString().padLeft(2, '0')}';
  }

  @override
  Widget build(BuildContext context) {
    final study = Provider.of<StudyProvider>(context);

    return Scaffold(
      appBar: AppBar(
        title: const Text('Study Hub'),
        actions: [
          IconButton(
            icon: const Icon(Icons.history_edu_rounded),
            onPressed: () => _showSessionFormBottomSheet(context),
          ),
        ],
      ),
      body: SingleChildScrollView(
        child: Column(
          children: [
            const SizedBox(height: 20),
            
            // Timer View
            Container(
              padding: const EdgeInsets.all(24.0),
              margin: const EdgeInsets.symmetric(horizontal: 20.0),
              decoration: BoxDecoration(
                color: const Color(0xFF1E293B),
                borderRadius: BorderRadius.circular(24),
                border: Border.all(color: Colors.white.withOpacity(0.04)),
              ),
              child: Column(
                children: [
                  // Subject selection dropdown (only if timer is NOT running)
                  if (!study.isTimerRunning && study.timerSeconds == 0)
                    DropdownButton<String>(
                      value: study.selectedSubject,
                      dropdownColor: const Color(0xFF1E293B),
                      underline: const SizedBox(),
                      style: const TextStyle(fontSize: 16, fontWeight: FontWeight.bold, color: Colors.white),
                      icon: const Icon(Icons.arrow_drop_down, color: Color(0xFF818CF8)),
                      items: _subjects.map((sub) {
                        return DropdownMenuItem(value: sub, child: Text(sub));
                      }).toList(),
                      onChanged: (val) {
                        if (val != null) study.setSubject(val);
                      },
                    )
                  else
                    Text(
                      'Focus Subject: ${study.selectedSubject}',
                      style: const TextStyle(fontSize: 16, fontWeight: FontWeight.bold, color: Color(0xFF818CF8)),
                    ),
                  
                  const SizedBox(height: 24),
                  
                  // Circular Progress Indicator / Timer string
                  Stack(
                    alignment: Alignment.center,
                    children: [
                      SizedBox(
                        width: 180,
                        height: 180,
                        child: CircularProgressIndicator(
                          value: study.timerSeconds > 0 
                              ? study.timerSeconds / (_selectedDurationMinutes * 60)
                              : 0.0,
                          strokeWidth: 10,
                          color: const Color(0xFF6366F1),
                          backgroundColor: const Color(0xFF0F172A),
                        ),
                      ),
                      Text(
                        study.timerSeconds > 0 
                            ? _formatTimerText(study.timerSeconds)
                            : '${_selectedDurationMinutes.toString().padLeft(2, '0')}:00',
                        style: const TextStyle(fontSize: 36, fontWeight: FontWeight.w900, color: Colors.white),
                      ),
                    ],
                  ),
                  
                  const SizedBox(height: 24),
                  
                  // Duration Quick Picker (only if timer is NOT active)
                  if (!study.isTimerRunning && study.timerSeconds == 0)
                    Row(
                      mainAxisAlignment: MainAxisAlignment.center,
                      children: [15, 25, 45, 60].map((min) {
                        final selected = _selectedDurationMinutes == min;
                        return GestureDetector(
                          onTap: () {
                            setState(() {
                              _selectedDurationMinutes = min;
                            });
                          },
                          child: Container(
                            margin: const EdgeInsets.symmetric(horizontal: 6),
                            padding: const EdgeInsets.symmetric(horizontal: 12, vertical: 6),
                            decoration: BoxDecoration(
                              color: selected ? const Color(0xFF6366F1) : const Color(0xFF0F172A),
                              borderRadius: BorderRadius.circular(10),
                            ),
                            child: Text(
                              '$min m',
                              style: TextStyle(
                                color: selected ? Colors.white : const Color(0xFF94A3B8),
                                fontWeight: FontWeight.bold,
                              ),
                            ),
                          ),
                        );
                      }).toList(),
                    ),
                  
                  const SizedBox(height: 24),
                  
                  // Timer Controls
                  Row(
                    mainAxisAlignment: MainAxisAlignment.center,
                    children: [
                      if (!study.isTimerRunning && study.timerSeconds == 0)
                        ElevatedButton.icon(
                          onPressed: () {
                            study.startTimer(_selectedDurationMinutes * 60);
                          },
                          icon: const Icon(Icons.play_arrow_rounded, color: Colors.white),
                          label: const Text('Start Session', style: TextStyle(color: Colors.white)),
                          style: ElevatedButton.styleFrom(
                            backgroundColor: const Color(0xFF6366F1),
                            padding: const EdgeInsets.symmetric(horizontal: 24, vertical: 12),
                          ),
                        ),
                      if (study.isTimerRunning) ...[
                        ElevatedButton.icon(
                          onPressed: () {
                            study.pauseTimer();
                          },
                          icon: const Icon(Icons.pause_rounded, color: Colors.white),
                          label: const Text('Pause', style: TextStyle(color: Colors.white)),
                          style: ElevatedButton.styleFrom(backgroundColor: const Color(0xFFF59E0B)),
                        ),
                        const SizedBox(width: 12),
                        ElevatedButton.icon(
                          onPressed: () {
                            study.stopTimer(saveSession: false);
                          },
                          icon: const Icon(Icons.stop_rounded, color: Colors.white),
                          label: const Text('Reset', style: TextStyle(color: Colors.white)),
                          style: ElevatedButton.styleFrom(backgroundColor: const Color(0xFFEF4444)),
                        ),
                      ],
                      if (!study.isTimerRunning && study.timerSeconds > 0) ...[
                        ElevatedButton.icon(
                          onPressed: () {
                            study.resumeTimer();
                          },
                          icon: const Icon(Icons.play_arrow_rounded, color: Colors.white),
                          label: const Text('Resume', style: TextStyle(color: Colors.white)),
                          style: ElevatedButton.styleFrom(backgroundColor: const Color(0xFF10B981)),
                        ),
                        const SizedBox(width: 12),
                        ElevatedButton.icon(
                          onPressed: () {
                            study.stopTimer(saveSession: true); // Force save incomplete session as logged
                          },
                          icon: const Icon(Icons.check_rounded, color: Colors.white),
                          label: const Text('Done', style: TextStyle(color: Colors.white)),
                          style: ElevatedButton.styleFrom(backgroundColor: const Color(0xFF6366F1)),
                        ),
                      ]
                    ],
                  ),
                ],
              ),
            ),
            
            const SizedBox(height: 24),
            
            // Session Logs
            Padding(
              padding: const EdgeInsets.symmetric(horizontal: 24.0),
              child: Row(
                mainAxisAlignment: MainAxisAlignment.spaceBetween,
                children: [
                  const Text('Study History', style: TextStyle(fontSize: 16, fontWeight: FontWeight.bold, color: Colors.white)),
                  Text('${study.sessions.length} sessions logged', style: const TextStyle(fontSize: 12, color: Color(0xFF94A3B8))),
                ],
              ),
            ),
            
            const SizedBox(height: 12),
            
            study.isLoading
                ? const Center(child: CircularProgressIndicator(color: Color(0xFF6366F1)))
                : study.sessions.isEmpty
                    ? const Padding(
                        padding: EdgeInsets.all(40.0),
                        child: Text(
                          'No study logs recorded yet.',
                          style: TextStyle(color: Color(0xFF94A3B8)),
                        ),
                      )
                    : ListView.builder(
                        shrinkWrap: true,
                        physics: const NeverScrollableScrollPhysics(),
                        itemCount: study.sessions.length,
                        padding: const EdgeInsets.symmetric(horizontal: 20),
                        itemBuilder: (context, index) {
                          final session = study.sessions[index];
                          final minStr = (session.duration / 60).toStringAsFixed(1);
                          return Container(
                            margin: const EdgeInsets.only(bottom: 8),
                            padding: const EdgeInsets.all(12),
                            decoration: BoxDecoration(
                              color: const Color(0xFF1E293B),
                              borderRadius: BorderRadius.circular(12),
                            ),
                            child: Row(
                              children: [
                                const Icon(Icons.timer_outlined, color: Color(0xFFEF4444), size: 20),
                                const SizedBox(width: 12),
                                Expanded(
                                  child: Column(
                                    crossAxisAlignment: CrossAxisAlignment.start,
                                    children: [
                                      Text(
                                        session.subject,
                                        style: const TextStyle(fontWeight: FontWeight.bold, color: Colors.white, fontSize: 14),
                                      ),
                                      Text(
                                        DateFormat('MMM d, y @ h:mm a').format(session.date),
                                        style: const TextStyle(color: Color(0xFF94A3B8), fontSize: 11),
                                      ),
                                    ],
                                  ),
                                ),
                                Text(
                                  '$minStr min',
                                  style: const TextStyle(color: Colors.white, fontWeight: FontWeight.bold),
                                ),
                                IconButton(
                                  icon: const Icon(Icons.delete_outline, size: 18, color: Color(0xFF94A3B8)),
                                  onPressed: () => _showDeleteSessionConfirm(context, session.id),
                                ),
                              ],
                            ),
                          );
                        },
                      ),
            const SizedBox(height: 40),
          ],
        ),
      ),
    );
  }
}

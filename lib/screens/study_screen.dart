import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'package:intl/intl.dart';
import '../providers/study_provider.dart';

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
    _tabController = TabController(length: 2, vsync: this);
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
        ],
      ),
    );
  }
}

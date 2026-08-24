import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'package:intl/intl.dart';
import '../models/models.dart';
import '../providers/goal_provider.dart';
import '../providers/study_provider.dart';
import '../providers/habit_provider.dart';
import '../providers/expense_provider.dart';
import '../providers/academic_provider.dart';

class GoalsScreen extends StatefulWidget {
  const GoalsScreen({super.key});

  @override
  State<GoalsScreen> createState() => _GoalsScreenState();
}

class _GoalsScreenState extends State<GoalsScreen> with SingleTickerProviderStateMixin {
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

  // Generate actionable advice / tip based on the goal metrics and status
  String _generateGoalTip(Goal goal, double progressVal) {
    if (goal.isAchieved) {
      return "Goal achieved! Excellent work staying on track.";
    }

    final double remaining = goal.targetValue - progressVal;

    switch (goal.type) {
      case 'study':
        final String subjectText = goal.attachedActivityId == 'all' ? 'studying' : 'focusing on "${goal.attachedActivityId}"';
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

      case 'habit':
        final String habitText = goal.attachedActivityId == 'all' ? 'your habits' : 'this habit';
        if (goal.deadline != null) {
          final daysLeft = goal.deadline!.difference(DateTime.now()).inDays;
          if (daysLeft > 0) {
            if (remaining > daysLeft) {
              return "You have $daysLeft days left but need $remaining completions. Complete it multiple times per day to catch up!";
            } else {
              return "You have $daysLeft days left. Complete it once every ${(daysLeft / remaining).toStringAsFixed(1)} days to succeed.";
            }
          }
        }
        return "Keep updating your completions in the Habits tab. Maintaining your streak is key!";

      case 'academic':
        if (goal.attachedActivityId == 'gpa') {
          if (progressVal > 0) {
            final diff = goal.targetValue - progressVal;
            if (diff > 0) {
              return "Your CGPA is at ${progressVal.toStringAsFixed(2)}. Aim for straight A grades (5.0 points) in your upcoming courses to raise it by ${diff.toStringAsFixed(2)}.";
            } else {
              return "You have reached your target CGPA! Maintain your high grades to keep it there.";
            }
          }
          return "Add your grades and credits under the Academics tab to calculate your current CGPA progress.";
        } else {
          return "Complete courses to earn credits. You need ${remaining.toStringAsFixed(0)} more credit units to reach this goal.";
        }

      case 'expense':
        final double left = goal.targetValue - progressVal;
        if (left < 0) {
          return "Warning: You have exceeded this budget limit by ₦${(-left).toStringAsFixed(0)}! Try to restrict spending in this category.";
        } else {
          final percentUsed = (progressVal / goal.targetValue * 100).round();
          return "You have ₦${left.toStringAsFixed(0)} left ($percentUsed% used). Keep non-essential spending low to stay within budget.";
        }

      default:
        return "Keep logging activities to reach your goal!";
    }
  }

  void _showAddGoalBottomSheet(BuildContext context) {
    final titleController = TextEditingController();
    final targetController = TextEditingController();

    String selectedType = 'study';
    String selectedAttachedId = 'all';
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
            final studyProvider = Provider.of<StudyProvider>(context, listen: false);
            final habitProvider = Provider.of<HabitProvider>(context, listen: false);
            final expenseProvider = Provider.of<ExpenseProvider>(context, listen: false);

            // Populate Attached Activity options based on selected Type
            List<DropdownMenuItem<String>> attachedOptions = [];

            if (selectedType == 'study') {
              attachedOptions = [
                const DropdownMenuItem(value: 'all', child: Text('All Study')),
                const DropdownMenuItem(value: 'Self Study', child: Text('Self Study')),
                const DropdownMenuItem(value: 'Library', child: Text('Library')),
                const DropdownMenuItem(value: 'Assignment', child: Text('Assignment')),
                const DropdownMenuItem(value: 'Exam Prep', child: Text('Exam Prep')),
              ];
            } else if (selectedType == 'habit') {
              attachedOptions = [
                const DropdownMenuItem(value: 'all', child: Text('All Habits')),
                ...habitProvider.habits.map((h) => DropdownMenuItem(value: h.id, child: Text(h.title))),
              ];
            } else if (selectedType == 'academic') {
              attachedOptions = [
                const DropdownMenuItem(value: 'gpa', child: Text('Target CGPA')),
                const DropdownMenuItem(value: 'credits', child: Text('Target Credit Units')),
              ];
            } else if (selectedType == 'expense') {
              attachedOptions = [
                const DropdownMenuItem(value: 'all', child: Text('Total Budget')),
                const DropdownMenuItem(value: 'Food', child: Text('Food')),
                const DropdownMenuItem(value: 'Transport', child: Text('Transport')),
                const DropdownMenuItem(value: 'Books', child: Text('Books')),
                const DropdownMenuItem(value: 'Entertainment', child: Text('Entertainment')),
                const DropdownMenuItem(value: 'Bills', child: Text('Bills')),
                const DropdownMenuItem(value: 'Other', child: Text('Other')),
              ];
            }

            // Fallback for attached activity ID if not in options
            if (!attachedOptions.any((item) => item.value == selectedAttachedId)) {
              selectedAttachedId = attachedOptions.first.value ?? 'all';
            }

            String targetLabel = 'Target Value';
            String targetHelper = 'Enter target numeric value';
            if (selectedType == 'study') {
              targetLabel = 'Target Focus Hours';
              targetHelper = 'e.g. 10.5 hours';
            } else if (selectedType == 'habit') {
              targetLabel = 'Target Completion Count';
              targetHelper = 'e.g. 15 times';
            } else if (selectedType == 'academic') {
              if (selectedAttachedId == 'gpa') {
                targetLabel = 'Target CGPA (out of 5.0)';
                targetHelper = 'e.g. 4.50';
              } else {
                targetLabel = 'Target Credit Units';
                targetHelper = 'e.g. 18 credits';
              }
            } else if (selectedType == 'expense') {
              targetLabel = 'Budget Limit (₦)';
              targetHelper = 'e.g. 15000';
            }

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
                          'Create New Goal',
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
                      value: selectedType,
                      dropdownColor: Colors.white,
                      style: const TextStyle(color: Color(0xFF1C1A24)),
                      decoration: InputDecoration(
                        labelText: 'Activity Type',
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
                        DropdownMenuItem(value: 'study', child: Text('📚 Focus & Study')),
                        DropdownMenuItem(value: 'habit', child: Text('✅ Habits')),
                        DropdownMenuItem(value: 'academic', child: Text('🎓 Academics')),
                        DropdownMenuItem(value: 'expense', child: Text('₦ Expenses & Budget')),
                      ],
                      onChanged: (val) {
                        if (val != null) {
                          setSheetState(() {
                            selectedType = val;
                            // reset selection based on type change
                            selectedAttachedId = val == 'academic' ? 'gpa' : 'all';
                          });
                        }
                      },
                    ),
                    const SizedBox(height: 16),
                    DropdownButtonFormField<String>(
                      value: selectedAttachedId,
                      dropdownColor: Colors.white,
                      style: const TextStyle(color: Color(0xFF1C1A24)),
                      decoration: InputDecoration(
                        labelText: 'Attach to Activity',
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
                      items: attachedOptions,
                      onChanged: (val) {
                        if (val != null) {
                          setSheetState(() {
                            selectedAttachedId = val;
                          });
                        }
                      },
                    ),
                    const SizedBox(height: 16),
                    TextField(
                      controller: targetController,
                      style: const TextStyle(color: Color(0xFF1C1A24)),
                      decoration: InputDecoration(
                        labelText: targetLabel,
                        helperText: targetHelper,
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
                    // Deadline Picker
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
                            type: selectedType,
                            targetValue: target,
                            attachedActivityId: selectedAttachedId,
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

  @override
  Widget build(BuildContext context) {
    final goalProvider = Provider.of<GoalProvider>(context);
    final study = Provider.of<StudyProvider>(context);
    final habit = Provider.of<HabitProvider>(context);
    final expense = Provider.of<ExpenseProvider>(context);
    final academic = Provider.of<AcademicProvider>(context);

    // Calculate dynamic values for all goals
    final List<Map<String, dynamic>> calculatedGoals = goalProvider.goals.map((g) {
      final double progressVal = goalProvider.calculateProgressValue(
        g,
        sessions: study.sessions,
        habits: habit.habits,
        expenses: expense.expenses,
        cgpa: academic.cgpa,
        totalCredits: academic.semesters.fold<double>(0.0, (sum, sem) => sum + sem.totalCreditUnits),
      );
      return {
        'goal': g,
        'value': progressVal,
      };
    }).toList();

    final activeGoals = calculatedGoals.where((item) => !(item['goal'] as Goal).isAchieved).toList();
    final completedGoals = calculatedGoals.where((item) => (item['goal'] as Goal).isAchieved).toList();

    return Scaffold(
      backgroundColor: const Color(0xFFF9F8F6),
      appBar: AppBar(
        backgroundColor: const Color(0xFFF9F8F6),
        title: const Text(
          'Goals & Progress',
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
            Tab(text: 'Active Goals'),
            Tab(text: 'Completed'),
          ],
        ),
      ),
      body: TabBarView(
        controller: _tabController,
        children: [
          _buildGoalsList(context, activeGoals, goalProvider),
          _buildGoalsList(context, completedGoals, goalProvider),
        ],
      ),
      floatingActionButton: FloatingActionButton.extended(
        onPressed: () => _showAddGoalBottomSheet(context),
        backgroundColor: const Color(0xFF6B4EFF),
        icon: const Icon(Icons.add, color: Colors.white),
        label: const Text('Add Goal', style: TextStyle(color: Colors.white, fontWeight: FontWeight.bold)),
      ),
    );
  }

  Widget _buildGoalsList(
    BuildContext context,
    List<Map<String, dynamic>> items,
    GoalProvider provider,
  ) {
    if (provider.isLoading) {
      return const Center(child: CircularProgressIndicator(color: Color(0xFF6B4EFF)));
    }

    if (items.isEmpty) {
      return Center(
        child: Padding(
          padding: const EdgeInsets.all(24.0),
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              Icon(Icons.emoji_flags_outlined, size: 64, color: const Color(0xFF6B4EFF).withOpacity(0.3)),
              const SizedBox(height: 16),
              const Text(
                'No goals here yet.',
                style: TextStyle(fontSize: 16, fontWeight: FontWeight.bold, color: Color(0xFF1C1A24)),
              ),
              const SizedBox(height: 8),
              const Text(
                'Tap "Add Goal" at the bottom to set targets for studying, habits, finances, or GPAs!',
                textAlign: TextAlign.center,
                style: TextStyle(fontSize: 13, color: Color(0xFF787587)),
              ),
            ],
          ),
        ),
      );
    }

    return ListView.builder(
      padding: const EdgeInsets.symmetric(horizontal: 20.0, vertical: 16.0),
      itemCount: items.length,
      itemBuilder: (context, index) {
        final item = items[index];
        final goal = item['goal'] as Goal;
        final double val = item['value'] as double;

        // Compute percentage
        double percent = 0.0;
        if (goal.targetValue > 0) {
          percent = val / goal.targetValue;
          if (percent > 1.0) percent = 1.0;
          if (percent < 0.0) percent = 0.0;
        }

        IconData typeIcon = Icons.flag_outlined;
        Color typeColor = const Color(0xFF6B4EFF);
        String unit = '';

        if (goal.type == 'study') {
          typeIcon = Icons.timer_outlined;
          typeColor = const Color(0xFF6B4EFF);
          unit = 'hrs';
        } else if (goal.type == 'habit') {
          typeIcon = Icons.check_circle_outline_rounded;
          typeColor = const Color(0xFF00BFA5);
          unit = 'times';
        } else if (goal.type == 'academic') {
          typeIcon = Icons.school_outlined;
          typeColor = const Color(0xFFE07A5F);
          unit = goal.attachedActivityId == 'gpa' ? 'GPA' : 'credits';
        } else if (goal.type == 'expense') {
          typeIcon = Icons.account_balance_wallet_outlined;
          typeColor = const Color(0xFF00BFA5);
          unit = '₦';
        }

        final percentageText = '${(percent * 100).toStringAsFixed(0)}%';

        return Card(
          color: Colors.white,
          margin: const EdgeInsets.only(bottom: 16.0),
          shape: RoundedRectangleBorder(
            borderRadius: BorderRadius.circular(16),
            border: Border.all(color: const Color(0xFFEBE8E1)),
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
                          backgroundColor: typeColor.withOpacity(0.12),
                          child: Icon(typeIcon, color: typeColor, size: 20),
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
                              '${goal.timeframe} • ${goal.type[0].toUpperCase()}${goal.type.substring(1)}',
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
                      onPressed: () => provider.deleteGoal(goal.id),
                    ),
                  ],
                ),
                const SizedBox(height: 16),
                Row(
                  mainAxisAlignment: MainAxisAlignment.spaceBetween,
                  children: [
                    Text(
                      goal.type == 'expense'
                          ? 'Spent: ₦${val.toStringAsFixed(0)} / ₦${goal.targetValue.toStringAsFixed(0)}'
                          : goal.attachedActivityId == 'gpa'
                              ? 'Current CGPA: ${val.toStringAsFixed(2)} (Target: ${goal.targetValue.toStringAsFixed(2)})'
                              : 'Progress: ${val.toStringAsFixed(1)} / ${goal.targetValue.toStringAsFixed(1)} $unit',
                      style: const TextStyle(fontSize: 12, fontWeight: FontWeight.w600, color: Color(0xFF1C1A24)),
                    ),
                    Text(
                      percentageText,
                      style: TextStyle(fontSize: 13, fontWeight: FontWeight.bold, color: typeColor),
                    ),
                  ],
                ),
                const SizedBox(height: 8),
                ClipRRect(
                  borderRadius: BorderRadius.circular(4),
                  child: LinearProgressIndicator(
                    value: percent,
                    color: typeColor,
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
                      Icon(Icons.lightbulb_outline_rounded, size: 16, color: typeColor),
                      const SizedBox(width: 8),
                      Expanded(
                        child: Text(
                          _generateGoalTip(goal, val),
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
              ],
            ),
          ),
        );
      },
    );
  }
}

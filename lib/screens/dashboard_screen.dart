import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'package:cloud_firestore/cloud_firestore.dart';
import 'package:firebase_auth/firebase_auth.dart' hide AuthProvider;
import '../providers/academic_provider.dart';
import '../providers/expense_provider.dart';
import '../providers/habit_provider.dart';
import '../providers/study_provider.dart';
import '../providers/auth_provider.dart';
import '../providers/goal_provider.dart';
import '../models/models.dart';
import '../services/notification_service.dart';
import 'goals_screen.dart';


class DashboardScreen extends StatelessWidget {
  static bool _motivationNotifiedToday = false;
  static int _selectedQuoteIndex = -1;
  const DashboardScreen({super.key});

  @override
  Widget build(BuildContext context) {
    final academic = Provider.of<AcademicProvider>(context);
    final expense = Provider.of<ExpenseProvider>(context);
    final habit = Provider.of<HabitProvider>(context);
    final study = Provider.of<StudyProvider>(context);
    final auth = Provider.of<AuthProvider>(context);
    final goalProvider = Provider.of<GoalProvider>(context);

    // Calculate completed habits today
    final now = DateTime.now();
    final todayHabitsCount = habit.habits.where((h) => h.completedDates.any((d) =>
        d.year == now.year && d.month == now.month && d.day == now.day)).length;

    // Study minutes calculation
    final hours = study.totalStudyTime ~/ 3600;
    final minutes = (study.totalStudyTime % 3600) ~/ 60;
    final studyStr = study.totalStudyTime > 0 ? '${hours}h ${minutes}m' : '0h 0m';

    // Calculate habits streak
    int maxStreak = 0;
    for (var h in habit.habits) {
      if (h.streak > maxStreak) maxStreak = h.streak;
    }
    final streakStr = maxStreak > 0 ? '$maxStreak Days' : '0 Days';

    const motivations = [
      'Manage your pocket money wisely. A wealthy student is a disciplined student.',
      'Small daily improvements are the key to staggering long-term results.',
      'Your future is created by what you do today, not tomorrow.',
      'Success is the sum of small efforts, repeated day in and day out.',
      'Focus on being productive instead of busy.',
      'Discipline is choosing between what you want now and what you want most.',
      'The secret of getting ahead is getting started.',
    ];
    if (_selectedQuoteIndex == -1) {
      _selectedQuoteIndex = DateTime.now().microsecondsSinceEpoch % motivations.length;
    }
    final motivationText = motivations[_selectedQuoteIndex];

    // Total spent in NAIRA (₦)
    final totalSpent = expense.totalExpenses;
    final spentStr = totalSpent > 0 
        ? (totalSpent >= 1000 ? '₦${(totalSpent/1000).toStringAsFixed(0)}K' : '₦${totalSpent.toStringAsFixed(0)}')
        : '₦0';

    // CGPA
    final cgpaStr = academic.cgpa > 0 ? academic.cgpa.toStringAsFixed(2) : '0.00';

    // Get time based greeting
    String getGreeting() {
      final hour = DateTime.now().hour;
      if (hour < 12) return 'Good morning';
      if (hour < 17) return 'Good afternoon';
      return 'Good evening';
    }

    // Get user displayName
    String name = auth.user?.displayName ?? '';
    if (name.isEmpty) {
      final email = auth.user?.email ?? '';
      if (email.contains('@')) {
        name = email.split('@')[0];
        name = name.split('.').map((s) => s.isNotEmpty ? s[0].toUpperCase() + s.substring(1) : '').join(' ');
      } else {
        name = 'Student';
      }
    }
    name = name.split(' ').first;

    return Scaffold(
      backgroundColor: const Color(0xFFF9F8F6),
      appBar: AppBar(
        backgroundColor: const Color(0xFFF9F8F6),
        elevation: 0,
        leadingWidth: 100,
        leading: Padding(
          padding: const EdgeInsets.only(left: 20.0, top: 8.0, bottom: 8.0),
          child: Row(
            children: [
              CircleAvatar(
                radius: 18,
                backgroundColor: const Color(0xFFEBE8E1),
                backgroundImage: NetworkImage('https://api.dicebear.com/7.x/bottts/png?seed=${auth.user?.uid ?? "default"}'),
              ),
              const SizedBox(width: 8),
              Text(
                'Pulze',
                style: Theme.of(context).textTheme.titleLarge?.copyWith(
                      fontWeight: FontWeight.bold,
                      fontSize: 16,
                      color: const Color(0xFF1C1A24),
                    ),
              ),
            ],
          ),
        ),
        actions: [
          StreamBuilder<QuerySnapshot>(
            stream: FirebaseFirestore.instance
                .collection('users')
                .doc(FirebaseAuth.instance.currentUser?.uid ?? 'empty')
                .collection('notifications')
                .where('isRead', isEqualTo: false)
                .snapshots(),
            builder: (context, snapshot) {
              final unreadCount = snapshot.data?.docs.length ?? 0;
              return Stack(
                alignment: Alignment.center,
                children: [
                  IconButton(
                    icon: const Icon(Icons.notifications_none_rounded, color: Color(0xFF6B4EFF)),
                    onPressed: () async {
                      final user = FirebaseAuth.instance.currentUser;
                      if (user != null) {
                        final unreadDocs = snapshot.data?.docs ?? [];
                        final batch = FirebaseFirestore.instance.batch();
                        for (var doc in unreadDocs) {
                          batch.update(doc.reference, {'isRead': true});
                        }
                        await batch.commit().catchError((e) {
                          debugPrint('Error marking notifications as read: $e');
                        });
                      }
 
                      if (context.mounted) {
                        showModalBottomSheet(
                          context: context,
                          backgroundColor: const Color(0xFFF9F8F6),
                          isScrollControlled: true,
                          shape: const RoundedRectangleBorder(
                            borderRadius: BorderRadius.vertical(top: Radius.circular(20)),
                          ),
                          builder: (context) {
                            final user = FirebaseAuth.instance.currentUser;
                            return Container(
                              height: MediaQuery.of(context).size.height * 0.5,
                              padding: const EdgeInsets.all(20.0),
                              child: Column(
                                mainAxisSize: MainAxisSize.min,
                                crossAxisAlignment: CrossAxisAlignment.stretch,
                                children: [
                                  Row(
                                    mainAxisAlignment: MainAxisAlignment.spaceBetween,
                                    children: [
                                      const Text(
                                        'Notifications',
                                        style: TextStyle(
                                          fontSize: 18,
                                          fontWeight: FontWeight.bold,
                                          color: Color(0xFF1C1A24),
                                        ),
                                      ),
                                      IconButton(
                                        icon: const Icon(Icons.close, color: Color(0xFF787587)),
                                        onPressed: () => Navigator.pop(context),
                                      ),
                                    ],
                                  ),
                                  const Divider(color: Color(0xFFEBE8E1)),
                                  const SizedBox(height: 12),
                                  user == null
                                      ? const Center(
                                          child: Text(
                                            'Please log in to view notifications.',
                                            style: TextStyle(color: Color(0xFF787587)),
                                          ),
                                        )
                                      : Expanded(
                                          child: StreamBuilder<QuerySnapshot>(
                                            stream: FirebaseFirestore.instance
                                                .collection('users')
                                                .doc(user.uid)
                                                .collection('notifications')
                                                .orderBy('timestamp', descending: true)
                                                .snapshots(),
                                            builder: (context, snapshot) {
                                              if (snapshot.hasError) {
                                                return const Center(
                                                  child: Text(
                                                    'Error loading notifications.',
                                                    style: TextStyle(color: Color(0xFF787587)),
                                                  ),
                                                );
                                              }
                                              if (snapshot.connectionState == ConnectionState.waiting) {
                                                return const Center(
                                                  child: CircularProgressIndicator(color: Color(0xFF6B4EFF)),
                                                );
                                              }
                                              final docs = snapshot.data?.docs ?? [];
                                              if (docs.isEmpty) {
                                                return const Center(
                                                  child: Padding(
                                                    padding: EdgeInsets.symmetric(vertical: 24.0),
                                                    child: Text(
                                                      'No notifications yet.',
                                                      style: TextStyle(color: Color(0xFF787587), fontSize: 14),
                                                    ),
                                                  ),
                                                );
                                              }
                                              return ListView.builder(
                                                itemCount: docs.length,
                                                itemBuilder: (context, index) {
                                                  final data = docs[index].data() as Map<String, dynamic>;
                                                  final title = data['title'] ?? 'Notification';
                                                  final body = data['body'] ?? '';
                                                  return ListTile(
                                                    contentPadding: EdgeInsets.zero,
                                                    leading: const CircleAvatar(
                                                      backgroundColor: Color(0xFFF1ECFA),
                                                      child: Icon(Icons.notifications_active_outlined, color: Color(0xFF6B4EFF), size: 20),
                                                    ),
                                                    title: Text(title, style: const TextStyle(fontWeight: FontWeight.bold, color: Color(0xFF1C1A24))),
                                                    subtitle: Text(body, style: const TextStyle(color: Color(0xFF787587), fontSize: 12)),
                                                  );
                                                },
                                              );
                                            },
                                          ),
                                        ),
                                  const SizedBox(height: 20),
                                ],
                              ),
                            );
                          },
                        );
                      }
                    },
                  ),
                  if (unreadCount > 0)
                    Positioned(
                      right: 8,
                      top: 8,
                      child: Container(
                        padding: const EdgeInsets.all(2),
                        decoration: BoxDecoration(
                          color: const Color(0xFFBA1A1A),
                          borderRadius: BorderRadius.circular(10),
                        ),
                        constraints: const BoxConstraints(
                          minWidth: 16,
                          minHeight: 16,
                        ),
                        child: Text(
                          '$unreadCount',
                          style: const TextStyle(
                            color: Colors.white,
                            fontSize: 10,
                            fontWeight: FontWeight.bold,
                          ),
                          textAlign: TextAlign.center,
                        ),
                      ),
                    ),
                ],
              );
            },
          ),
          const SizedBox(width: 12),
        ],
      ),
      body: Builder(
        builder: (context) {
          // Trigger Daily Motivation Notification once per app run / session
          if (!_motivationNotifiedToday) {
            _motivationNotifiedToday = true;
            WidgetsBinding.instance.addPostFrameCallback((_) async {
              await NotificationService().showNotification(
                id: 999,
                title: 'Daily Motivation',
                body: motivationText,
              );
            });
          }
          return SingleChildScrollView(
        padding: const EdgeInsets.symmetric(horizontal: 20.0, vertical: 12.0),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            // Greeting Block
            Text(
              '${getGreeting()}, $name',
              style: Theme.of(context).textTheme.headlineMedium?.copyWith(
                    fontWeight: FontWeight.bold,
                    fontSize: 22,
                    color: const Color(0xFF1C1A24),
                  ),
            ),
            const SizedBox(height: 4),
            const Text(
              "Let's build some momentum today.",
              style: TextStyle(
                fontSize: 14,
                color: Color(0xFF787587),
              ),
            ),
            const SizedBox(height: 20),

            // Daily Motivation Quote Block
            Container(
              padding: const EdgeInsets.all(20),
              decoration: BoxDecoration(
                color: Colors.white,
                borderRadius: BorderRadius.circular(16),
                border: Border.all(color: const Color(0xFFEBE8E1)),
              ),
              child: Row(
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  const Icon(
                    Icons.format_quote_rounded,
                    color: Color(0xFF6B4EFF),
                    size: 26,
                  ),
                  const SizedBox(width: 12),
                  Expanded(
                    child: Column(
                      crossAxisAlignment: CrossAxisAlignment.start,
                      children: [
                        const Text(
                          'DAILY MOTIVATION',
                          style: TextStyle(
                            fontSize: 11,
                            fontWeight: FontWeight.bold,
                            letterSpacing: 0.8,
                            color: Color(0xFF6B4EFF),
                          ),
                        ),
                        const SizedBox(height: 6),
                        Text(
                          motivationText,
                          style: Theme.of(context).textTheme.bodyMedium?.copyWith(
                                color: const Color(0xFF1C1A24),
                                fontStyle: FontStyle.italic,
                                fontSize: 13,
                              ),
                        ),
                      ],
                    ),
                  ),
                ],
              ),
            ),
            const SizedBox(height: 20),

            // Metrics Grid
            GridView.count(
              crossAxisCount: 2,
              shrinkWrap: true,
              physics: const NeverScrollableScrollPhysics(),
              crossAxisSpacing: 16,
              mainAxisSpacing: 16,
              childAspectRatio: 1.05,
              children: [
                // Habits Streak card
                _buildMetricCard(
                  context,
                  title: 'HABIT STREAK',
                  value: streakStr,
                  subtitle: '$todayHabitsCount/${habit.habits.length} Today',
                  icon: Icons.check_rounded,
                  color: const Color(0xFF6B4EFF),
                ),
                // Budget Expense card
                _buildMetricCard(
                  context,
                  title: 'EXPENSES',
                  value: spentStr,
                  subtitle: 'This Month',
                  icon: Icons.account_balance_wallet_outlined,
                  color: const Color(0xFF00BFA5),
                ),
                // Academic GPA card
                _buildMetricCard(
                  context,
                  title: 'ACADEMIC CGPA',
                  value: cgpaStr,
                  subtitle: 'Nigerian 5.0 Scale',
                  icon: Icons.school_outlined,
                  color: const Color(0xFF6B4EFF),
                ),
                // Focus time logged
                _buildMetricCard(
                  context,
                  title: 'STUDY HOURS',
                  value: studyStr,
                  subtitle: 'Total Logged',
                  icon: Icons.timer_outlined,
                  color: const Color(0xFF00BFA5),
                ),
              ],
            ),
            // Goals & Milestones Block
            const SizedBox(height: 8),
            Row(
              mainAxisAlignment: MainAxisAlignment.spaceBetween,
              children: [
                Text(
                  'GOALS & PROGRESS',
                  style: TextStyle(
                    fontSize: 11,
                    fontWeight: FontWeight.bold,
                    letterSpacing: 0.8,
                    color: const Color(0xFF1C1A24).withOpacity(0.6),
                  ),
                ),
                TextButton(
                  onPressed: () {
                    Navigator.push(
                      context,
                      MaterialPageRoute(builder: (context) => const GoalsScreen()),
                    );
                  },
                  child: const Row(
                    children: [
                      Text('Manage', style: TextStyle(color: Color(0xFF6B4EFF), fontWeight: FontWeight.bold, fontSize: 13)),
                      Icon(Icons.chevron_right, color: Color(0xFF6B4EFF), size: 16),
                    ],
                  ),
                ),
              ],
            ),
            const SizedBox(height: 8),
            Builder(
              builder: (context) {
                // Compute progress for active goals
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

                if (activeGoals.isEmpty) {
                  return Container(
                    width: double.infinity,
                    padding: const EdgeInsets.symmetric(vertical: 24, horizontal: 20),
                    decoration: BoxDecoration(
                      color: Colors.white,
                      borderRadius: BorderRadius.circular(16),
                      border: Border.all(color: const Color(0xFFEBE8E1)),
                    ),
                    child: Column(
                      children: [
                        Icon(Icons.emoji_flags_outlined, color: const Color(0xFF6B4EFF).withOpacity(0.4), size: 36),
                        const SizedBox(height: 8),
                        const Text(
                          'No active goals',
                          style: TextStyle(fontWeight: FontWeight.bold, fontSize: 14, color: Color(0xFF1C1A24)),
                        ),
                        const SizedBox(height: 4),
                        const Text(
                          'Set a goal to keep track of your focus, habits, and budgets.',
                          textAlign: TextAlign.center,
                          style: TextStyle(fontSize: 12, color: Color(0xFF787587)),
                        ),
                        const SizedBox(height: 12),
                        OutlinedButton(
                          onPressed: () {
                            Navigator.push(
                              context,
                              MaterialPageRoute(builder: (context) => const GoalsScreen()),
                            );
                          },
                          style: OutlinedButton.styleFrom(
                            side: const BorderSide(color: Color(0xFF6B4EFF)),
                            shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(8)),
                          ),
                          child: const Text('Add a Goal', style: TextStyle(color: Color(0xFF6B4EFF), fontWeight: FontWeight.bold)),
                        ),
                      ],
                    ),
                  );
                }

                // Render at most 3 active goals
                final displayGoals = activeGoals.take(3).toList();

                return ListView.builder(
                  shrinkWrap: true,
                  physics: const NeverScrollableScrollPhysics(),
                  itemCount: displayGoals.length,
                  itemBuilder: (context, index) {
                    final item = displayGoals[index];
                    final goal = item['goal'] as Goal;
                    final double val = item['value'] as double;
                    
                    double percent = 0.0;
                    if (goal.targetValue > 0) {
                      percent = val / goal.targetValue;
                      if (percent > 1.0) percent = 1.0;
                      if (percent < 0.0) percent = 0.0;
                    }

                    Color progressColor = const Color(0xFF6B4EFF);
                    IconData goalIcon = Icons.flag_outlined;

                    if (goal.type == 'study') {
                      progressColor = const Color(0xFF6B4EFF);
                      goalIcon = Icons.timer_outlined;
                    } else if (goal.type == 'habit') {
                      progressColor = const Color(0xFF00BFA5);
                      goalIcon = Icons.check_circle_outline_rounded;
                    } else if (goal.type == 'academic') {
                      progressColor = const Color(0xFFE07A5F);
                      goalIcon = Icons.school_outlined;
                    } else if (goal.type == 'expense') {
                      progressColor = const Color(0xFF00BFA5);
                      goalIcon = Icons.account_balance_wallet_outlined;
                    }

                    return Container(
                      margin: const EdgeInsets.only(bottom: 12),
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
                              Row(
                                children: [
                                  Icon(goalIcon, color: progressColor, size: 18),
                                  const SizedBox(width: 8),
                                  Text(
                                    goal.title,
                                    style: const TextStyle(fontWeight: FontWeight.bold, fontSize: 13, color: Color(0xFF1C1A24)),
                                  ),
                                ],
                              ),
                              Text(
                                '${(percent * 100).toStringAsFixed(0)}%',
                                style: TextStyle(fontWeight: FontWeight.bold, fontSize: 12, color: progressColor),
                              ),
                            ],
                          ),
                          const SizedBox(height: 8),
                          ClipRRect(
                            borderRadius: BorderRadius.circular(4),
                            child: LinearProgressIndicator(
                              value: percent,
                              color: progressColor,
                              backgroundColor: const Color(0xFFEBE8E1),
                              minHeight: 6,
                            ),
                          ),
                          const SizedBox(height: 6),
                          Text(
                            goal.type == 'expense'
                                ? '₦${val.toStringAsFixed(0)} of ₦${goal.targetValue.toStringAsFixed(0)} limit'
                                : goal.attachedActivityId == 'gpa'
                                    ? 'GPA: ${val.toStringAsFixed(2)} / ${goal.targetValue.toStringAsFixed(2)}'
                                    : 'Progress: ${val.toStringAsFixed(1)} / ${goal.targetValue.toStringAsFixed(1)}',
                            style: const TextStyle(fontSize: 10, color: Color(0xFF787587)),
                          ),
                        ],
                      ),
                    );
                  },
                );
              },
            ),
            const SizedBox(height: 20),

            // Tip block at bottom
            Container(
              padding: const EdgeInsets.all(16),
              decoration: BoxDecoration(
                color: Colors.white,
                borderRadius: BorderRadius.circular(16),
                border: Border.all(color: const Color(0xFFEBE8E1)),
              ),
              child: const Row(
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  Icon(Icons.info_rounded, color: Color(0xFF6B4EFF), size: 22),
                  SizedBox(width: 12),
                  Expanded(
                    child: Text(
                      'Tap the bottom tabs to log daily habits, track expenses, calculate CGPA, or start a Pomodoro session.',
                      style: TextStyle(
                        fontSize: 13,
                        color: Color(0xFF1C1A24),
                        height: 1.3,
                      ),
                    ),
                  ),
                ],
              ),
            ),
            const SizedBox(height: 20),
          ],
        ),
      );
    }),
  );
}

  Widget _buildMetricCard(
    BuildContext context, {
    required String title,
    required String value,
    required String subtitle,
    required IconData icon,
    required Color color,
  }) {
    return Container(
      decoration: BoxDecoration(
        color: Colors.white,
        borderRadius: BorderRadius.circular(16),
        border: Border.all(color: const Color(0xFFEBE8E1)),
      ),
      padding: const EdgeInsets.all(16.0),
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        mainAxisAlignment: MainAxisAlignment.spaceBetween,
        children: [
          Container(
            padding: const EdgeInsets.all(8),
            decoration: BoxDecoration(
              color: color.withOpacity(0.12),
              shape: BoxShape.circle,
            ),
            child: Icon(icon, color: color, size: 20),
          ),
          Column(
            crossAxisAlignment: CrossAxisAlignment.start,
            children: [
              Text(
                value,
                style: Theme.of(context).textTheme.headlineMedium?.copyWith(
                      fontWeight: FontWeight.bold,
                      fontSize: 22,
                      color: const Color(0xFF1C1A24),
                    ),
              ),
              const SizedBox(height: 4),
              Text(
                title,
                style: const TextStyle(
                  fontWeight: FontWeight.bold,
                  fontSize: 10,
                  letterSpacing: 0.5,
                  color: Color(0xFF1C1A24),
                ),
              ),
              Text(
                subtitle,
                style: const TextStyle(
                  fontSize: 10,
                  color: Color(0xFF787587),
                ),
              ),
            ],
          ),
        ],
      ),
    );
  }
}

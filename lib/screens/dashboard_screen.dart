import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '../providers/academic_provider.dart';
import '../providers/expense_provider.dart';
import '../providers/habit_provider.dart';
import '../providers/study_provider.dart';
import '../providers/auth_provider.dart';

class DashboardScreen extends StatelessWidget {
  const DashboardScreen({super.key});

  @override
  Widget build(BuildContext context) {
    final academic = Provider.of<AcademicProvider>(context);
    final expense = Provider.of<ExpenseProvider>(context);
    final habit = Provider.of<HabitProvider>(context);
    final study = Provider.of<StudyProvider>(context);
    final auth = Provider.of<AuthProvider>(context);

    // Calculate completed habits today
    final now = DateTime.now();
    final todayHabitsCount = habit.habits.where((h) => h.completedDates.any((d) =>
        d.year == now.year && d.month == now.month && d.day == now.day)).length;

    // Study minutes calculation
    final totalStudyMin = (study.totalStudyTime / 60).toStringAsFixed(1);
    final hours = study.totalStudyTime ~/ 3600;
    final minutes = (study.totalStudyTime % 3600) ~/ 60;
    final studyStr = study.totalStudyTime > 0 ? '${hours}h ${minutes}m' : '0h 26m';

    // Calculate habits streak
    int maxStreak = 0;
    for (var h in habit.habits) {
      if (h.streak > maxStreak) maxStreak = h.streak;
    }
    final streakStr = maxStreak > 0 ? '$maxStreak Days' : '1 Days';

    // Total spent
    final totalSpent = expense.totalExpenses;
    final spentStr = totalSpent > 0 
        ? (totalSpent >= 1000 ? '₦${(totalSpent/1000).toStringAsFixed(1)}K' : '₦${totalSpent.toStringAsFixed(0)}')
        : '₦2K';

    // CGPA
    final cgpaStr = academic.cgpa > 0 ? academic.cgpa.toStringAsFixed(2) : '5.00';

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
        name = 'Toluwanimi Oyetade';
      }
    }

    return Scaffold(
      backgroundColor: const Color(0xFFFCF8FF), // Light background
      appBar: AppBar(
        backgroundColor: const Color(0xFFFCF8FF),
        elevation: 0,
        leading: Padding(
          padding: const EdgeInsets.all(8.0),
          child: Container(
            decoration: BoxDecoration(
              shape: BoxShape.circle,
              border: Border.all(color: const Color(0xFFE5E0EF), width: 1),
            ),
            child: const CircleAvatar(
              backgroundImage: NetworkImage('https://lh3.googleusercontent.com/aida-public/AB6AXuDJTCYNIwjQp1Ayy5Iu_QPg58mn1ELlbD5qmto9VR2dW7TeZx_ILV6Ht-tuYDbgHGziyYwhqXvnUB8OfkgHB63Yuk8cz1hEn3fqW4jPRqiuQTaf6y52olTtKh35HTa1dUucXLH37_FTdmcqD1ky8P6lIRkSc5VI41hLSSl9UR_r6VwbdXr6HRt12U3cCb59FGNodTzK332hAVrdzdmviVpe6J14opRNav4moh2zbme46lMJELep4RCrHK5PrA5fw31xsepP4zNaueLX'),
            ),
          ),
        ),
        title: Image.network(
          'https://lh3.googleusercontent.com/aida-public/AB6AXuDlZ9mtsTYcAYYtR2IYEPglS5Ug12cbammBVKPnlzvsI3jJLVvtBygzfG7FqJ-_AiuK2Eh6DrqV4_0Sy9jbF6WIE7ArJu49fj2Bri5dhhPjSBO8IlWz5Z7COQzZ_UYPZvoZODTU9XnWgUMHduQTQ1Enu317bzlFWCBmKCmQ360ihNzQy0kI8UdxWpN0iFki01qCSXddKsu_7xSajFR6lwe7THfYljvQsF_U7zTmWA3I8FbkKmthA3lfiRLw_yfIq9fU_Ke87gIivycO',
          height: 32,
          errorBuilder: (context, error, stackTrace) {
            return const Text('P U L Z E', style: TextStyle(fontWeight: FontWeight.bold));
          },
        ),
        actions: [
          IconButton(
            icon: const Icon(Icons.notifications_none_rounded, color: Color(0xFF6B4EFF)),
            onPressed: () {},
          ),
        ],
      ),
      body: SingleChildScrollView(
        padding: const EdgeInsets.symmetric(horizontal: 24.0, vertical: 16.0),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            // Greeting Block
            Text(
              '${getGreeting()}, $name',
              style: Theme.of(context).textTheme.headlineMedium?.copyWith(
                    fontWeight: FontWeight.bold,
                    color: const Color(0xFF1C1A24),
                  ),
            ),
            const SizedBox(height: 4),
            const Text(
              "Let's build some momentum today.",
              style: TextStyle(
                fontFamily: 'Inter',
                fontSize: 14,
                color: Color(0xFF787587),
              ),
            ),
            const SizedBox(height: 24),

            // Daily Motivation Quote Block
            Container(
              padding: const EdgeInsets.all(16),
              decoration: BoxDecoration(
                color: const Color(0xFFF1ECFA), // surface-container
                borderRadius: BorderRadius.circular(12),
                border: Border.all(color: const Color(0xFFE5E0EF)),
              ),
              child: Row(
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  const Icon(
                    Icons.format_quote_rounded,
                    color: Color(0xFF6B4EFF),
                    size: 24,
                  ),
                  const SizedBox(width: 12),
                  Expanded(
                    child: Column(
                      crossAxisAlignment: CrossAxisAlignment.start,
                      children: [
                        const Text(
                          'DAILY MOTIVATION',
                          style: TextStyle(
                            fontFamily: 'Inter',
                            fontSize: 11,
                            fontWeight: FontWeight.w600,
                            letterSpacing: 0.8,
                            color: Color(0xFF6B4EFF),
                          ),
                        ),
                        const SizedBox(height: 4),
                        Text(
                          'Manage your pocket money wisely. A wealthy student is a disciplined student.',
                          style: Theme.of(context).textTheme.bodyMedium?.copyWith(
                                color: const Color(0xFF1C1A24),
                                fontStyle: FontStyle.italic,
                              ),
                        ),
                      ],
                    ),
                  ),
                ],
              ),
            ),
            const SizedBox(height: 24),

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
                  icon: Icons.check_circle_outline_rounded,
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
                  color: const Color(0xFFE07A5F),
                ),
                // Focus time logged
                _buildMetricCard(
                  context,
                  title: 'STUDY HOURS',
                  value: studyStr,
                  subtitle: 'Total Logged',
                  icon: Icons.timer_outlined,
                  color: const Color(0xFFEF4444),
                ),
              ],
            ),
            const SizedBox(height: 24),

            // Tip block at bottom
            Container(
              padding: const EdgeInsets.all(16),
              decoration: BoxDecoration(
                color: const Color(0xFFF1ECFA), // surface-container
                borderRadius: BorderRadius.circular(12),
                border: Border.all(color: const Color(0xFFE5E0EF)),
              ),
              child: const Row(
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  Icon(Icons.info_outline_rounded, color: Color(0xFF6B4EFF)),
                  SizedBox(width: 12),
                  Expanded(
                    child: Text(
                      'Tap the bottom tabs to log daily habits, track expenses, calculate CGPA, or start a Pomodoro session.',
                      style: TextStyle(
                        fontFamily: 'Inter',
                        fontSize: 13,
                        color: Color(0xFF1C1A24),
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
  }

  Widget _buildMetricCard(
    BuildContext context, {
    required String title,
    required String value,
    required String subtitle,
    required IconData icon,
    required Color color,
  }) {
    return Card(
      color: Colors.white,
      child: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          mainAxisAlignment: MainAxisAlignment.spaceBetween,
          children: [
            Row(
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
              ],
            ),
            Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                Text(
                  value,
                  style: Theme.of(context).textTheme.headlineMedium?.copyWith(
                        fontFamily: 'Space Grotesk',
                        fontWeight: FontWeight.bold,
                        fontSize: 22,
                        color: const Color(0xFF1C1A24),
                      ),
                ),
                const SizedBox(height: 4),
                Text(
                  title,
                  style: const TextStyle(
                    fontFamily: 'Inter',
                    fontWeight: FontWeight.bold,
                    fontSize: 11,
                    letterSpacing: 0.5,
                    color: Color(0xFF1C1A24),
                  ),
                ),
                Text(
                  subtitle,
                  style: const TextStyle(
                    fontFamily: 'Inter',
                    fontSize: 10,
                    color: Color(0xFF787587),
                  ),
                ),
              ],
            ),
          ],
        ),
      ),
    );
  }
}

import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '../providers/academic_provider.dart';
import '../providers/expense_provider.dart';
import '../providers/habit_provider.dart';
import '../providers/study_provider.dart';
import '../providers/goal_provider.dart';

import 'dashboard_screen.dart';
import 'academics_screen.dart';
import 'habits_screen.dart';
import 'expenses_screen.dart';
import 'study_screen.dart';
import 'profile_screen.dart';

class NavigationScreen extends StatefulWidget {
  const NavigationScreen({super.key});

  @override
  State<NavigationScreen> createState() => _NavigationScreenState();
}

class _NavigationScreenState extends State<NavigationScreen> {
  int _selectedIndex = 0;

  final List<Widget> _screens = const [
    DashboardScreen(),
    HabitsScreen(),
    ExpensesScreen(),
    AcademicsScreen(),
    StudyScreen(),
    ProfileScreen(),
  ];

  @override
  void initState() {
    super.initState();
    // Initialize Firestore data streaming listeners
    WidgetsBinding.instance.addPostFrameCallback((_) {
      final academic = Provider.of<AcademicProvider>(context, listen: false);
      final expense = Provider.of<ExpenseProvider>(context, listen: false);
      final habit = Provider.of<HabitProvider>(context, listen: false);
      final study = Provider.of<StudyProvider>(context, listen: false);
      final goal = Provider.of<GoalProvider>(context, listen: false);

      academic.initListener();
      expense.initListener();
      habit.initListener();
      study.initListener();
      goal.initListener();

      void runCheck() {
        if (!mounted) return;
        goal.checkProgressAndAlerts(
          sessions: study.sessions,
          habits: habit.habits,
          expenses: expense.expenses,
          cgpa: academic.cgpa,
          totalCredits: academic.semesters.fold<double>(0.0, (sum, sem) => sum + sem.totalCreditUnits),
        );
      }

      study.addListener(runCheck);
      habit.addListener(runCheck);
      expense.addListener(runCheck);
      academic.addListener(runCheck);
      goal.addListener(runCheck);
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: IndexedStack(
        index: _selectedIndex,
        children: _screens,
      ),
      bottomNavigationBar: NavigationBar(
        selectedIndex: _selectedIndex,
        onDestinationSelected: (int index) {
          setState(() {
            _selectedIndex = index;
          });
        },
        destinations: const [
          NavigationDestination(
            icon: Icon(Icons.home_outlined),
            selectedIcon: Icon(Icons.home_outlined, color: Color(0xFF6B4EFF)),
            label: 'Home',
          ),
          NavigationDestination(
            icon: Icon(Icons.check_circle_outline),
            selectedIcon: Icon(Icons.check_circle_outline, color: Color(0xFF6B4EFF)),
            label: 'Habits',
          ),
          NavigationDestination(
            icon: Icon(Icons.account_balance_wallet_outlined),
            selectedIcon: Icon(Icons.account_balance_wallet_outlined, color: Color(0xFF6B4EFF)),
            label: 'Expenses',
          ),
          NavigationDestination(
            icon: Icon(Icons.school_outlined),
            selectedIcon: Icon(Icons.school_outlined, color: Color(0xFF6B4EFF)),
            label: 'Academics',
          ),
          NavigationDestination(
            icon: Icon(Icons.timer_outlined),
            selectedIcon: Icon(Icons.timer_outlined, color: Color(0xFF6B4EFF)),
            label: 'Study',
          ),
          NavigationDestination(
            icon: Icon(Icons.person_outline),
            selectedIcon: Icon(Icons.person_outline, color: Color(0xFF6B4EFF)),
            label: 'Profile',
          ),
        ],
      ),
    );
  }
}

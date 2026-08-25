import 'package:flutter/material.dart';
import 'package:firebase_core/firebase_core.dart';
import 'package:provider/provider.dart';

import 'firebase_options.dart';
import 'theme.dart';
import 'providers/auth_provider.dart';
import 'providers/academic_provider.dart';
import 'providers/expense_provider.dart';
import 'providers/habit_provider.dart';
import 'providers/study_provider.dart';
import 'providers/goal_provider.dart';
import 'screens/splash_screen.dart';
import 'services/notification_service.dart';

void main() async {
  WidgetsFlutterBinding.ensureInitialized();

  try {
    await Firebase.initializeApp(
      options: DefaultFirebaseOptions.currentPlatform,
    );
    // Initialize notifications in the background to avoid blocking the first frame render
    NotificationService().init().catchError((e) {
      debugPrint('Notification initialization warning: $e');
    });
  } catch (e) {
    debugPrint('Initialization warning: $e');
  }

  runApp(
    MultiProvider(
      providers: [
        ChangeNotifierProvider(create: (_) => AuthProvider()),
        ChangeNotifierProvider(create: (_) => AcademicProvider()),
        ChangeNotifierProvider(create: (_) => ExpenseProvider()),
        ChangeNotifierProvider(create: (_) => HabitProvider()),
        ChangeNotifierProvider(create: (_) => StudyProvider()),
        ChangeNotifierProvider(create: (_) => GoalProvider()),
      ],
      child: const PulzeApp(),
    ),
  );
}

class PulzeApp extends StatelessWidget {
  const PulzeApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Pulze',
      navigatorKey: NotificationService.navigatorKey,
      debugShowCheckedModeBanner: false,
      theme: AppTheme.darkTheme,
      home: const SplashScreen(),
    );
  }
}

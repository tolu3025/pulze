import 'package:flutter/material.dart';
import 'package:shared_preferences/shared_preferences.dart';
import 'login_screen.dart';

class OnboardingScreen extends StatefulWidget {
  const OnboardingScreen({super.key});

  @override
  State<OnboardingScreen> createState() => _OnboardingScreenState();
}

class _OnboardingScreenState extends State<OnboardingScreen> {
  void _finishOnboarding() async {
    final prefs = await SharedPreferences.getInstance();
    await prefs.setBool('completed_onboarding', true);
    if (!mounted) return;
    Navigator.of(context).pushReplacement(
      MaterialPageRoute(builder: (_) => const LoginScreen()),
    );
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: const Color(0xFFFDF5E6), // Warm Parchment
      body: SafeArea(
        bottom: false,
        child: Column(
          children: [
            // Illustration Area
            Expanded(
              flex: 3,
              child: Container(
                width: double.infinity,
                padding: const EdgeInsets.only(top: 16),
                child: Image.network(
                  'https://lh3.googleusercontent.com/aida-public/AB6AXuDm9wVftLWVLmRHvIpDmyQdgNaqTXgw7ZNkK7HGE7E1BC9X2u_0XZ6oQQZJKGl7uOo3-lRjneGTCQLmtmNh7p0e_d3Kz494_QbFShCGlOct5E5vaUWZXy4Ss-e6LMsgfpFxjwDcAU7GYliiYcowVRQISQLUQcJZbe4ONSR4GhjoFDDUoJHbmPc3Lv-5CnoKa_tei7YCAmJXaowjDxugXJ5FBia5hppHIy5qiyYAlRUxVuqQC585m0k7la0PhLBW16GvCib9HPG35-GT',
                  fit: BoxFit.cover,
                  alignment: Alignment.topCenter,
                  errorBuilder: (context, error, stackTrace) {
                    return const Center(
                      child: Icon(Icons.park_outlined, size: 100, color: Color(0xFF00BFA5)),
                    );
                  },
                ),
              ),
            ),
            // Content Area
            Container(
              width: double.infinity,
              padding: const EdgeInsets.fromLTRB(24, 16, 24, 40),
              decoration: const BoxDecoration(
                color: Color(0xFFFDF5E6),
                boxShadow: [
                  BoxShadow(
                    color: Color(0xFFFDF5E6),
                    offset: Offset(0, -20),
                    blurRadius: 20,
                    spreadRadius: 20,
                  ),
                ],
              ),
              child: Column(
                mainAxisSize: MainAxisSize.min,
                children: [
                  // Logo
                  Image.asset(
                    'assets/logo_text.png',
                    height: 50,
                    errorBuilder: (context, error, stackTrace) {
                      return Text(
                        'P U L Z E',
                        style: Theme.of(context).textTheme.headlineMedium?.copyWith(
                              color: const Color(0xFF6B4EFF),
                              fontWeight: FontWeight.bold,
                              letterSpacing: 4,
                            ),
                      );
                    },
                  ),
                  const SizedBox(height: 12),
                  // Tagline
                  Text(
                    'Your rhythm. Your growth. Your Pulze.',
                    style: Theme.of(context).textTheme.bodyLarge?.copyWith(
                          color: const Color(0xFF787587),
                          fontWeight: FontWeight.w500,
                        ),
                    textAlign: TextAlign.center,
                  ),
                  const SizedBox(height: 40),
                  // Button
                  SizedBox(
                    width: double.infinity,
                    height: 54,
                    child: ElevatedButton(
                      onPressed: _finishOnboarding,
                      style: ElevatedButton.styleFrom(
                        backgroundColor: const Color(0xFF6B4EFF), // Deep Amethyst
                        elevation: 0,
                        shape: RoundedRectangleBorder(
                          borderRadius: BorderRadius.circular(12),
                        ),
                        shadowColor: const Color(0xFF6B4EFF).withOpacity(0.2),
                      ),
                      child: const Text(
                        'Get Started',
                        style: TextStyle(
                          fontSize: 16,
                          fontWeight: FontWeight.bold,
                          color: Colors.white,
                        ),
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
}

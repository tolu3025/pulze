import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'package:image_picker/image_picker.dart';
import 'package:firebase_storage/firebase_storage.dart';
import '../providers/auth_provider.dart';
import 'login_screen.dart';
import 'sus_screen.dart';

class ProfileScreen extends StatelessWidget {
  const ProfileScreen({super.key});

  void _showEditProfileDialog(BuildContext context, AuthProvider authProvider) {
    final nameParts = (authProvider.user?.displayName ?? '').split(' ');
    final firstNameController = TextEditingController(text: nameParts.isNotEmpty ? nameParts.first : '');
    final lastNameController = TextEditingController(text: nameParts.length > 1 ? nameParts.sublist(1).join(' ') : '');

    bool isSaving = false;
    showDialog(
      context: context,
      builder: (context) => AlertDialog(
        backgroundColor: const Color(0xFFF9F8F6),
        title: const Text('Edit Profile', style: TextStyle(color: Color(0xFF1C1A24), fontWeight: FontWeight.bold)),
        content: Column(
          mainAxisSize: MainAxisSize.min,
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            TextField(
              controller: firstNameController,
              decoration: const InputDecoration(labelText: 'First Name'),
            ),
            const SizedBox(height: 16),
            TextField(
              controller: lastNameController,
              decoration: const InputDecoration(labelText: 'Last Name'),
            ),
          ],
        ),
        actions: [
          TextButton(
            onPressed: () => Navigator.pop(context),
            child: const Text('Cancel', style: TextStyle(color: Color(0xFF787587))),
          ),
          StatefulBuilder(
            builder: (context, setState) {
              return ElevatedButton(
                onPressed: isSaving
                    ? null
                    : () async {
                        final first = firstNameController.text.trim();
                        final last = lastNameController.text.trim();
                        if (first.isNotEmpty) {
                          setState(() => isSaving = true);
                          try {
                            await authProvider.updateProfileName(first, last);
                            if (context.mounted) Navigator.pop(context);
                          } catch (e) {
                            if (context.mounted) {
                              ScaffoldMessenger.of(context).showSnackBar(
                                SnackBar(content: Text('Failed to update name: $e')),
                              );
                            }
                          } finally {
                            setState(() => isSaving = false);
                          }
                        }
                      },
                style: ElevatedButton.styleFrom(backgroundColor: const Color(0xFF6B4EFF)),
                child: isSaving
                    ? const SizedBox(
                        width: 20,
                        height: 20,
                        child: CircularProgressIndicator(color: Colors.white, strokeWidth: 2),
                      )
                    : const Text('Save', style: TextStyle(color: Colors.white, fontWeight: FontWeight.bold)),
              );
            },
          ),
        ],
      ),
    );
  }

  @override
  Widget build(BuildContext context) {
    final authProvider = Provider.of<AuthProvider>(context);
    final email = authProvider.user?.email ?? 'student@example.com';

    return Scaffold(
      backgroundColor: const Color(0xFFF9F8F6),
      appBar: AppBar(
        backgroundColor: const Color(0xFFF9F8F6),
        elevation: 0,
        title: const Text(
          'Profile',
          style: TextStyle(color: Color(0xFF1C1A24), fontWeight: FontWeight.bold),
        ),
      ),
      body: Padding(
        padding: const EdgeInsets.all(24.0),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.stretch,
          children: [
            const SizedBox(height: 20),
            Center(
              child: CircleAvatar(
                radius: 50,
                backgroundColor: const Color(0xFF6B4EFF).withOpacity(0.12),
                backgroundImage: NetworkImage('https://api.dicebear.com/7.x/bottts/png?seed=${authProvider.user?.uid ?? "default"}'),
              ),
            ),
            const SizedBox(height: 24),
            Text(
              authProvider.user?.displayName ?? 'Student',
              textAlign: TextAlign.center,
              style: const TextStyle(fontSize: 20, fontWeight: FontWeight.bold, color: Color(0xFF1C1A24)),
            ),
            const SizedBox(height: 4),
            Text(
              email,
              textAlign: TextAlign.center,
              style: const TextStyle(color: Color(0xFF787587), fontSize: 14),
            ),
            const SizedBox(height: 8),
            Center(
              child: TextButton.icon(
                onPressed: () => _showEditProfileDialog(context, authProvider),
                icon: const Icon(Icons.edit_outlined, size: 16, color: Color(0xFF6B4EFF)),
                label: const Text('Edit Profile Name', style: TextStyle(color: Color(0xFF6B4EFF))),
              ),
            ),
            const SizedBox(height: 16),
            
            // Actions Card
            Container(
              decoration: BoxDecoration(
                color: Colors.white,
                borderRadius: BorderRadius.circular(16),
                border: Border.all(color: const Color(0xFFEBE8E1)),
              ),
              child: Column(
                children: [
                  ListTile(
                    leading: const Icon(Icons.feedback_outlined, color: Color(0xFF6B4EFF)),
                    title: const Text('Take Usability Test', style: TextStyle(color: Color(0xFF1C1A24), fontWeight: FontWeight.bold)),
                    subtitle: const Text('Evaluate app usability using the standard SUS test.', style: TextStyle(color: Color(0xFF787587), fontSize: 12)),
                    trailing: const Icon(Icons.chevron_right_rounded, color: Color(0xFF787587)),
                    onTap: () {
                      Navigator.of(context).push(
                        MaterialPageRoute(builder: (_) => const SusScreen()),
                      );
                    },
                  ),
                  const Divider(height: 1, color: Color(0xFFEBE8E1)),
                  const ListTile(
                    leading: const Icon(Icons.info_outline_rounded, color: Color(0xFF6B4EFF)),
                    title: Text('Version', style: TextStyle(color: Color(0xFF1C1A24), fontWeight: FontWeight.bold)),
                    trailing: Text('1.0.1+2', style: TextStyle(color: Color(0xFF787587))),
                  ),
                ],
              ),
            ),
            
            const Spacer(),
            
            // Sign Out Button
            ElevatedButton.icon(
              onPressed: () async {
                await authProvider.signOut();
                if (context.mounted) {
                  Navigator.of(context).pushAndRemoveUntil(
                    MaterialPageRoute(builder: (_) => const LoginScreen()),
                    (route) => false,
                  );
                }
              },
              icon: const Icon(Icons.logout_rounded, color: Colors.white),
              label: const Text('Sign Out', style: TextStyle(color: Colors.white, fontSize: 16, fontWeight: FontWeight.bold)),
              style: ElevatedButton.styleFrom(
                backgroundColor: const Color(0xFFE07A5F), // Orange color as verified in decompiler stop buttons
                elevation: 0,
                padding: const EdgeInsets.symmetric(vertical: 16),
                shape: RoundedRectangleBorder(
                  borderRadius: BorderRadius.circular(16),
                ),
              ),
            ),
            const SizedBox(height: 20),
          ],
        ),
      ),
    );
  }
}

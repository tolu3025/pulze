import 'package:cloud_firestore/cloud_firestore.dart';
import 'package:flutter/material.dart';
import '../services/firebase_service.dart';

class SusScreen extends StatefulWidget {
  const SusScreen({super.key});

  @override
  State<SusScreen> createState() => _SusScreenState();
}

class _SusScreenState extends State<SusScreen> {
  final FirebaseService _firebaseService = FirebaseService();
  bool _isSubmitting = false;

  final List<String> _questions = [
    'I think that I would like to use this system frequently.',
    'I found the system unnecessarily complex.',
    'I thought the system was easy to use.',
    'I think that I would need the support of a technical person to be able to use this system.',
    'I found the various functions in this system were well integrated.',
    'I thought there was too much inconsistency in this system.',
    'I would imagine that most people would learn to use this system very quickly.',
    'I found the system very cumbersome to use.',
    'I felt very confident using the system.',
    'I needed to learn a lot of things before I could get going with this system.',
  ];

  final Map<int, int> _scores = {};

  @override
  void initState() {
    super.initState();
    // Default score is 3 (neutral) for all 10 questions
    for (int i = 0; i < 10; i++) {
      _scores[i] = 3;
    }
  }

  void _submitSurvey() async {
    setState(() {
      _isSubmitting = true;
    });

    try {
      // Calculate SUS score
      // For odd questions (0, 2, 4, 6, 8): Score = response - 1
      // For even questions (1, 3, 5, 7, 9): Score = 5 - response
      // Sum the scores and multiply by 2.5 to get overall score (out of 100)
      double totalScore = 0.0;
      for (int i = 0; i < 10; i++) {
        int resp = _scores[i] ?? 3;
        if (i % 2 == 0) {
          totalScore += (resp - 1);
        } else {
          totalScore += (5 - resp);
        }
      }
      final double finalSusScore = totalScore * 2.5;

      // Save to user sub-collection
      await _firebaseService.userDoc.collection('sus_surveys').add({
        'responses': _scores.map((k, v) => MapEntry(k.toString(), v)),
        'score': finalSusScore,
        'date': Timestamp.now(),
      });

      if (mounted) {
        showDialog(
          context: context,
          builder: (context) => AlertDialog(
            backgroundColor: const Color(0xFF1E293B),
            title: const Text('Thank You'),
            content: Text('Your feedback has been submitted successfully.\nCalculated Usability Score: $finalSusScore/100'),
            actions: [
              TextButton(
                onPressed: () {
                  Navigator.pop(context); // Pop dialog
                  Navigator.pop(context); // Pop SUS screen
                },
                child: const Text('Close', style: TextStyle(color: Color(0xFF6366F1))),
              )
            ],
          ),
        );
      }
    } catch (e) {
      if (mounted) {
        ScaffoldMessenger.of(context).showSnackBar(
          SnackBar(content: Text('Error submitting survey: $e')),
        );
      }
    } finally {
      if (mounted) {
        setState(() {
          _isSubmitting = false;
        });
      }
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Usability Survey (SUS)'),
      ),
      body: _isSubmitting 
          ? const Center(child: CircularProgressIndicator(color: Color(0xFF6366F1)))
          : ListView.builder(
              itemCount: _questions.length + 1,
              padding: const EdgeInsets.all(20.0),
              itemBuilder: (context, index) {
                if (index == _questions.length) {
                  return Padding(
                    padding: const EdgeInsets.symmetric(vertical: 24.0),
                    child: ElevatedButton(
                      onPressed: _submitSurvey,
                      style: ElevatedButton.styleFrom(
                        backgroundColor: const Color(0xFF6366F1),
                        padding: const EdgeInsets.symmetric(vertical: 16),
                        shape: RoundedRectangleBorder(
                          borderRadius: BorderRadius.circular(12),
                        ),
                      ),
                      child: const Text(
                        'Submit Survey',
                        style: TextStyle(color: Colors.white, fontSize: 16, fontWeight: FontWeight.bold),
                      ),
                    ),
                  );
                }

                return Card(
                  margin: const EdgeInsets.only(bottom: 16),
                  child: Padding(
                    padding: const EdgeInsets.all(16.0),
                    child: Column(
                      crossAxisAlignment: CrossAxisAlignment.start,
                      children: [
                        Text(
                          '${index + 1}. ${_questions[index]}',
                          style: const TextStyle(fontSize: 14, fontWeight: FontWeight.bold, color: Colors.white),
                        ),
                        const SizedBox(height: 12),
                        Row(
                          mainAxisAlignment: MainAxisAlignment.spaceBetween,
                          children: [
                            const Text('Strongly\nDisagree', style: TextStyle(fontSize: 10, color: Color(0xFF94A3B8))),
                            ...List.generate(5, (valIdx) {
                              final val = valIdx + 1;
                              final selected = _scores[index] == val;
                              return GestureDetector(
                                onTap: () {
                                  setState(() {
                                    _scores[index] = val;
                                  });
                                },
                                child: Container(
                                  width: 36,
                                  height: 36,
                                  decoration: BoxDecoration(
                                    color: selected ? const Color(0xFF6366F1) : const Color(0xFF0F172A),
                                    shape: BoxShape.circle,
                                    border: Border.all(
                                      color: selected ? Colors.transparent : Colors.white10,
                                    ),
                                  ),
                                  alignment: Alignment.center,
                                  child: Text(
                                    '$val',
                                    style: TextStyle(
                                      color: selected ? Colors.white : const Color(0xFF94A3B8),
                                      fontWeight: FontWeight.bold,
                                    ),
                                  ),
                                ),
                              );
                            }),
                            const Text('Strongly\nAgree', style: TextStyle(fontSize: 10, color: Color(0xFF94A3B8))),
                          ],
                        ),
                      ],
                    ),
                  ),
                );
              },
            ),
    );
  }
}

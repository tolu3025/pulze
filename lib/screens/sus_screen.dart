import 'package:cloud_firestore/cloud_firestore.dart';
import 'package:flutter/material.dart';
import 'package:intl/intl.dart';
import '../services/firebase_service.dart';

class SusScreen extends StatefulWidget {
  const SusScreen({super.key});

  @override
  State<SusScreen> createState() => _SusScreenState();
}

class _SusScreenState extends State<SusScreen> {
  final FirebaseService _firebaseService = FirebaseService();
  bool _isSubmitting = false;

  final List<String> _questions = const [
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
      // For odd questions (1, 3, 5, 7, 9): Score = response - 1
      // For even questions (2, 4, 6, 8, 10): Score = 5 - response
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

      // Save to user sub-collection 'sus_evaluations' as verified by AOT bytes
      await _firebaseService.userDoc.collection('sus_evaluations').add({
        'responses': _scores.map((k, v) => MapEntry(k.toString(), v)),
        'score': finalSusScore,
        'date': Timestamp.now(),
      });

      if (mounted) {
        showDialog(
          context: context,
          builder: (context) => AlertDialog(
            backgroundColor: const Color(0xFFF9F8F6),
            title: const Text('Thank You', style: TextStyle(color: Color(0xFF1C1A24))),
            content: Text(
              'Your Usability Score is: $finalSusScore/100',
              style: const TextStyle(color: Color(0xFF1C1A24), fontSize: 16),
            ),
            actions: [
              TextButton(
                onPressed: () {
                  Navigator.pop(context); // Pop dialog
                  Navigator.pop(context); // Pop SUS screen
                },
                child: const Text('Close', style: TextStyle(color: Color(0xFF6B4EFF))),
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
      backgroundColor: const Color(0xFFF9F8F6),
      appBar: AppBar(
        backgroundColor: const Color(0xFFF9F8F6),
        title: const Text(
          'PULZE USABILITY TEST',
          style: TextStyle(
            color: Color(0xFF1C1A24),
            fontWeight: FontWeight.bold,
            fontSize: 18,
          ),
        ),
      ),
      body: _isSubmitting
          ? const Center(child: CircularProgressIndicator(color: Color(0xFF6B4EFF)))
          : CustomScrollView(
              slivers: [
                SliverPadding(
                  padding: const EdgeInsets.all(20.0),
                  sliver: SliverList(
                    delegate: SliverChildListDelegate([
                      const Text(
                        'Evaluate the app usability using the standard SUS test.',
                        style: TextStyle(fontSize: 16, fontWeight: FontWeight.bold, color: Color(0xFF1C1A24)),
                      ),
                      const SizedBox(height: 8),
                      const Text(
                        'Please rate your agreement with the statements below from 1 (Strongly Disagree) to 5 (Strongly Agree).',
                        style: TextStyle(fontSize: 13, color: Color(0xFF787587), height: 1.4),
                      ),
                      const SizedBox(height: 24),
                    ]),
                  ),
                ),
                
                // 10 SUS Questions List
                SliverList(
                  delegate: SliverChildBuilderDelegate(
                    (context, index) {
                      return Container(
                        margin: const EdgeInsets.symmetric(horizontal: 20, vertical: 8),
                        padding: const EdgeInsets.all(16.0),
                        decoration: BoxDecoration(
                          color: Colors.white,
                          borderRadius: BorderRadius.circular(16),
                          border: Border.all(color: const Color(0xFFEBE8E1)),
                        ),
                        child: Column(
                          crossAxisAlignment: CrossAxisAlignment.start,
                          children: [
                            Text(
                              '${index + 1}. ${_questions[index]}',
                              style: const TextStyle(fontSize: 14, fontWeight: FontWeight.bold, color: Color(0xFF1C1A24)),
                            ),
                            const SizedBox(height: 16),
                            Row(
                              mainAxisAlignment: MainAxisAlignment.spaceBetween,
                              children: [
                                const Text('Strongly\nDisagree', style: TextStyle(fontSize: 10, color: Color(0xFF787587)), textAlign: TextAlign.center),
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
                                        color: selected ? const Color(0xFF6B4EFF) : Colors.white,
                                        shape: BoxShape.circle,
                                        border: Border.all(
                                          color: selected ? Colors.transparent : const Color(0xFFEBE8E1),
                                        ),
                                      ),
                                      alignment: Alignment.center,
                                      child: Text(
                                        '$val',
                                        style: TextStyle(
                                          color: selected ? Colors.white : const Color(0xFF1C1A24),
                                          fontWeight: FontWeight.bold,
                                        ),
                                      ),
                                    ),
                                  );
                                }),
                                const Text('Strongly\nAgree', style: TextStyle(fontSize: 10, color: Color(0xFF787587)), textAlign: TextAlign.center),
                              ],
                            ),
                          ],
                        ),
                      );
                    },
                    childCount: _questions.length,
                  ),
                ),
                
                // Submit Button
                SliverPadding(
                  padding: const EdgeInsets.symmetric(horizontal: 20, vertical: 24),
                  sliver: SliverList(
                    delegate: SliverChildListDelegate([
                      SizedBox(
                        height: 54,
                        child: ElevatedButton(
                          onPressed: _submitSurvey,
                          style: ElevatedButton.styleFrom(
                            backgroundColor: const Color(0xFF6B4EFF),
                            shape: RoundedRectangleBorder(
                              borderRadius: BorderRadius.circular(16),
                            ),
                            elevation: 0,
                          ),
                          child: const Text(
                            'Submit Usability Test',
                            style: TextStyle(color: Colors.white, fontSize: 16, fontWeight: FontWeight.bold),
                          ),
                        ),
                      ),
                      const SizedBox(height: 32),
                      const Divider(color: Color(0xFFEBE8E1)),
                      const SizedBox(height: 16),
                      const Text(
                        'PAST USABILITY TESTS',
                        style: TextStyle(fontSize: 14, fontWeight: FontWeight.bold, color: Color(0xFF1C1A24), letterSpacing: 0.5),
                      ),
                      const SizedBox(height: 12),
                    ]),
                  ),
                ),
                
                // Stream builder for past usability tests
                StreamBuilder<QuerySnapshot>(
                  stream: _firebaseService.userDoc
                      .collection('sus_evaluations')
                      .orderBy('date', descending: true)
                      .snapshots(),
                  builder: (context, snapshot) {
                    if (snapshot.hasError || !snapshot.hasData) {
                      return const SliverToBoxAdapter(child: SizedBox());
                    }
                    final docs = snapshot.data!.docs;
                    if (docs.isEmpty) {
                      return const SliverPadding(
                        padding: EdgeInsets.symmetric(horizontal: 20.0),
                        sliver: SliverToBoxAdapter(
                          child: Text(
                            'No past tests completed.',
                            style: TextStyle(color: Color(0xFF787587), fontSize: 13),
                          ),
                        ),
                      );
                    }
                    return SliverList(
                      delegate: SliverChildBuilderDelegate(
                        (context, index) {
                          final doc = docs[index];
                          final data = doc.data() as Map<String, dynamic>;
                          final score = data['score'] as double? ?? 0.0;
                          final timestamp = data['date'] as Timestamp?;
                          final dateStr = timestamp != null
                              ? DateFormat('MMM d, yyyy @ h:mm a').format(timestamp.toDate())
                              : '';
                          return Container(
                            margin: const EdgeInsets.symmetric(horizontal: 20, vertical: 6),
                            padding: const EdgeInsets.all(16),
                            decoration: BoxDecoration(
                              color: Colors.white,
                              borderRadius: BorderRadius.circular(12),
                              border: Border.all(color: const Color(0xFFEBE8E1)),
                            ),
                            child: Row(
                              mainAxisAlignment: MainAxisAlignment.spaceBetween,
                              children: [
                                Column(
                                  crossAxisAlignment: CrossAxisAlignment.start,
                                  children: [
                                    const Text('Usability Score', style: TextStyle(fontWeight: FontWeight.bold, color: Color(0xFF1C1A24), fontSize: 14)),
                                    const SizedBox(height: 2),
                                    Text(dateStr, style: const TextStyle(color: Color(0xFF787587), fontSize: 11)),
                                  ],
                                ),
                                Text(
                                  '${score.toStringAsFixed(1)}/100',
                                  style: const TextStyle(
                                    fontWeight: FontWeight.bold,
                                    fontSize: 16,
                                    color: Color(0xFF6B4EFF),
                                  ),
                                ),
                              ],
                            ),
                          );
                        },
                        childCount: docs.length,
                      ),
                    );
                  },
                ),
                const SliverToBoxAdapter(child: SizedBox(height: 40)),
              ],
            ),
    );
  }
}

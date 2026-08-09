import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '../providers/habit_provider.dart';

class HabitsScreen extends StatelessWidget {
  const HabitsScreen({super.key});

  void _showHabitFormBottomSheet(BuildContext context) {
    final titleController = TextEditingController();
    String selectedFreq = 'Daily';
    final List<String> frequencies = ['Daily', 'Weekly', 'Weekdays', 'Weekends'];

    showModalBottomSheet(
      context: context,
      backgroundColor: const Color(0xFF1E293B),
      isScrollControlled: true,
      builder: (context) {
        return StatefulBuilder(
          builder: (context, setState) {
            return Padding(
              padding: EdgeInsets.only(
                bottom: MediaQuery.of(context).viewInsets.bottom,
                left: 20,
                right: 20,
                top: 20,
              ),
              child: Column(
                mainAxisSize: MainAxisSize.min,
                crossAxisAlignment: CrossAxisAlignment.stretch,
                children: [
                  const Text(
                    'Create New Habit',
                    style: TextStyle(fontSize: 18, fontWeight: FontWeight.bold, color: Colors.white),
                  ),
                  const SizedBox(height: 16),
                  TextField(
                    controller: titleController,
                    decoration: const InputDecoration(
                      labelText: 'Habit Title (e.g. Read 15 pages)',
                      border: OutlineInputBorder(),
                    ),
                  ),
                  const SizedBox(height: 16),
                  DropdownButtonFormField<String>(
                    value: selectedFreq,
                    dropdownColor: const Color(0xFF1E293B),
                    decoration: const InputDecoration(
                      labelText: 'Frequency',
                      border: OutlineInputBorder(),
                    ),
                    items: frequencies.map((freq) {
                      return DropdownMenuItem(
                        value: freq,
                        child: Text(freq),
                      );
                    }).toList(),
                    onChanged: (val) {
                      if (val != null) {
                        setState(() {
                          selectedFreq = val;
                        });
                      }
                    },
                  ),
                  const SizedBox(height: 24),
                  ElevatedButton(
                    onPressed: () {
                      final title = titleController.text.trim();
                      if (title.isNotEmpty) {
                        Provider.of<HabitProvider>(context, listen: false)
                            .addHabit(title, selectedFreq);
                        Navigator.pop(context);
                      }
                    },
                    style: ElevatedButton.styleFrom(
                      backgroundColor: const Color(0xFF6366F1),
                      padding: const EdgeInsets.symmetric(vertical: 16),
                    ),
                    child: const Text('Create Habit', style: TextStyle(color: Colors.white, fontSize: 16)),
                  ),
                  const SizedBox(height: 20),
                ],
              ),
            );
          },
        );
      },
    );
  }

  @override
  Widget build(BuildContext context) {
    final habitProvider = Provider.of<HabitProvider>(context);
    final now = DateTime.now();

    return Scaffold(
      appBar: AppBar(
        title: const Text('Habits'),
        actions: [
          IconButton(
            icon: const Icon(Icons.add_rounded),
            onPressed: () => _showHabitFormBottomSheet(context),
          ),
        ],
      ),
      body: habitProvider.isLoading
          ? const Center(child: CircularProgressIndicator(color: Color(0xFF6366F1)))
          : habitProvider.habits.isEmpty
              ? const Center(
                  child: Text(
                    'No habits tracked yet.\nTap "+" in the top right to start.',
                    style: TextStyle(color: Color(0xFF94A3B8), fontSize: 16),
                    textAlign: TextAlign.center,
                  ),
                )
              : ListView.builder(
                  itemCount: habitProvider.habits.length,
                  padding: const EdgeInsets.all(20.0),
                  itemBuilder: (context, index) {
                    final habit = habitProvider.habits[index];
                    
                    // Check if completed today
                    final bool completedToday = habit.completedDates.any((d) =>
                        d.year == now.year && d.month == now.month && d.day == now.day);

                    return Container(
                      margin: const EdgeInsets.only(bottom: 16),
                      padding: const EdgeInsets.all(16),
                      decoration: BoxDecoration(
                        color: const Color(0xFF1E293B),
                        borderRadius: BorderRadius.circular(16),
                        border: Border.all(
                          color: completedToday 
                              ? const Color(0xFF6366F1).withOpacity(0.3) 
                              : Colors.white.withOpacity(0.03),
                        ),
                      ),
                      child: Row(
                        children: [
                          // Custom checkbox / checkbox action
                          IconButton(
                            icon: Icon(
                              completedToday ? Icons.check_circle_rounded : Icons.radio_button_unchecked_rounded,
                              color: completedToday ? const Color(0xFF10B981) : const Color(0xFF94A3B8),
                              size: 30,
                            ),
                            onPressed: () {
                              habitProvider.toggleHabitCompletion(habit.id, now);
                            },
                          ),
                          const SizedBox(width: 12),
                          
                          // Title & details
                          Expanded(
                            child: Column(
                              crossAxisAlignment: CrossAxisAlignment.start,
                              children: [
                                Text(
                                  habit.title,
                                  style: TextStyle(
                                    fontSize: 16,
                                    fontWeight: FontWeight.bold,
                                    color: Colors.white,
                                    decoration: completedToday ? TextDecoration.lineThrough : null,
                                  ),
                                ),
                                const SizedBox(height: 4),
                                Text(
                                  habit.frequency,
                                  style: const TextStyle(fontSize: 12, color: Color(0xFF94A3B8)),
                                ),
                              ],
                            ),
                          ),
                          
                          // Streak Counter
                          Container(
                            padding: const EdgeInsets.symmetric(horizontal: 10, vertical: 6),
                            decoration: BoxDecoration(
                              color: const Color(0xFFF59E0B).withOpacity(0.15),
                              borderRadius: BorderRadius.circular(12),
                            ),
                            child: Row(
                              children: [
                                const Icon(Icons.local_fire_department_rounded, color: Color(0xFFF59E0B), size: 16),
                                const SizedBox(width: 4),
                                Text(
                                  '${habit.streak}',
                                  style: const TextStyle(
                                    color: Color(0xFFF59E0B),
                                    fontWeight: FontWeight.bold,
                                    fontSize: 13,
                                  ),
                                ),
                              ],
                            ),
                          ),
                          const SizedBox(width: 8),
                          
                          // Delete button
                          IconButton(
                            icon: const Icon(Icons.delete_outline, size: 20, color: Color(0xFF94A3B8)),
                            onPressed: () {
                              habitProvider.deleteHabit(habit.id);
                            },
                          ),
                        ],
                      ),
                    );
                  },
                ),
    );
  }
}

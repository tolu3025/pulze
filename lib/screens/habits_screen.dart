import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'package:intl/intl.dart';
import '../providers/habit_provider.dart';
import '../models/models.dart';

class HabitsScreen extends StatefulWidget {
  const HabitsScreen({super.key});

  @override
  State<HabitsScreen> createState() => _HabitsScreenState();
}

class _HabitsScreenState extends State<HabitsScreen> with SingleTickerProviderStateMixin {
  DateTime _selectedDate = DateTime.now();
  late TabController _tabController;

  @override
  void initState() {
    super.initState();
    // Tab 0: Habits list, Tab 1: Tasks Calendar
    _tabController = TabController(length: 2, vsync: this);
  }

  @override
  void dispose() {
    _tabController.dispose();
    super.dispose();
  }

  // Habits form bottom sheet
  void _showHabitFormBottomSheet(BuildContext context) {
    final titleController = TextEditingController();
    String selectedFreq = 'Daily';
    final List<String> frequencies = ['Daily', 'Weekly', 'Weekdays', 'Weekends'];

    bool isCreating = false;
    showModalBottomSheet(
      context: context,
      backgroundColor: const Color(0xFFF9F8F6),
      isScrollControlled: true,
      shape: const RoundedRectangleBorder(
        borderRadius: BorderRadius.vertical(top: Radius.circular(20)),
      ),
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
                    style: TextStyle(
                      fontSize: 18, 
                      fontWeight: FontWeight.bold, 
                      color: Color(0xFF1C1A24),
                    ),
                  ),
                  const SizedBox(height: 16),
                  TextField(
                    controller: titleController,
                    decoration: const InputDecoration(
                      labelText: 'Habit Title (e.g. Read 15 pages)',
                      labelStyle: TextStyle(color: Color(0xFF787587)),
                      border: OutlineInputBorder(),
                      focusedBorder: OutlineInputBorder(
                        borderSide: BorderSide(color: Color(0xFF6B4EFF)),
                      ),
                    ),
                    style: const TextStyle(color: Color(0xFF1C1A24)),
                  ),
                  const SizedBox(height: 16),
                  DropdownButtonFormField<String>(
                    value: selectedFreq,
                    dropdownColor: const Color(0xFFF9F8F6),
                    decoration: const InputDecoration(
                      labelText: 'Frequency',
                      border: OutlineInputBorder(),
                      focusedBorder: OutlineInputBorder(
                        borderSide: BorderSide(color: Color(0xFF6B4EFF)),
                      ),
                    ),
                    style: const TextStyle(color: Color(0xFF1C1A24)),
                    items: frequencies.map((freq) {
                      return DropdownMenuItem(
                        value: freq,
                        child: Text(freq),
                      );
                    }).toList(),
                    onChanged: (val) {
                      if (val != null) {
                        selectedFreq = val;
                      }
                    },
                  ),
                  const SizedBox(height: 24),
                  ElevatedButton(
                    onPressed: isCreating
                        ? null
                        : () async {
                            final title = titleController.text.trim();
                            if (title.isNotEmpty) {
                              setState(() => isCreating = true);
                              try {
                                await Provider.of<HabitProvider>(context, listen: false)
                                    .addHabit(title, selectedFreq);
                                if (context.mounted) Navigator.pop(context);
                              } catch (e) {
                                if (context.mounted) {
                                  ScaffoldMessenger.of(context).showSnackBar(
                                    SnackBar(content: Text('Failed to add habit: Permission Denied or Network Error.')),
                                  );
                                }
                              } finally {
                                setState(() => isCreating = false);
                              }
                            }
                          },
                    style: ElevatedButton.styleFrom(
                      backgroundColor: const Color(0xFF6B4EFF),
                      padding: const EdgeInsets.symmetric(vertical: 16),
                      shape: RoundedRectangleBorder(
                        borderRadius: BorderRadius.circular(12),
                      ),
                    ),
                    child: isCreating
                        ? const SizedBox(
                            width: 20,
                            height: 20,
                            child: CircularProgressIndicator(color: Colors.white, strokeWidth: 2),
                          )
                        : const Text('Create Habit', style: TextStyle(color: Colors.white, fontSize: 16, fontWeight: FontWeight.bold)),
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

  // Day tasks bottom sheet (as verified in decompiler evidence)
  void _showDayTasksBottomSheet(BuildContext context, DateTime date) {
    final titleController = TextEditingController();

    bool isAddingTask = false;
    showModalBottomSheet(
      context: context,
      backgroundColor: const Color(0xFFF9F8F6),
      isScrollControlled: true,
      shape: const RoundedRectangleBorder(
        borderRadius: BorderRadius.vertical(top: Radius.circular(20)),
      ),
      builder: (context) {
        return StatefulBuilder(
          builder: (context, setState) {
            return Consumer<HabitProvider>(
              builder: (context, provider, child) {
                final dayTasks = provider.tasks.where((t) =>
                    t.date.year == date.year &&
                    t.date.month == date.month &&
                    t.date.day == date.day).toList();

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
                      Row(
                        mainAxisAlignment: MainAxisAlignment.spaceBetween,
                        children: [
                          Text(
                            'Tasks for ${DateFormat('MMM d, yyyy').format(date)}',
                            style: const TextStyle(
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
                      
                      // Task Input field
                      Row(
                        children: [
                          Expanded(
                            child: TextField(
                              controller: titleController,
                              decoration: const InputDecoration(
                                hintText: 'Add a task...',
                                hintStyle: TextStyle(color: Color(0xFF787587)),
                                border: InputBorder.none,
                              ),
                              style: const TextStyle(color: Color(0xFF1C1A24)),
                            ),
                          ),
                          isAddingTask
                              ? const Padding(
                                  padding: EdgeInsets.all(8.0),
                                  child: SizedBox(
                                    width: 24,
                                    height: 24,
                                    child: CircularProgressIndicator(color: Color(0xFF6B4EFF), strokeWidth: 2),
                                  ),
                                )
                              : IconButton(
                                  icon: const Icon(Icons.add_circle, color: Color(0xFF6B4EFF), size: 30),
                                  onPressed: () async {
                                    final text = titleController.text.trim();
                                    if (text.isNotEmpty) {
                                      setState(() => isAddingTask = true);
                                      try {
                                        await provider.addTask(text, date);
                                        titleController.clear();
                                      } catch (e) {
                                        if (context.mounted) {
                                          ScaffoldMessenger.of(context).showSnackBar(
                                            SnackBar(content: Text('Failed to add task: Permission Denied or Network Error.')),
                                          );
                                        }
                                      } finally {
                                        setState(() => isAddingTask = false);
                                      }
                                    }
                                  },
                                ),
                        ],
                      ),
                      const Divider(color: Color(0xFFEBE8E1)),

                  // Tasks list
                  ConstrainedBox(
                    constraints: BoxConstraints(
                      maxHeight: MediaQuery.of(context).size.height * 0.4,
                    ),
                    child: dayTasks.isEmpty
                        ? const Padding(
                            padding: EdgeInsets.symmetric(vertical: 24.0),
                            child: Text(
                              'No tasks scheduled for this day',
                              style: TextStyle(color: Color(0xFF787587), fontSize: 14),
                              textAlign: TextAlign.center,
                            ),
                          )
                        : ListView.builder(
                            shrinkWrap: true,
                            itemCount: dayTasks.length,
                            itemBuilder: (context, index) {
                              final task = dayTasks[index];
                              return _TaskEntry(task: task);
                            },
                          ),
                  ),
                  const SizedBox(height: 20),
                ],
              ),
            ); // close Padding
          }, // close Consumer builder
        ); // close Consumer
      }, // close StatefulBuilder builder
    ); // close StatefulBuilder
  }, // close showModalBottomSheet builder
); // close showModalBottomSheet
}

  // Build the horizontal weekday date selector
  Widget _buildHorizontalDateSelector() {
    final now = DateTime.now();
    // List representing a 14-day window centered on today
    final days = List.generate(14, (index) => now.subtract(const Duration(days: 6)).add(Duration(days: index)));

    return Container(
      height: 80,
      padding: const EdgeInsets.symmetric(vertical: 10),
      child: ListView.builder(
        scrollDirection: Axis.horizontal,
        itemCount: days.length,
        padding: const EdgeInsets.symmetric(horizontal: 16),
        itemBuilder: (context, index) {
          final day = days[index];
          final isSelected = day.year == _selectedDate.year &&
              day.month == _selectedDate.month &&
              day.day == _selectedDate.day;

          return GestureDetector(
            onTap: () {
              setState(() {
                _selectedDate = day;
              });
            },
            child: Container(
              width: 50,
              margin: const EdgeInsets.symmetric(horizontal: 4),
              decoration: BoxDecoration(
                color: isSelected ? const Color(0xFF6B4EFF) : Colors.white,
                borderRadius: BorderRadius.circular(12),
                border: Border.all(
                  color: isSelected ? Colors.transparent : const Color(0xFFEBE8E1),
                ),
              ),
              child: Column(
                mainAxisAlignment: MainAxisAlignment.center,
                children: [
                  Text(
                    DateFormat('E').format(day)[0], // W, T, F...
                    style: TextStyle(
                      fontSize: 12,
                      fontWeight: FontWeight.bold,
                      color: isSelected ? Colors.white : const Color(0xFF787587),
                    ),
                  ),
                  const SizedBox(height: 4),
                  Text(
                    DateFormat('d').format(day),
                    style: TextStyle(
                      fontSize: 15,
                      fontWeight: FontWeight.bold,
                      color: isSelected ? Colors.white : const Color(0xFF1C1A24),
                    ),
                  ),
                ],
              ),
            ),
          );
        },
      ),
    );
  }

  @override
  Widget build(BuildContext context) {
    final habitProvider = Provider.of<HabitProvider>(context);
    final now = DateTime.now();

    return Scaffold(
      backgroundColor: const Color(0xFFF9F8F6),
      appBar: AppBar(
        backgroundColor: const Color(0xFFF9F8F6),
        title: const Text(
          'Habits & Tasks',
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
            Tab(text: 'Daily Habits'),
            Tab(text: 'Calendar Tasks'),
          ],
        ),
      ),
      body: TabBarView(
        controller: _tabController,
        children: [
          // Habits list Tab
          habitProvider.isLoading
              ? const Center(child: CircularProgressIndicator(color: Color(0xFF6B4EFF)))
              : habitProvider.habits.isEmpty
                  ? Center(
                      child: Column(
                        mainAxisAlignment: MainAxisAlignment.center,
                        children: [
                          const Text(
                            'No habits tracked yet.\nTap "+" to start.',
                            style: TextStyle(color: Color(0xFF787587), fontSize: 16),
                            textAlign: TextAlign.center,
                          ),
                          const SizedBox(height: 16),
                          ElevatedButton.icon(
                            onPressed: () => _showHabitFormBottomSheet(context),
                            icon: const Icon(Icons.add_rounded, color: Colors.white),
                            label: const Text('Add Habit', style: TextStyle(color: Colors.white)),
                            style: ElevatedButton.styleFrom(
                              backgroundColor: const Color(0xFF6B4EFF),
                            ),
                          )
                        ],
                      ),
                    )
                  : ListView.builder(
                      itemCount: habitProvider.habits.length,
                      padding: const EdgeInsets.all(20.0),
                      itemBuilder: (context, index) {
                        final habit = habitProvider.habits[index];
                        final bool completedToday = habit.completedDates.any((d) =>
                            d.year == now.year && d.month == now.month && d.day == now.day);

                        return Container(
                          margin: const EdgeInsets.only(bottom: 16),
                          padding: const EdgeInsets.all(16),
                          decoration: BoxDecoration(
                            color: Colors.white,
                            borderRadius: BorderRadius.circular(16),
                            border: Border.all(
                              color: completedToday 
                                  ? const Color(0xFF6B4EFF).withOpacity(0.3) 
                                  : const Color(0xFFEBE8E1),
                            ),
                          ),
                          child: Row(
                            children: [
                              IconButton(
                                icon: Icon(
                                  completedToday ? Icons.check_circle_rounded : Icons.radio_button_unchecked_rounded,
                                  color: completedToday ? const Color(0xFF00BFA5) : const Color(0xFF787587),
                                  size: 30,
                                ),
                                onPressed: () {
                                  habitProvider.toggleHabitCompletion(habit.id, now);
                                },
                              ),
                              const SizedBox(width: 12),
                              Expanded(
                                child: Column(
                                  crossAxisAlignment: CrossAxisAlignment.start,
                                  children: [
                                    Text(
                                      habit.title,
                                      style: TextStyle(
                                        fontSize: 16,
                                        fontWeight: FontWeight.bold,
                                        color: const Color(0xFF1C1A24),
                                        decoration: completedToday ? TextDecoration.lineThrough : null,
                                      ),
                                    ),
                                    const SizedBox(height: 4),
                                    Text(
                                      habit.frequency,
                                      style: const TextStyle(fontSize: 12, color: Color(0xFF787587)),
                                    ),
                                  ],
                                ),
                              ),
                              Container(
                                padding: const EdgeInsets.symmetric(horizontal: 10, vertical: 6),
                                decoration: BoxDecoration(
                                  color: const Color(0xFF00BFA5).withOpacity(0.12),
                                  borderRadius: BorderRadius.circular(12),
                                ),
                                child: Row(
                                  children: [
                                    const Icon(Icons.local_fire_department_rounded, color: Color(0xFF00BFA5), size: 16),
                                    const SizedBox(width: 4),
                                    Text(
                                      '${habit.streak}',
                                      style: const TextStyle(
                                        color: Color(0xFF00BFA5),
                                        fontWeight: FontWeight.bold,
                                        fontSize: 13,
                                      ),
                                    ),
                                  ],
                                ),
                              ),
                              const SizedBox(width: 8),
                              IconButton(
                                icon: const Icon(Icons.delete_outline, size: 20, color: Color(0xFF787587)),
                                onPressed: () {
                                  habitProvider.deleteHabit(habit.id);
                                },
                              ),
                            ],
                          ),
                        );
                      },
                    ),

          // Calendar Tasks Tab
          Column(
            children: [
              _buildHorizontalDateSelector(),
              const Divider(color: Color(0xFFEBE8E1), height: 1),
              
              // Daily Tasks panel
              Expanded(
                child: Consumer<HabitProvider>(
                  builder: (context, provider, child) {
                    final selectedDayTasks = provider.tasks.where((t) =>
                        t.date.year == _selectedDate.year &&
                        t.date.month == _selectedDate.month &&
                        t.date.day == _selectedDate.day).toList();

                    return Column(
                      children: [
                        Padding(
                          padding: const EdgeInsets.symmetric(horizontal: 20.0, vertical: 16.0),
                          child: Row(
                            mainAxisAlignment: MainAxisAlignment.spaceBetween,
                            children: [
                              Text(
                                'Tasks List (${selectedDayTasks.length})',
                                style: const TextStyle(
                                  fontWeight: FontWeight.bold, 
                                  fontSize: 16, 
                                  color: Color(0xFF1C1A24),
                                ),
                              ),
                              ElevatedButton.icon(
                                onPressed: () => _showDayTasksBottomSheet(context, _selectedDate),
                                icon: const Icon(Icons.add, size: 18, color: Colors.white),
                                label: const Text('Manage Tasks', style: TextStyle(color: Colors.white)),
                                style: ElevatedButton.styleFrom(
                                  backgroundColor: const Color(0xFF6B4EFF),
                                  elevation: 0,
                                  shape: RoundedRectangleBorder(
                                    borderRadius: BorderRadius.circular(12),
                                  ),
                                ),
                              ),
                            ],
                          ),
                        ),
                        Expanded(
                          child: selectedDayTasks.isEmpty
                              ? const Center(
                                  child: Text(
                                    'No tasks scheduled for this day',
                                    style: TextStyle(color: Color(0xFF787587), fontSize: 16),
                                  ),
                                )
                              : ListView.builder(
                                  itemCount: selectedDayTasks.length,
                                  padding: const EdgeInsets.symmetric(horizontal: 20.0),
                                  itemBuilder: (context, index) {
                                    final task = selectedDayTasks[index];
                                    return _TaskEntry(task: task);
                                  },
                                ),
                        ),
                      ],
                    );
                  },
                ),
              ),
            ],
          ),
        ],
      ),
      floatingActionButton: FloatingActionButton(
        onPressed: () {
          if (_tabController.index == 0) {
            _showHabitFormBottomSheet(context);
          } else {
            _showDayTasksBottomSheet(context, _selectedDate);
          }
        },
        backgroundColor: const Color(0xFF6B4EFF),
        child: const Icon(Icons.add_rounded, color: Colors.white, size: 30),
      ),
    );
  }
}

// Private _TaskEntry implementation matching binary details
class _TaskEntry extends StatelessWidget {
  final CalendarTask task;

  const _TaskEntry({required this.task});

  @override
  Widget build(BuildContext context) {
    final habitProvider = Provider.of<HabitProvider>(context, listen: false);

    return Container(
      margin: const EdgeInsets.only(bottom: 12),
      padding: const EdgeInsets.symmetric(horizontal: 16, vertical: 8),
      decoration: BoxDecoration(
        color: Colors.white,
        borderRadius: BorderRadius.circular(12),
        border: Border.all(color: const Color(0xFFEBE8E1)),
      ),
      child: Row(
        children: [
          IconButton(
            icon: Icon(
              task.isCompleted ? Icons.check_box : Icons.check_box_outline_blank,
              color: task.isCompleted ? const Color(0xFF00BFA5) : const Color(0xFF787587),
            ),
            onPressed: () {
              habitProvider.toggleTaskCompletion(task.id, task.isCompleted);
            },
          ),
          const SizedBox(width: 8),
          Expanded(
            child: Text(
              task.title,
              style: TextStyle(
                fontSize: 15,
                color: const Color(0xFF1C1A24),
                decoration: task.isCompleted ? TextDecoration.lineThrough : null,
              ),
            ),
          ),
          IconButton(
            icon: const Icon(Icons.delete_outline, size: 20, color: Color(0xFF787587)),
            onPressed: () {
              habitProvider.deleteTask(task.id);
            },
          ),
        ],
      ),
    );
  }
}

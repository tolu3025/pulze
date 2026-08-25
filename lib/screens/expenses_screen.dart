import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'package:fl_chart/fl_chart.dart';
import 'package:intl/intl.dart';
import '../providers/expense_provider.dart';
import '../providers/goal_provider.dart';
import '../models/models.dart';

class ExpensesScreen extends StatefulWidget {
  const ExpensesScreen({super.key});

  @override
  State<ExpensesScreen> createState() => _ExpensesScreenState();
}

class _ExpensesScreenState extends State<ExpensesScreen> with SingleTickerProviderStateMixin {
  late TabController _tabController;
  String _selectedMonthFilter = 'This Month';
  String _selectedCategoryFilter = 'All';

  List<String> get _monthFilters {
    final now = DateTime.now();
    final List<String> filters = ['This Month', 'Last Month'];
    final List<String> months = [
      'January', 'February', 'March', 'April', 'May', 'June',
      'July', 'August', 'September', 'October', 'November', 'December'
    ];
    filters.addAll(months);
    filters.add('${now.year}');
    filters.add('${now.year - 1}');
    filters.add('${now.year - 2}');
    filters.add('All Time');
    return filters;
  }
  final List<String> _categoryFilters = ['All', 'Food', 'Transport', 'Books', 'Entertainment', 'Bills', 'Other'];

  @override
  void initState() {
    super.initState();
    _tabController = TabController(length: 3, vsync: this);
  }

  @override
  void dispose() {
    _tabController.dispose();
    super.dispose();
  }

  void _showExpenseFormBottomSheet(BuildContext context) {
    final titleController = TextEditingController();
    final amountController = TextEditingController();
    String selectedCategory = 'Food';
    final List<String> categories = ['Food', 'Transport', 'Books', 'Entertainment', 'Bills', 'Other'];

    showModalBottomSheet(
      context: context,
      backgroundColor: Colors.white,
      shape: const RoundedRectangleBorder(borderRadius: BorderRadius.vertical(top: Radius.circular(20))),
      isScrollControlled: true,
      builder: (context) {
        return StatefulBuilder(
          builder: (context, setState) {
            return Padding(
              padding: EdgeInsets.only(
                bottom: MediaQuery.of(context).viewInsets.bottom,
                left: 20,
                right: 20,
                top: 24,
              ),
              child: Column(
                mainAxisSize: MainAxisSize.min,
                crossAxisAlignment: CrossAxisAlignment.stretch,
                children: [
                  const Text(
                    'Add Expense',
                    style: TextStyle(fontSize: 18, fontWeight: FontWeight.bold, color: Color(0xFF1C1A24)),
                  ),
                  const SizedBox(height: 16),
                  TextField(
                    controller: titleController,
                    style: const TextStyle(color: Color(0xFF1C1A24)),
                    decoration: InputDecoration(
                      labelText: 'Title / Description',
                      labelStyle: const TextStyle(color: Color(0xFF787587)),
                      enabledBorder: OutlineInputBorder(
                        borderRadius: BorderRadius.circular(12),
                        borderSide: const BorderSide(color: Color(0xFFEBE8E1)),
                      ),
                      focusedBorder: OutlineInputBorder(
                        borderRadius: BorderRadius.circular(12),
                        borderSide: const BorderSide(color: Color(0xFF6B4EFF), width: 2),
                      ),
                    ),
                  ),
                  const SizedBox(height: 16),
                  TextField(
                    controller: amountController,
                    style: const TextStyle(color: Color(0xFF1C1A24)),
                    decoration: InputDecoration(
                      labelText: 'Amount (₦)',
                      labelStyle: const TextStyle(color: Color(0xFF787587)),
                      enabledBorder: OutlineInputBorder(
                        borderRadius: BorderRadius.circular(12),
                        borderSide: const BorderSide(color: Color(0xFFEBE8E1)),
                      ),
                      focusedBorder: OutlineInputBorder(
                        borderRadius: BorderRadius.circular(12),
                        borderSide: const BorderSide(color: Color(0xFF6B4EFF), width: 2),
                      ),
                    ),
                    keyboardType: const TextInputType.numberWithOptions(decimal: true),
                  ),
                  const SizedBox(height: 16),
                  DropdownButtonFormField<String>(
                    value: selectedCategory,
                    dropdownColor: Colors.white,
                    style: const TextStyle(color: Color(0xFF1C1A24)),
                    decoration: InputDecoration(
                      labelText: 'Category',
                      labelStyle: const TextStyle(color: Color(0xFF787587)),
                      enabledBorder: OutlineInputBorder(
                        borderRadius: BorderRadius.circular(12),
                        borderSide: const BorderSide(color: Color(0xFFEBE8E1)),
                      ),
                      focusedBorder: OutlineInputBorder(
                        borderRadius: BorderRadius.circular(12),
                        borderSide: const BorderSide(color: Color(0xFF6B4EFF), width: 2),
                      ),
                    ),
                    items: categories.map((cat) {
                      return DropdownMenuItem(
                        value: cat,
                        child: Text(cat),
                      );
                    }).toList(),
                    onChanged: (val) {
                      if (val != null) {
                        setState(() {
                          selectedCategory = val;
                        });
                      }
                    },
                  ),
                  const SizedBox(height: 24),
                  Builder(
                    builder: (context) {
                      bool isSaving = false;
                      return StatefulBuilder(
                        builder: (context, setState) {
                          return ElevatedButton(
                            onPressed: isSaving ? null : () async {
                              final title = titleController.text.trim();
                              final amt = double.tryParse(amountController.text) ?? 0.0;
                              if (title.isNotEmpty && amt > 0) {
                                setState(() => isSaving = true);
                                try {
                                  await Provider.of<ExpenseProvider>(context, listen: false)
                                      .addExpense(title, selectedCategory, amt, DateTime.now());
                                  if (context.mounted) Navigator.pop(context);
                                } catch (e) {
                                  if (context.mounted) {
                                    ScaffoldMessenger.of(context).showSnackBar(
                                      SnackBar(content: Text('Failed to add expense: Permission Denied or Network Error.')),
                                    );
                                  }
                                } finally {
                                  setState(() => isSaving = false);
                                }
                              }
                            },
                            style: ElevatedButton.styleFrom(
                              backgroundColor: const Color(0xFF6B4EFF),
                              padding: const EdgeInsets.symmetric(vertical: 16),
                              shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(12)),
                            ),
                            child: isSaving
                                ? const SizedBox(
                                    width: 20,
                                    height: 20,
                                    child: CircularProgressIndicator(color: Colors.white, strokeWidth: 2),
                                  )
                                : const Text('Add Expense', style: TextStyle(color: Colors.white, fontSize: 16, fontWeight: FontWeight.bold)),
                          );
                        },
                      );
                    },
                  ),
                  const SizedBox(height: 24),
                ],
              ),
            );
          },
        );
      },
    );
  }

  List<Expense> _getFilteredExpenses(List<Expense> expenses) {
    final now = DateTime.now();
    final List<String> months = [
      'January', 'February', 'March', 'April', 'May', 'June',
      'July', 'August', 'September', 'October', 'November', 'December'
    ];
    return expenses.where((e) {
      bool monthMatch = true;
      if (_selectedMonthFilter == 'This Month') {
        monthMatch = e.date.year == now.year && e.date.month == now.month;
      } else if (_selectedMonthFilter == 'Last Month') {
        int year = now.year;
        int month = now.month - 1;
        if (month == 0) {
          month = 12;
          year -= 1;
        }
        monthMatch = e.date.year == year && e.date.month == month;
      } else if (months.contains(_selectedMonthFilter)) {
        final monthIndex = months.indexOf(_selectedMonthFilter) + 1;
        monthMatch = e.date.year == now.year && e.date.month == monthIndex;
      } else if (int.tryParse(_selectedMonthFilter) != null) {
        final year = int.parse(_selectedMonthFilter);
        monthMatch = e.date.year == year;
      }
      
      bool catMatch = true;
      if (_selectedCategoryFilter != 'All') {
        catMatch = e.category == _selectedCategoryFilter;
      }
      return monthMatch && catMatch;
    }).toList();
  }

  @override
  Widget build(BuildContext context) {
    final expenseProvider = Provider.of<ExpenseProvider>(context);
    final categoryTotals = expenseProvider.getCategoryTotals();
    final filteredExpenses = _getFilteredExpenses(expenseProvider.expenses);

    return Scaffold(
      backgroundColor: const Color(0xFFF9F8F6),
      appBar: AppBar(
        backgroundColor: const Color(0xFFF9F8F6),
        title: const Text('Expenses', style: TextStyle(color: Color(0xFF1C1A24), fontWeight: FontWeight.bold, fontSize: 22)),
        actions: [
          IconButton(
            icon: const Icon(Icons.add_rounded, color: Color(0xFF6B4EFF)),
            onPressed: () => _showExpenseFormBottomSheet(context),
          ),
        ],
        bottom: TabBar(
          controller: _tabController,
          labelColor: const Color(0xFF6B4EFF),
          unselectedLabelColor: const Color(0xFF787587),
          indicatorColor: const Color(0xFF6B4EFF),
          tabs: const [
            Tab(text: 'History'),
            Tab(text: 'Charts'),
            Tab(text: 'Goals'),
          ],
        ),
      ),
      body: TabBarView(
        controller: _tabController,
        children: [
          // History Tab
          Column(
            children: [
              Padding(
                padding: const EdgeInsets.symmetric(horizontal: 20.0, vertical: 12.0),
                child: Row(
                  children: [
                    Expanded(
                      child: DropdownButtonFormField<String>(
                        value: _selectedMonthFilter,
                        decoration: InputDecoration(
                          contentPadding: const EdgeInsets.symmetric(horizontal: 12),
                          border: OutlineInputBorder(borderRadius: BorderRadius.circular(8)),
                        ),
                        items: _monthFilters.map((val) => DropdownMenuItem(value: val, child: Text(val, style: const TextStyle(fontSize: 14)))).toList(),
                        onChanged: (val) {
                          if (val != null) setState(() => _selectedMonthFilter = val);
                        },
                      ),
                    ),
                    const SizedBox(width: 12),
                    Expanded(
                      child: DropdownButtonFormField<String>(
                        value: _selectedCategoryFilter,
                        decoration: InputDecoration(
                          contentPadding: const EdgeInsets.symmetric(horizontal: 12),
                          border: OutlineInputBorder(borderRadius: BorderRadius.circular(8)),
                        ),
                        items: _categoryFilters.map((val) => DropdownMenuItem(value: val, child: Text(val, style: const TextStyle(fontSize: 14)))).toList(),
                        onChanged: (val) {
                          if (val != null) setState(() => _selectedCategoryFilter = val);
                        },
                      ),
                    ),
                  ],
                ),
              ),
              Expanded(
                child: expenseProvider.isLoading
                    ? const Center(child: CircularProgressIndicator(color: Color(0xFF6B4EFF)))
                    : filteredExpenses.isEmpty
                        ? const Center(
                            child: Text(
                              'No expenses found for this filter.',
                              style: TextStyle(color: Color(0xFF787587), fontSize: 16),
                              textAlign: TextAlign.center,
                            ),
                          )
                        : ListView.builder(
                            itemCount: filteredExpenses.length,
                            padding: const EdgeInsets.symmetric(horizontal: 20),
                            itemBuilder: (context, index) {
                              final item = filteredExpenses[index];
                              return Container(
                                margin: const EdgeInsets.only(bottom: 12),
                                padding: const EdgeInsets.symmetric(vertical: 12, horizontal: 16),
                                decoration: BoxDecoration(
                                  color: Colors.white,
                                  borderRadius: BorderRadius.circular(16),
                                  border: Border.all(color: const Color(0xFFEBE8E1)),
                                ),
                                child: Row(
                                  children: [
                                    Container(
                                      padding: const EdgeInsets.all(8),
                                      decoration: BoxDecoration(
                                        color: _getCategoryColor(item.category).withOpacity(0.15),
                                        shape: BoxShape.circle,
                                      ),
                                      child: Icon(
                                        _getCategoryIcon(item.category),
                                        color: _getCategoryColor(item.category),
                                        size: 20,
                                      ),
                                    ),
                                    const SizedBox(width: 16),
                                    Expanded(
                                      child: Column(
                                        crossAxisAlignment: CrossAxisAlignment.start,
                                        children: [
                                          Text(
                                            item.title,
                                            style: const TextStyle(fontWeight: FontWeight.bold, color: Color(0xFF1C1A24), fontSize: 14),
                                          ),
                                          const SizedBox(height: 2),
                                          Text(
                                            '${item.category} | ${DateFormat('MMM d, y').format(item.date)}',
                                            style: const TextStyle(color: Color(0xFF787587), fontSize: 12),
                                          ),
                                        ],
                                      ),
                                    ),
                                    Text(
                                      '-₦${item.amount.toStringAsFixed(2)}',
                                      style: const TextStyle(
                                        color: Color(0xFFBA1A1A),
                                        fontWeight: FontWeight.bold,
                                        fontSize: 16,
                                      ),
                                    ),
                                    const SizedBox(width: 8),
                                    IconButton(
                                      icon: const Icon(Icons.delete_outline, size: 18, color: Color(0xFF787587)),
                                      onPressed: () {
                                        expenseProvider.deleteExpense(item.id);
                                      },
                                    ),
                                  ],
                                ),
                              );
                            },
                          ),
              ),
            ],
          ),
          
          // Charts Tab
          Column(
            children: [
              Container(
                padding: const EdgeInsets.all(20.0),
                margin: const EdgeInsets.all(20.0),
                decoration: BoxDecoration(
                  color: Colors.white,
                  borderRadius: BorderRadius.circular(16),
                  border: Border.all(color: const Color(0xFFEBE8E1)),
                ),
                child: Row(
                  children: [
                    Expanded(
                      child: Column(
                        crossAxisAlignment: CrossAxisAlignment.start,
                        children: [
                          const Text(
                            'Total Expenditure',
                            style: TextStyle(color: Color(0xFF787587), fontSize: 13, fontWeight: FontWeight.bold),
                          ),
                          const SizedBox(height: 4),
                          Text(
                            '₦${expenseProvider.totalExpenses.toStringAsFixed(2)}',
                            style: const TextStyle(fontSize: 32, fontWeight: FontWeight.bold, color: Color(0xFF1C1A24)),
                          ),
                        ],
                      ),
                    ),
                    Container(
                      padding: const EdgeInsets.all(12),
                      decoration: BoxDecoration(
                        color: const Color(0xFF00BFA5).withOpacity(0.15),
                        shape: BoxShape.circle,
                      ),
                      child: const Icon(Icons.account_balance_wallet_rounded, size: 28, color: Color(0xFF00BFA5)),
                    ),
                  ],
                ),
              ),
              if (expenseProvider.expenses.isNotEmpty)
                Expanded(
                  child: Padding(
                    padding: const EdgeInsets.symmetric(horizontal: 20.0),
                    child: Column(
                      children: [
                        SizedBox(
                          height: 200,
                          child: PieChart(
                            PieChartData(
                              sectionsSpace: 4,
                              centerSpaceRadius: 50,
                              sections: _buildPieSections(categoryTotals),
                            ),
                          ),
                        ),
                        const SizedBox(height: 24),
                        Expanded(
                          child: SingleChildScrollView(
                            child: Column(
                              crossAxisAlignment: CrossAxisAlignment.start,
                              children: categoryTotals.keys.map((cat) {
                                return Padding(
                                  padding: const EdgeInsets.symmetric(vertical: 8.0),
                                  child: Row(
                                    children: [
                                      Container(
                                        width: 16,
                                        height: 16,
                                        decoration: BoxDecoration(
                                          color: _getCategoryColor(cat),
                                          shape: BoxShape.circle,
                                        ),
                                      ),
                                      const SizedBox(width: 12),
                                      Expanded(
                                        child: Text(
                                          cat,
                                          style: const TextStyle(fontSize: 16, color: Color(0xFF1C1A24), fontWeight: FontWeight.bold),
                                        ),
                                      ),
                                      Text(
                                        '₦${categoryTotals[cat]!.toStringAsFixed(0)}',
                                        style: const TextStyle(fontSize: 16, color: Color(0xFF1C1A24)),
                                      ),
                                    ],
                                  ),
                                );
                              }).toList(),
                            ),
                          ),
                        ),
                      ],
                    ),
                  ),
                ),
            ],
          ),
          // Goals Tab
          _buildGoalsTabContent(context, expenseProvider),
        ],
      ),
    );
  }

  List<PieChartSectionData> _buildPieSections(Map<String, double> totals) {
    return totals.keys.map((cat) {
      final value = totals[cat]!;
      return PieChartSectionData(
        color: _getCategoryColor(cat),
        value: value,
        title: '',
        radius: 20,
      );
    }).toList();
  }

  Color _getCategoryColor(String cat) {
    switch (cat) {
      case 'Food':
        return const Color(0xFFEF4444);
      case 'Transport':
        return const Color(0xFF3B82F6);
      case 'Books':
        return const Color(0xFFF59E0B);
      case 'Entertainment':
        return const Color(0xFF8B5CF6);
      case 'Bills':
        return const Color(0xFF10B981);
      default:
        return const Color(0xFF6B7280);
    }
  }

  IconData _getCategoryIcon(String cat) {
    switch (cat) {
      case 'Food':
        return Icons.restaurant;
      case 'Transport':
        return Icons.directions_car;
      case 'Books':
        return Icons.menu_book;
      case 'Entertainment':
        return Icons.movie;
      case 'Bills':
        return Icons.receipt_long;
      default:
        return Icons.credit_card;
    }
  }

  Widget _buildGoalsTabContent(BuildContext context, ExpenseProvider expenseProvider) {
    final goalProvider = Provider.of<GoalProvider>(context);

    // Filter for expense goals
    final List<Map<String, dynamic>> calculatedGoals = goalProvider.goals
        .where((g) => g.type == 'expense')
        .map((g) {
      final double progressVal = goalProvider.calculateProgressValue(
        g,
        sessions: const [],
        habits: const [],
        expenses: expenseProvider.expenses,
        cgpa: 0.0,
        totalCredits: 0.0,
      );
      return {
        'goal': g,
        'value': progressVal,
      };
    }).toList();

    return Column(
      children: [
        Expanded(
          child: calculatedGoals.isEmpty
              ? Center(
                  child: Padding(
                    padding: const EdgeInsets.all(24.0),
                    child: Column(
                      mainAxisAlignment: MainAxisAlignment.center,
                      children: [
                        Icon(Icons.account_balance_wallet_outlined, size: 64, color: const Color(0xFF6B4EFF).withOpacity(0.3)),
                        const SizedBox(height: 16),
                        const Text(
                          'No budget goals set yet.',
                          style: TextStyle(fontSize: 16, fontWeight: FontWeight.bold, color: Color(0xFF1C1A24)),
                        ),
                        const SizedBox(height: 8),
                        const Text(
                          'Set budget limits for categories like Food, Transport, or Entertainment to stay within your limits!',
                          textAlign: TextAlign.center,
                          style: TextStyle(fontSize: 13, color: Color(0xFF787587)),
                        ),
                      ],
                    ),
                  ),
                )
              : ListView.builder(
                  padding: const EdgeInsets.symmetric(horizontal: 20.0, vertical: 16.0),
                  itemCount: calculatedGoals.length,
                  itemBuilder: (context, index) {
                    final item = calculatedGoals[index];
                    final goal = item['goal'] as Goal;
                    final double val = item['value'] as double;

                    double percent = 0.0;
                    if (goal.targetValue > 0) {
                      percent = val / goal.targetValue;
                      if (percent > 1.0) percent = 1.0;
                      if (percent < 0.0) percent = 0.0;
                    }

                    // Theme Colors based on progress
                    Color statusColor = const Color(0xFF00BFA5); // Green
                    if (percent >= 1.0) {
                      statusColor = const Color(0xFFEF4444); // Red
                    } else if (percent >= 0.85) {
                      statusColor = const Color(0xFFF59E0B); // Orange
                    }

                    final percentageText = '${(percent * 100).toStringAsFixed(0)}%';
                    final String categoryText = goal.attachedActivityId == 'all' ? 'Total Budget' : goal.attachedActivityId;

                    return Card(
                      color: Colors.white,
                      margin: const EdgeInsets.only(bottom: 16.0),
                      shape: RoundedRectangleBorder(
                        borderRadius: BorderRadius.circular(16),
                        side: const BorderSide(color: Color(0xFFEBE8E1)),
                      ),
                      child: Padding(
                        padding: const EdgeInsets.all(16.0),
                        child: Column(
                          crossAxisAlignment: CrossAxisAlignment.start,
                          children: [
                            Row(
                              mainAxisAlignment: MainAxisAlignment.spaceBetween,
                              children: [
                                Row(
                                  children: [
                                    CircleAvatar(
                                      radius: 18,
                                      backgroundColor: statusColor.withOpacity(0.12),
                                      child: Icon(Icons.account_balance_wallet_outlined, color: statusColor, size: 20),
                                    ),
                                    const SizedBox(width: 12),
                                    Column(
                                      crossAxisAlignment: CrossAxisAlignment.start,
                                      children: [
                                        Text(
                                          goal.title,
                                          style: const TextStyle(
                                            fontSize: 15,
                                            fontWeight: FontWeight.bold,
                                            color: Color(0xFF1C1A24),
                                          ),
                                        ),
                                        Text(
                                          '${goal.timeframe} • Category: $categoryText',
                                          style: const TextStyle(
                                            fontSize: 11,
                                            color: Color(0xFF787587),
                                          ),
                                        ),
                                      ],
                                    ),
                                  ],
                                ),
                                IconButton(
                                  icon: const Icon(Icons.delete_outline_rounded, color: Color(0xFFBA1A1A)),
                                  onPressed: () => goalProvider.deleteGoal(goal.id),
                                ),
                              ],
                            ),
                            const SizedBox(height: 16),
                            Row(
                              mainAxisAlignment: MainAxisAlignment.spaceBetween,
                              children: [
                                Text(
                                  'Spent: ₦${val.toStringAsFixed(0)} / ₦${goal.targetValue.toStringAsFixed(0)}',
                                  style: const TextStyle(fontSize: 12, fontWeight: FontWeight.w600, color: Color(0xFF1C1A24)),
                                ),
                                Text(
                                  percentageText,
                                  style: TextStyle(fontSize: 13, fontWeight: FontWeight.bold, color: statusColor),
                                ),
                              ],
                            ),
                            const SizedBox(height: 8),
                            ClipRRect(
                              borderRadius: BorderRadius.circular(4),
                              child: LinearProgressIndicator(
                                value: percent,
                                color: statusColor,
                                backgroundColor: const Color(0xFFEBE8E1),
                                minHeight: 8,
                              ),
                            ),
                            const SizedBox(height: 12),
                            if (goal.deadline != null) ...[
                              Row(
                                children: [
                                  const Icon(Icons.event_outlined, size: 14, color: Color(0xFF787587)),
                                  const SizedBox(width: 4),
                                  Text(
                                    'Target date: ${DateFormat('MMM dd, yyyy').format(goal.deadline!)}',
                                    style: const TextStyle(fontSize: 11, color: Color(0xFF787587)),
                                  ),
                                ],
                              ),
                              const SizedBox(height: 10),
                            ],
                            // Smart suggestion block
                            Container(
                              width: double.infinity,
                              padding: const EdgeInsets.all(12),
                              decoration: BoxDecoration(
                                color: const Color(0xFFF9F8F6),
                                borderRadius: BorderRadius.circular(12),
                              ),
                              child: Row(
                                crossAxisAlignment: CrossAxisAlignment.start,
                                children: [
                                  Icon(Icons.lightbulb_outline_rounded, size: 16, color: statusColor),
                                  const SizedBox(width: 8),
                                  Expanded(
                                    child: Text(
                                      _generateGoalTipText(goal, val),
                                      style: const TextStyle(
                                        fontSize: 12,
                                        color: Color(0xFF1C1A24),
                                        height: 1.35,
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
                  },
                ),
        ),
        Padding(
          padding: const EdgeInsets.all(20.0),
          child: ElevatedButton.icon(
            onPressed: () => _showAddGoalBottomSheet(context),
            icon: const Icon(Icons.add, color: Colors.white),
            label: const Text('Add Budget Goal', style: TextStyle(color: Colors.white, fontWeight: FontWeight.bold)),
            style: ElevatedButton.styleFrom(
              backgroundColor: const Color(0xFF6B4EFF),
              minimumSize: const Size(double.infinity, 50),
              shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(12)),
            ),
          ),
        ),
      ],
    );
  }

  String _generateGoalTipText(Goal goal, double progressVal) {
    if (goal.isAchieved) {
      return "Goal achieved / finished limit. Make sure to reset budget for the next period.";
    }
    final double left = goal.targetValue - progressVal;
    if (left < 0) {
      return "Warning: You have exceeded this budget limit by ₦${(-left).toStringAsFixed(0)}! Try to restrict spending in this category.";
    } else {
      final percentUsed = (progressVal / goal.targetValue * 100).round();
      return "You have ₦${left.toStringAsFixed(0)} left ($percentUsed% used). Keep non-essential spending low to stay within budget.";
    }
  }

  void _showAddGoalBottomSheet(BuildContext context) {
    final titleController = TextEditingController();
    final limitController = TextEditingController();
    String selectedCategory = 'all';
    String selectedTimeframe = 'Weekly';
    DateTime? selectedDeadline;

    showModalBottomSheet(
      context: context,
      backgroundColor: Colors.white,
      shape: const RoundedRectangleBorder(borderRadius: BorderRadius.vertical(top: Radius.circular(20))),
      isScrollControlled: true,
      builder: (context) {
        return StatefulBuilder(
          builder: (context, setSheetState) {
            return Padding(
              padding: EdgeInsets.only(
                bottom: MediaQuery.of(context).viewInsets.bottom,
                left: 20,
                right: 20,
                top: 24,
              ),
              child: SingleChildScrollView(
                child: Column(
                  mainAxisSize: MainAxisSize.min,
                  crossAxisAlignment: CrossAxisAlignment.stretch,
                  children: [
                    Row(
                      mainAxisAlignment: MainAxisAlignment.spaceBetween,
                      children: [
                        const Text(
                          'Create Budget Goal',
                          style: TextStyle(fontSize: 18, fontWeight: FontWeight.bold, color: Color(0xFF1C1A24)),
                        ),
                        IconButton(
                          icon: const Icon(Icons.close, color: Color(0xFF787587)),
                          onPressed: () => Navigator.pop(context),
                        )
                      ],
                    ),
                    const SizedBox(height: 12),
                    TextField(
                      controller: titleController,
                      style: const TextStyle(color: Color(0xFF1C1A24)),
                      decoration: InputDecoration(
                        labelText: 'Goal Title',
                        labelStyle: const TextStyle(color: Color(0xFF787587)),
                        enabledBorder: OutlineInputBorder(
                          borderRadius: BorderRadius.circular(12),
                          borderSide: const BorderSide(color: Color(0xFFEBE8E1)),
                        ),
                        focusedBorder: OutlineInputBorder(
                          borderRadius: BorderRadius.circular(12),
                          borderSide: const BorderSide(color: Color(0xFF6B4EFF), width: 2),
                        ),
                      ),
                    ),
                    const SizedBox(height: 16),
                    DropdownButtonFormField<String>(
                      value: selectedCategory,
                      dropdownColor: Colors.white,
                      style: const TextStyle(color: Color(0xFF1C1A24)),
                      decoration: InputDecoration(
                        labelText: 'Attach to Category',
                        labelStyle: const TextStyle(color: Color(0xFF787587)),
                        enabledBorder: OutlineInputBorder(
                          borderRadius: BorderRadius.circular(12),
                          borderSide: const BorderSide(color: Color(0xFFEBE8E1)),
                        ),
                        focusedBorder: OutlineInputBorder(
                          borderRadius: BorderRadius.circular(12),
                          borderSide: const BorderSide(color: Color(0xFF6B4EFF), width: 2),
                        ),
                      ),
                      items: const [
                        DropdownMenuItem(value: 'all', child: Text('Total Budget')),
                        DropdownMenuItem(value: 'Food', child: Text('Food')),
                        DropdownMenuItem(value: 'Transport', child: Text('Transport')),
                        DropdownMenuItem(value: 'Books', child: Text('Books')),
                        DropdownMenuItem(value: 'Entertainment', child: Text('Entertainment')),
                        DropdownMenuItem(value: 'Bills', child: Text('Bills')),
                        DropdownMenuItem(value: 'Other', child: Text('Other')),
                      ],
                      onChanged: (val) {
                        if (val != null) {
                          setSheetState(() {
                            selectedCategory = val;
                          });
                        }
                      },
                    ),
                    const SizedBox(height: 16),
                    TextField(
                      controller: limitController,
                      style: const TextStyle(color: Color(0xFF1C1A24)),
                      decoration: InputDecoration(
                        labelText: 'Budget Limit (₦)',
                        helperText: 'Enter maximum spending limit',
                        labelStyle: const TextStyle(color: Color(0xFF787587)),
                        enabledBorder: OutlineInputBorder(
                          borderRadius: BorderRadius.circular(12),
                          borderSide: const BorderSide(color: Color(0xFFEBE8E1)),
                        ),
                        focusedBorder: OutlineInputBorder(
                          borderRadius: BorderRadius.circular(12),
                          borderSide: const BorderSide(color: Color(0xFF6B4EFF), width: 2),
                        ),
                      ),
                      keyboardType: const TextInputType.numberWithOptions(decimal: true),
                    ),
                    const SizedBox(height: 16),
                    DropdownButtonFormField<String>(
                      value: selectedTimeframe,
                      dropdownColor: Colors.white,
                      style: const TextStyle(color: Color(0xFF1C1A24)),
                      decoration: InputDecoration(
                        labelText: 'Goal Timeframe',
                        labelStyle: const TextStyle(color: Color(0xFF787587)),
                        enabledBorder: OutlineInputBorder(
                          borderRadius: BorderRadius.circular(12),
                          borderSide: const BorderSide(color: Color(0xFFEBE8E1)),
                        ),
                        focusedBorder: OutlineInputBorder(
                          borderRadius: BorderRadius.circular(12),
                          borderSide: const BorderSide(color: Color(0xFF6B4EFF), width: 2),
                        ),
                      ),
                      items: const [
                        DropdownMenuItem(value: 'Daily', child: Text('Daily')),
                        DropdownMenuItem(value: 'Weekly', child: Text('Weekly')),
                        DropdownMenuItem(value: 'Monthly', child: Text('Monthly')),
                        DropdownMenuItem(value: 'Semester', child: Text('Semester')),
                        DropdownMenuItem(value: 'All Time', child: Text('All Time')),
                      ],
                      onChanged: (val) {
                        if (val != null) {
                          setSheetState(() {
                            selectedTimeframe = val;
                          });
                        }
                      },
                    ),
                    const SizedBox(height: 16),
                    InkWell(
                      onTap: () async {
                        final picked = await showDatePicker(
                          context: context,
                          initialDate: DateTime.now().add(const Duration(days: 7)),
                          firstDate: DateTime.now(),
                          lastDate: DateTime.now().add(const Duration(days: 365)),
                          builder: (context, child) {
                            return Theme(
                              data: Theme.of(context).copyWith(
                                colorScheme: const ColorScheme.light(
                                  primary: Color(0xFF6B4EFF),
                                  onPrimary: Colors.white,
                                  onSurface: Color(0xFF1C1A24),
                                ),
                              ),
                              child: child!,
                            );
                          },
                        );
                        if (picked != null) {
                          setSheetState(() {
                            selectedDeadline = picked;
                          });
                        }
                      },
                      child: Container(
                        padding: const EdgeInsets.symmetric(vertical: 16, horizontal: 12),
                        decoration: BoxDecoration(
                          borderRadius: BorderRadius.circular(12),
                          border: Border.all(color: const Color(0xFFEBE8E1)),
                        ),
                        child: Row(
                          mainAxisAlignment: MainAxisAlignment.spaceBetween,
                          children: [
                            Text(
                              selectedDeadline == null
                                  ? 'Set Goal Deadline (Optional)'
                                  : 'Deadline: ${DateFormat('yyyy-MM-dd').format(selectedDeadline!)}',
                              style: TextStyle(
                                color: selectedDeadline == null ? const Color(0xFF787587) : const Color(0xFF1C1A24),
                                fontSize: 15,
                              ),
                            ),
                            const Icon(Icons.calendar_month_outlined, color: Color(0xFF6B4EFF)),
                          ],
                        ),
                      ),
                    ),
                    const SizedBox(height: 24),
                    ElevatedButton(
                      onPressed: () async {
                        final title = titleController.text.trim();
                        final limit = double.tryParse(limitController.text) ?? 0.0;

                        if (title.isEmpty) {
                          ScaffoldMessenger.of(context).showSnackBar(
                            const SnackBar(content: Text('Please enter a goal title.')),
                          );
                          return;
                        }
                        if (limit <= 0.0) {
                          ScaffoldMessenger.of(context).showSnackBar(
                            const SnackBar(content: Text('Please enter a valid limit value.')),
                          );
                          return;
                        }

                        try {
                          await Provider.of<GoalProvider>(context, listen: false).addGoal(
                            title: title,
                            type: 'expense',
                            targetValue: limit,
                            attachedActivityId: selectedCategory,
                            timeframe: selectedTimeframe,
                            deadline: selectedDeadline,
                          );
                          if (context.mounted) Navigator.pop(context);
                        } catch (e) {
                          if (context.mounted) {
                            ScaffoldMessenger.of(context).showSnackBar(
                              SnackBar(content: Text('Failed to add goal: $e')),
                            );
                          }
                        }
                      },
                      style: ElevatedButton.styleFrom(
                        backgroundColor: const Color(0xFF6B4EFF),
                        padding: const EdgeInsets.symmetric(vertical: 16),
                        shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(12)),
                      ),
                      child: const Text(
                        'Create Goal',
                        style: TextStyle(color: Colors.white, fontSize: 16, fontWeight: FontWeight.bold),
                      ),
                    ),
                    const SizedBox(height: 24),
                  ],
                ),
              ),
            );
          },
        );
      },
    );
  }
}

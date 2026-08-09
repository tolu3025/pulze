import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'package:fl_chart/fl_chart.dart';
import 'package:intl/intl.dart';
import '../providers/expense_provider.dart';

class ExpensesScreen extends StatelessWidget {
  const ExpensesScreen({super.key});

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
                  ElevatedButton(
                    onPressed: () {
                      final title = titleController.text.trim();
                      final amt = double.tryParse(amountController.text) ?? 0.0;
                      if (title.isNotEmpty && amt > 0) {
                        Provider.of<ExpenseProvider>(context, listen: false)
                            .addExpense(title, selectedCategory, amt, DateTime.now());
                        Navigator.pop(context);
                      }
                    },
                    style: ElevatedButton.styleFrom(
                      backgroundColor: const Color(0xFF6B4EFF),
                      padding: const EdgeInsets.symmetric(vertical: 16),
                      shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(12)),
                    ),
                    child: const Text('Add Expense', style: TextStyle(color: Colors.white, fontSize: 16, fontWeight: FontWeight.bold)),
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

  @override
  Widget build(BuildContext context) {
    final expense = Provider.of<ExpenseProvider>(context);
    final categoryTotals = expense.getCategoryTotals();

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
      ),
      body: Column(
        children: [
          // Total Spent Banner
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
                        '₦${expense.totalExpenses.toStringAsFixed(2)}',
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

          // Visual breakdown via fl_chart
          if (expense.expenses.isNotEmpty)
            SizedBox(
              height: 140,
              child: Row(
                children: [
                  const SizedBox(width: 24),
                  Expanded(
                    flex: 2,
                    child: PieChart(
                      PieChartData(
                        sectionsSpace: 4,
                        centerSpaceRadius: 35,
                        sections: _buildPieSections(categoryTotals),
                      ),
                    ),
                  ),
                  const SizedBox(width: 24),
                  Expanded(
                    flex: 3,
                    child: SingleChildScrollView(
                      child: Column(
                        crossAxisAlignment: CrossAxisAlignment.start,
                        mainAxisAlignment: MainAxisAlignment.center,
                        children: categoryTotals.keys.map((cat) {
                          return Padding(
                            padding: const EdgeInsets.symmetric(vertical: 4.0),
                            child: Row(
                              children: [
                                Container(
                                  width: 10,
                                  height: 10,
                                  decoration: BoxDecoration(
                                    color: _getCategoryColor(cat),
                                    shape: BoxShape.circle,
                                  ),
                                ),
                                const SizedBox(width: 8),
                                Expanded(
                                  child: Text(
                                    '$cat: ₦${categoryTotals[cat]!.toStringAsFixed(0)}',
                                    style: const TextStyle(fontSize: 12, color: Color(0xFF1C1A24)),
                                  ),
                                ),
                              ],
                            ),
                          );
                        }).toList(),
                      ),
                    ),
                  ),
                  const SizedBox(width: 24),
                ],
              ),
            ),
          const SizedBox(height: 20),

          // Transaction list
          Expanded(
            child: expense.isLoading
                ? const Center(child: CircularProgressIndicator(color: Color(0xFF6B4EFF)))
                : expense.expenses.isEmpty
                    ? const Center(
                        child: Text(
                          'No expenses tracked yet.\nTap "+" in the top right to start.',
                          style: TextStyle(color: Color(0xFF787587), fontSize: 16),
                          textAlign: TextAlign.center,
                        ),
                      )
                    : ListView.builder(
                        itemCount: expense.expenses.length,
                        padding: const EdgeInsets.symmetric(horizontal: 20),
                        itemBuilder: (context, index) {
                          final item = expense.expenses[index];
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
                                    expense.deleteExpense(item.id);
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
    );
  }

  List<PieChartSectionData> _buildPieSections(Map<String, double> totals) {
    return totals.keys.map((cat) {
      final value = totals[cat]!;
      return PieChartSectionData(
        color: _getCategoryColor(cat),
        value: value,
        title: '',
        radius: 18,
      );
    }).toList();
  }

  Color _getCategoryColor(String cat) {
    switch (cat) {
      case 'Food':
        return const Color(0xFFEF4444); // Red
      case 'Transport':
        return const Color(0xFF3B82F6); // Blue
      case 'Books':
        return const Color(0xFFF59E0B); // Amber
      case 'Entertainment':
        return const Color(0xFF8B5CF6); // Purple
      case 'Bills':
        return const Color(0xFF10B981); // Emerald
      default:
        return const Color(0xFF6B7280); // Gray
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
}

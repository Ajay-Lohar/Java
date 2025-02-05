package com.itshaala.controller;

import com.itshaala.model.Expense;
import com.itshaala.service.ExpenseService;

import java.util.List;

public class ExpenseController {

    ExpenseService expenseService = new ExpenseService();

    public void addExpense(Expense expense) {
        expenseService.addExpense(expense);
    }

    public void updateExpense(Expense expense) {
        expenseService.updateExpense(expense);
    }

    public void deleteExpense(int id) {
        expenseService.deleteExpense(id);
    }

    public Expense getExpenseById(int id) {
        return expenseService.getExpenseById(id);
    }

    public List<Expense> getAllExpenses() {
        return expenseService.getAllExpenses();
    }

    public List<Expense> searchExpenses(String title) {
        return expenseService.searchExpenses(title);
    }

}

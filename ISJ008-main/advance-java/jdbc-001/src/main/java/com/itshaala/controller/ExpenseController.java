package com.itshaala.controller;

import com.itshaala.model.Expense;
import com.itshaala.service.ExpenseService;

public class ExpenseController {
    ExpenseService expenseService = new ExpenseService();
    public void addExpense(Expense expense) {
        expenseService.addExpense(expense);
    }
}

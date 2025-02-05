package com.itshaala.service;

import com.itshaala.dao.ExpenseDao;
import com.itshaala.model.Expense;

import java.util.List;

public class ExpenseService {

    ExpenseDao expenseDao = new ExpenseDao();

    public void addExpense(Expense expense) {
        expenseDao.addExpense(expense);
    }

    public void updateExpense(Expense expense) {
        expenseDao.updateExpense(expense);
    }

    public void deleteExpense(int id) {
        expenseDao.deleteExpense(id);
    }

    public Expense getExpenseById(int id) {
        return expenseDao.getExpenseById(id);
    }

    public List<Expense> getAllExpenses() {
        return expenseDao.getAllExpenses();
    }

    public List<Expense> searchExpenses(String title) {
        return expenseDao.searchExpenses(title);
    }

}

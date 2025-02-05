package com.itshaala.service;

import com.itshaala.dao.ExpenseDao;
import com.itshaala.model.Expense;

public class ExpenseService {
    ExpenseDao expenseDao = new ExpenseDao();
    public void addExpense(Expense expense) {
        expenseDao.addExpense(expense);
    }
}

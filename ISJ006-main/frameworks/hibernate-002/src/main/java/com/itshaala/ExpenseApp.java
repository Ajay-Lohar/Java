package com.itshaala;

import com.itshaala.dao.ExpenseDao;
import com.itshaala.model.Expense;

import java.time.LocalDateTime;

/**
 * Hello world!
 */
public class ExpenseApp {
    public static void main(String[] args) {
        ExpenseDao expenseDao = new ExpenseDao();
        Expense expense = new Expense();

        expense.setId(1);
        expense.setTitle("Lunch @ Macd");
        expense.setAmount(200);
        expense.setLocalDateTime(LocalDateTime.now());

       // expenseDao.addExpense(expense);
       // expenseDao.updateExpense(expense);
       // expenseDao.deleteExpense(expense);
        System.out.println(expenseDao.getExpenseById(2));
    }
}

package com.itshaala;

import com.itshaala.controller.ExpenseController;
import com.itshaala.model.Expense;

import java.sql.Date;

public class ExpenseApp {
    public static void main(String[] args) {
        ExpenseController expenseController = new ExpenseController();

        Expense expense = Expense.builder()
                .id(103)
                .title("trip")
                .amount(550)
                .notes("Shaniwar wada")
                .build();

        expenseController.addExpense(expense);
    }
}

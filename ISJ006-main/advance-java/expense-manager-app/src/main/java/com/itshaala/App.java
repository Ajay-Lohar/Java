package com.itshaala;

import com.itshaala.controller.ExpenseController;
import com.itshaala.controller.IncomeController;
import com.itshaala.model.Expense;
import com.itshaala.model.Income;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ExpenseController expenseController = new ExpenseController();
        Expense expense = Expense.builder()
                .title("Laptop")
                .amount(10000.20)
                .note("i3 processor")
                .date(Date.valueOf(LocalDate.now()))
                .time(Time.valueOf(LocalTime.now()))
                .paymentMode("Cash")
                .build();
        //expenseController.addExpense(expense);

        Income income = Income.builder()
                .title("Salary")
                .amount(50000)
                .note("Feb 2024 Salary")
                .paymentMode("Online")
                .date(Date.valueOf(LocalDate.now()))
                .time(Time.valueOf(LocalTime.now()))
                .build();

        IncomeController incomeController = new IncomeController();
        incomeController.addIncome(income);
    }
}

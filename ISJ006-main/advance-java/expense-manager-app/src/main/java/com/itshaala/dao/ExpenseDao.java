package com.itshaala.dao;

import com.itshaala.model.Expense;
import com.itshaala.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ExpenseDao {
    public void addExpense(Expense expense) {
        String query = "insert into isj006_advance.expense(title, amount, note, date, time, payment_mode) values(?,?,?,?,?,?)";
        Connection connection = ConnectionUtil.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, expense.getTitle());
            preparedStatement.setDouble(2, expense.getAmount());
            preparedStatement.setString(3, expense.getNote());
            preparedStatement.setDate(4, expense.getDate());
            preparedStatement.setTime(5, expense.getTime());
            preparedStatement.setString(6, expense.getPaymentMode());

            preparedStatement.executeUpdate();
            System.out.println("Expense added successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void updateExpense(Expense expense) {
    }

    public void deleteExpense(int id) {
    }

    public Expense getExpenseById(int id) {
        return null;
    }

    public List<Expense> getAllExpenses() {
        return null;
    }

    public List<Expense> searchExpenses(String title) {
        return null;
    }
}

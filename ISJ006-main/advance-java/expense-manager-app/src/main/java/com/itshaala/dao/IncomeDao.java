package com.itshaala.dao;

import com.itshaala.model.Expense;
import com.itshaala.model.Income;
import com.itshaala.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class IncomeDao {
    public void addIncome(Income income) {
        String query = "insert into isj006_advance.income(title, amount, note, date, time, payment_mode) values(?,?,?,?,?,?)";
        Connection connection = ConnectionUtil.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, income.getTitle());
            preparedStatement.setDouble(2, income.getAmount());
            preparedStatement.setString(3, income.getNote());
            preparedStatement.setDate(4, income.getDate());
            preparedStatement.setTime(5, income.getTime());
            preparedStatement.setString(6, income.getPaymentMode());
            preparedStatement.executeUpdate();
            System.out.println("Income added successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateIncome(Income income) {
    }

    public void deleteIncome(int id) {
    }

    public Income getIncomeById(int id) {
        return null;
    }

    public List<Income> getAllIncomes() {
        return null;
    }

    public List<Income> searchIncomes(String title) {
        return null;
    }
}

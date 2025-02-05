package com.itshaala.spring14springboot.dao;

import com.itshaala.spring14springboot.model.Expense;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@AllArgsConstructor
public class ExpenseDao {
    static List<Expense> expenses = new ArrayList<>();

    //crud
    public List<Expense> findAllExpenses() {
        return expenses;
    }

    public Expense findExpenseById(int id) {
        return expenses.stream().filter(expense -> expense.getId() == id)
                .findFirst().orElse(null);
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public void updateExpense(Expense expense) {
        Expense expensedToBeUpdated = expenses.stream().filter(ex -> ex.getId() == expense.getId()).findFirst().orElse(null);
        deleteExpense(expense.getId());
        expenses.add(expense);
    }

    public void deleteExpense(int id) {
        expenses.removeIf(expense -> expense.getId() == id);
    }
}
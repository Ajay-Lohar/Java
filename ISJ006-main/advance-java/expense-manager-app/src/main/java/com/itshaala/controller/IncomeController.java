package com.itshaala.controller;

import com.itshaala.model.Income;
import com.itshaala.service.IncomeService;

import java.util.List;

public class IncomeController {
    IncomeService incomeService = new IncomeService();

    public void addIncome(Income income) {
        incomeService.addIncome(income);
    }

    public void updateIncome(Income income) {
        incomeService.updateIncome(income);
    }

    public void deleteIncome(int id) {
        incomeService.deleteIncome(id);
    }

    public Income getIncomeById(int id) {
        return incomeService.getIncomeById(id);
    }

    public List<Income> getAllIncomes() {
        return incomeService.getAllIncomes();
    }

    public List<Income> searchIncomes(String title) {
        return incomeService.searchIncomes(title);
    }
}

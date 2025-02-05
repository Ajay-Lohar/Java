package com.itshaala.service;

import com.itshaala.dao.IncomeDao;
import com.itshaala.model.Income;

import java.util.List;

public class IncomeService {
    IncomeDao incomeDao = new IncomeDao();

    public void addIncome(Income income) {
        incomeDao.addIncome(income);
    }

    public void updateIncome(Income income) {
        incomeDao.updateIncome(income);
    }

    public void deleteIncome(int id) {
        incomeDao.deleteIncome(id);
    }

    public Income getIncomeById(int id) {
        return incomeDao.getIncomeById(id);
    }

    public List<Income> getAllIncomes() {
        return incomeDao.getAllIncomes();
    }

    public List<Income> searchIncomes(String title) {
        return incomeDao.searchIncomes(title);
    }
}

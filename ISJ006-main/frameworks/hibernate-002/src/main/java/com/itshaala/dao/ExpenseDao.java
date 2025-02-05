package com.itshaala.dao;

import com.itshaala.model.Expense;
import com.itshaala.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ExpenseDao {
    public void addExpense(Expense expense) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(expense);
        transaction.commit();
        System.out.println("Expenses added");
    }

    public void updateExpense(Expense expense) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(expense);
        transaction.commit();
        System.out.println("Expenses updated");
    }

    public void deleteExpense(Expense expense) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(expense);
        transaction.commit();
        System.out.println("Expenses deleted");
    }

    public Expense getExpenseById(int expenseId) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        return session.get(Expense.class, expenseId);
    }
}

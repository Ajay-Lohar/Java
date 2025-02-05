package com.itshaala;

import com.itshaala.model.FullTimeEmployee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class SaveFullTimeEmployeeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter fullTimeEmployee name");
        String name = scanner.next();

        System.out.println("Enter fullTimeEmployee salary");
        double salary = scanner.nextDouble();

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
        fullTimeEmployee.setName(name);
        fullTimeEmployee.setSalary(salary);

        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(fullTimeEmployee);
        transaction.commit();
        session.close();
        System.out.println("Full time Employee object saved");
    }
}

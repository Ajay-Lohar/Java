package com.ajay;

import com.ajay.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Employee employee = Employee.builder()

                .name("Ajay")
                .salary(23000)
                .tasks(List.of("KGF-2", "KANTARA", "Salar"))

                .build();
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(employee);
        transaction.commit();
        session.close();
        sessionFactory.close();

        System.out.println("Employee Object Saved");

    }



}
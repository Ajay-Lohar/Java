package com.itshaala;

import com.itshaala.model.FullTimeEmployee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class GetFullTimeEmployeeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter fullTimeEmployee id");
        int id = scanner.nextInt();

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
        fullTimeEmployee.setId(id);

        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        FullTimeEmployee employee = session.get(FullTimeEmployee.class, id);
        System.out.println(employee);
        System.out.println("Full time Employee object fetched");
        session.close();
    }
}

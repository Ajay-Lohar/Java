package com.itshaala;

import com.itshaala.model.Address;
import com.itshaala.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class SaveEmployeeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee name");
        String name = scanner.next();

        System.out.println("Enter employee salary");
        int salary = scanner.nextInt();

        System.out.println("Enter employee  street");
        String street = scanner.next();

        System.out.println("Enter employee city");
        String city = scanner.next();

        System.out.println("Enter employee state");
        String state = scanner.next();

        System.out.println("Enter employee zip");
        int zip = scanner.nextInt();

        Address address = Address.builder()
                .city(city)
                .state(state)
                .street(street)
                .zip(zip)
                .build();

        Employee employee = Employee.builder()
                .name(name)
                .salary(salary)
                .address(address)
                .build();

        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(employee);
        transaction.commit();
        session.close();
        System.out.println("Employee object saved with address");
    }
}

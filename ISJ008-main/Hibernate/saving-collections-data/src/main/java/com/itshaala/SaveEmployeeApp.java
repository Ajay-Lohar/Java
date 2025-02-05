package com.itshaala;

import com.itshaala.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 */
public class SaveEmployeeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the employee name: ");
        String employeeName = scanner.next();

        System.out.println("Enter the employee salary: ");
        double salary = scanner.nextDouble();

        List<String> workingProjects = new ArrayList<>();
        System.out.println("Number of projects working ");
        int numberOfProjects = scanner.nextInt();

        for (int i = 1; i <= numberOfProjects; i++) {
            System.out.println("Enter the project name: ");
            String projectName = scanner.next();
            workingProjects.add(projectName);
        }

        //transient state --> it is inside the heap and not inside the session or sessionfactory cache or database
        Employee employee = Employee.builder()
                .name(employeeName)
                .salary(salary)
                .workingProjects(workingProjects)
                .build();

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();//non-select
        //persistent state : it is in session or sf cache or in db
        session.save(employee);
        tx.commit();
        session.close();// detached state : no more in cache
        System.out.println("employee object saved");
    }
}

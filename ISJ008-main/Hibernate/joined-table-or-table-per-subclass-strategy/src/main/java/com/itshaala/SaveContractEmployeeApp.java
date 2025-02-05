package com.itshaala;

import com.itshaala.model.ContractEmployee;
import com.itshaala.model.FullTimeEmployee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class SaveContractEmployeeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter contract employee name");
        String name = scanner.next();

        System.out.println("Enter contract employee invoice amount");
        double invoiceAmount = scanner.nextDouble();

        ContractEmployee contractEmployee = new ContractEmployee();
        contractEmployee.setName(name);
        contractEmployee.setInvoice_amount(invoiceAmount);

        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(contractEmployee);
        transaction.commit();
        session.close();
        System.out.println("contract Employee object saved");
    }
}

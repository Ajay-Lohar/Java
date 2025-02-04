package com.ajay;

import com.ajay.model.ContractEmployee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        ContractEmployee emp = new ContractEmployee();
        emp.setName("Narendra");
        emp.setAddress("Gujarat");
        emp.setDesignation("Prime Minister of India");
        emp.setInvoiceAmount(500000);


        session.save(emp);

        tx.commit();
        session.close();
        System.out.println("Employee type object saved");
    }
}

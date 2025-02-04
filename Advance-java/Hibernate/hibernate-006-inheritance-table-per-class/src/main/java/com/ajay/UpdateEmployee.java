package com.ajay;

import com.ajay.model.ContractEmployee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateEmployee {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        ContractEmployee emp = new ContractEmployee();
        emp.setId(2);
        emp.setName("Nirmala Narayan Sitharaman");
        emp.setAddress("Kerala");
        emp.setDesignation("Finance Minister Of India");
        emp.setInvoiceAmount(300000);

        session.update(emp);

        tx.commit();
        session.close();
        System.out.println("Employee Type Object updated");
    }
}

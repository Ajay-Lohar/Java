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
        emp.setId(1);
        emp.setName("Sharad Pawar");
        emp.setAddress("Baramati");
        emp.setDesignation("Difty CM OF Maharshatra");
        emp.setInvoiceAmount(50000);

        session.update(emp);

        tx.commit();
        session.close();
        System.out.println("Employee type object saved");
    }
}

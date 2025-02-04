package com.ajay;

import com.ajay.model.ContractEmployee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ContractSave {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        ContractEmployee emp = new ContractEmployee();
        emp.setName("Ajit Pawar");
        emp.setAddress("Baramati");
        emp.setDesignation(" Difty Chief Minister Of Maharashtra");
        emp.setInvoiceAmount(150000);

        session.save(emp);
        tx.commit();
        session.close();
        System.out.println("Contract Employee Object type saved successfully");
    }

}

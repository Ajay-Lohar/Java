package com.ajay;

import com.ajay.model.FullTimeEmployee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FTESave {
    public static void main(String[] args) {

            Configuration cfg = new Configuration();
            cfg.configure("hibernate.cfg.xml");
            SessionFactory sf = cfg.buildSessionFactory();
            Session session = sf.openSession();
            Transaction tx = session.beginTransaction();

            FullTimeEmployee emp = new FullTimeEmployee();
            emp.setName("Eknath Shinde");
            emp.setAddress("Satara");
            emp.setDesignation("Difty CM Of Maharashtra");
            emp.setSalary(100000);

            session.save(emp);

            tx.commit();
            session.close();
            System.out.println("Employee type object saved");
    }
}

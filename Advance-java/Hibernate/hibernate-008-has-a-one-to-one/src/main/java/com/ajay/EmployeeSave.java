package com.ajay;

import com.ajay.model.Address;
import com.ajay.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class EmployeeSave{
    public static void main( String[] args ){
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        Address address = new Address();
        address.setStreet("Bhairavnath GAlli");
        address.setCity("Umbraj");
        address.setState("Maharashtra");
        address.setCountry("India");
        address.setPincode(415109);

        Employee emp = new Employee();
        emp.setName("Atharv Pujari");
        emp.setSalary(23000);
        emp.setDesignation("CEO");
        emp.setAddress(address);
        session.save(emp);

        tx.commit();
        session.close();
        System.out.println("Employee type object saved");


    }
}

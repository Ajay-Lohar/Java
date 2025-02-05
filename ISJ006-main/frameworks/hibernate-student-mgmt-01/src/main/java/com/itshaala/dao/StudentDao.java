package com.itshaala.dao;

import com.itshaala.model.Student;
import com.itshaala.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentDao {
    public static void addStudent(Student student) {
        //step 1 :create the Configuration
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");

        //step 2: build the session factory
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        //step 3 : build the session
        Session session = sessionFactory.openSession();

        //step 4 : for non-select queries create the Transaction
        Transaction transaction = session.beginTransaction();

        //step 5 : using session save the object
        session.save(student);

        //step 6 : commit the transaction
        transaction.commit();

        System.out.println("student object saved successfully");

        //step 7 : session
//        session.close();
    }

    public static void updateStudent(Student student) {
        //step 1 :create the Configuration
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");

        //step 2: build the session factory
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        //step 3 : build the session
        Session session = sessionFactory.openSession();

        //step 4 : for non-select queries create the Transaction
        Transaction transaction = session.beginTransaction();

        //step 5 : using session save the object
        session.update(student);

        //step 6 : commit the transaction
        transaction.commit();

        System.out.println("student object updated successfully");

        //step 7 : session
//        session.close();
    }

    public static Student getStudentById(int studentId) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        //for select queries no need of transaction
        return session.get(Student.class, studentId);
    }

    public static void deleteStudent(Student student){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(student);
        transaction.commit();
        System.out.println("student object deleted");
    }
}

package com.ajay;

import com.ajay.model.Course;
import com.ajay.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentSAve{
    public static void main( String[] args ){
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        Student student = new Student();
        student.setName("Ajinkya Deshmukh ");
        student.setAge(22);
        student.setEmail("ajinkya@gmail.com");
        session.save(student);

        Course course = new Course();
        course.setName("Python");
        session.save(course);
        session.save(student);

        tx.commit();
        session.close();
        System.out.println("Student And Course type object save");
    }
}

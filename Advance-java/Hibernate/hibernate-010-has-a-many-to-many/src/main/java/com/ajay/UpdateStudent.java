package com.ajay;

import com.ajay.model.Course;
import com.ajay.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class UpdateStudent {
    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        Course course = session.get(Course.class, 1);
        Student student = session.get(Student.class, 1);
        student.setCourses(List.of(course));
        session.update(student);
        tx.commit();
        session.close();
        System.out.println("Student and Course Type Object Saved");


    }
}

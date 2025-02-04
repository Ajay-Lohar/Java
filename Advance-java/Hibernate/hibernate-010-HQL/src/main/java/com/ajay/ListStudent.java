package com.ajay;


import com.ajay.model.Student;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class ListStudent {
    public static void main( String[] args ){
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        int id = 52;//get this from user
        String hql = "from Student where id=:id";
        Query query = session.createQuery(hql);
        query.setParameter("id", id);
        List<Student> students = query.getResultList();
        students.forEach(System.out::println);
        session.close();

    }
}

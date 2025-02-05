package com.itshaala.dao;

import com.itshaala.configuration.HibernateConfig;
import com.itshaala.model.Course;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CourseDao {
    public void addCourse(Course course) {
        Session session = HibernateConfig.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.save(course);
        transaction.commit();
        session.close();
        System.out.println("Course object saved successfully.");
    }

    public void updateCourse(Course course) {
        Session session = HibernateConfig.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.update(course);
        transaction.commit();
        session.close();
        System.out.println("Course object updated successfully.");
    }

    public void deleteCourse(Course course) {
        Session session = HibernateConfig.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.delete(course);
        transaction.commit();
        session.close();
        System.out.println("Course object deleted successfully.");
    }

    public Course getCourse(int id) {
        Session session = HibernateConfig.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        Course course = session.get(Course.class, id);
        transaction.commit();
        session.close();
        return course;
    }
}
package com.itshaala.dao;

import com.itshaala.model.Movie;
import com.itshaala.util.SessionFactoryUtil;
import lombok.AllArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
@AllArgsConstructor
public class MovieDao {
    public void addMovie(Movie movie) {
        SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(movie);
        transaction.commit();
        session.close();
        System.out.println("Movie added successfully");
    }

    public void updateMovie(Movie movie) {
        SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        //non-select query
        Transaction transaction = session.beginTransaction();
        session.update(movie);
        transaction.commit();
        session.close();
        System.out.println("Movie updated successfully");
    }

    public void deleteMovie(Movie movie) {
        SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        //non-select query
        Transaction transaction = session.beginTransaction();
        session.delete(movie);
        transaction.commit();
        session.close();
        System.out.println("Movie deleted successfully");
    }

    public Movie getMovieById(UUID movieId) {
        SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        //non-select query
        Movie movie = session.get(Movie.class, movieId);
        session.close();
        return movie;
    }


}

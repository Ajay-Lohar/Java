package com.itshaala.service;

import com.itshaala.dao.MovieDao;
import com.itshaala.model.Movie;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class MovieService {
    private MovieDao movieDao;

    public void addMovie(Movie movie) {
        movieDao.addMovie(movie);
    }
    public void updateMovie(Movie movie) {
        movieDao.updateMovie(movie);
    }

    public void deleteMovie(Movie movie) {
        movieDao.deleteMovie(movie);
    }
    public Movie getMovieById(UUID movieId) {
        return movieDao.getMovieById(movieId);
    }
}

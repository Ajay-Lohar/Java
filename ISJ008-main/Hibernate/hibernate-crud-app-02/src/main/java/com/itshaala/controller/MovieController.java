package com.itshaala.controller;

import com.itshaala.model.Movie;
import com.itshaala.service.MovieService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.UUID;

@Controller
@AllArgsConstructor
public class MovieController {
    private MovieService movieService;

    public void addMovie(Movie movie){
        movieService.addMovie(movie);
    }
    public void updateMovie(Movie movie) {
        movieService.updateMovie(movie);
    }

    public void deleteMovie(Movie movie) {
        movieService.deleteMovie(movie);
    }
    public Movie getMovieById(UUID movieId) {
        return movieService.getMovieById(movieId);
    }
}

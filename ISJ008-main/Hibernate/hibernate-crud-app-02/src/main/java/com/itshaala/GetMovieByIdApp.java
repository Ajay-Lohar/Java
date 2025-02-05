package com.itshaala;

import com.itshaala.config.SpringConfig;
import com.itshaala.controller.MovieController;
import com.itshaala.model.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;
import java.util.UUID;

/**
 * Hello world!
 */
public class GetMovieByIdApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        MovieController movieController = context.getBean(MovieController.class);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the movie id");
        UUID movieId = UUID.fromString(scanner.next());
        Movie movie = movieController.getMovieById(movieId);
        System.out.println(movie);
    }
}

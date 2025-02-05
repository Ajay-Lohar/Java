package com.itshaala;

import com.itshaala.config.SpringConfig;
import com.itshaala.controller.MovieController;
import com.itshaala.model.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

/**
 * Hello world!
 */
public class SaveMovieApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        MovieController movieController = context.getBean(MovieController.class);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter movie title: ");
        String movieTitle = scanner.next();

        System.out.println("Enter movie genre: ");
        String genre = scanner.next();

        System.out.println("Enter movie director: ");
        String director = scanner.next();

        System.out.println("Enter movie rating: ");
        String rating = scanner.next();

        System.out.println("Enter movie year: ");
        int year = scanner.nextInt();

        Movie movie = Movie.builder()
                .title(movieTitle)
                .genre(genre)
                .director(director)
                .rating(rating)
                .year(year)
                .build();

        movieController.addMovie(movie);
    }
}

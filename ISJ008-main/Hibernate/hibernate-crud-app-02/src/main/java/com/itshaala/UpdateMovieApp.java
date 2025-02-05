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
public class UpdateMovieApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        MovieController movieController = context.getBean(MovieController.class);

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter movie id");
        UUID movieId = UUID.fromString(scanner.next());

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
                .movieId(movieId)
                .title(movieTitle)
                .genre(genre)
                .director(director)
                .rating(rating)
                .year(year)
                .build();

        movieController.updateMovie(movie);
    }
}

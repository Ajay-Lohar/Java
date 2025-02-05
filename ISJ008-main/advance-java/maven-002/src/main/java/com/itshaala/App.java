package com.itshaala;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Movie movie = Movie.builder()
                .movieId(1)
                .movieName("Tere Naam")
                .movieDescription("Unqiue by Salman khan sir")
                .build();
        System.out.println(movie);
    }
}

package accessSpecifiers;

import java.util.ArrayList;

public class MovieTest {
    public static void main(String[] args) {
        Movie movie = new Movie();
        //System.out.println(movie.movieId);
        //System.out.println(movie.movieName);
        movie.setMovieId(101);
        movie.setMovieName("Mera pyar - Java");

        System.out.println(movie.getMovieId());
        System.out.println(movie.getMovieName());

        ArrayList arrayList = new ArrayList();
    }
}

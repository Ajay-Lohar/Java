package _5_classComponents.thisKeyword;

public class Movie {
    int movieId;
    String movieName;
    int moviePrice;

    //zero param constructor
    public Movie() {
    }

    //parameterized constructor --> all argument constructor
    public Movie(int movieId, String movieName, int moviePrice) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.moviePrice = moviePrice;
    }

    public static void main(String[] args) {
        Movie movie = new Movie(101, "Java", 450);
    }


}

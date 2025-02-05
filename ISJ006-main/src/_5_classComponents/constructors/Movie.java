package _5_classComponents.constructors;

public class Movie {
    int movieId;
    String movieName;
    int moviePrice;

    //zero param constructor
    public Movie() {
    }

    //parameterized constructor --> all argument constructor
    public Movie(int movieIdTemp, String movieNameTemp, int moviePriceTemp) {
        //assign local variable to the instance variable
        movieId = movieIdTemp;
        movieName = movieNameTemp;
        moviePrice = moviePriceTemp;
    }

    public static void main(String[] args) {
        Movie movie = new Movie(101, "Java", 450);
    }


}

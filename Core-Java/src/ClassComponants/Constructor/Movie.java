package ClassComponants.Constructor;

public class Movie {
    int id;
    String title;
    String genre;
    int year;
    String director;
    int rating;

    //zero parameterized constructor
    public Movie() {
        System.out.println("Zero param constructor1");
        id = 1;
        title = "maharaja";
        genre = "thriller";
        year = 2024;
        director = "Kartik";
        rating = 9;
    }

    // all args constructor
    public Movie(int id, String title, String genre, int year, String director, int rating) {
        //local variable and instance variable have the same name
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.director = director;
        this.rating = rating;
    }

    // copy constructor
    public Movie(Movie movie) {

        this.id = movie.id;
        this.title = movie.title;
        this.genre = movie.genre;
        this.year = movie.year;
        this.director = movie.director;
        this.rating = movie.rating;
    }




    public static void main(String[] args) {
        Movie movie1 = new Movie();// call to zero param constructor
        Movie movie3 = new Movie(1, "abcd", "comedy", 2009, "salman", 3);// call to  param constructor
        Movie movie2 = new Movie(movie3);// call to Copy constructor

    }
}
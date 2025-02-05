package classComponents.thisKeyword;

public class Movie {
    int movieId;
    String movieName;
    int movieTicketPrice;

    public void setMovie(int movieId, String movieName, int movieTicketPrice) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieTicketPrice = movieTicketPrice;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setMovieTicketPrice(int movieTicketPrice) {
        this.movieTicketPrice = movieTicketPrice;
    }

    public static void main(String[] args) {
        Movie movie1 = new Movie();
        Movie movie2 = new Movie();
        Movie movie3 = new Movie();

        movie1.setMovie(1, "Inception", 300);
        movie2.setMovie(2, "Avatar", 900);
        movie3.setMovie(3, "Adi purush", 90);

        System.out.println("id " + movie1.movieId + "\t name :" + movie1.movieName + "\t price " + movie1.movieTicketPrice);
        System.out.println("id " + movie2.movieId + "\t name :" + movie2.movieName + "\t price " + movie2.movieTicketPrice);
        System.out.println("id " + movie3.movieId + "\t name :" + movie3.movieName + "\t price " + movie3.movieTicketPrice);

    }
}

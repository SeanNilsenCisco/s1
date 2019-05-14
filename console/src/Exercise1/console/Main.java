package Exercise1.console;

import Exercise1.bo.MovieDetails;

public class Main {

    public static void main(String[] args) {

        InstanceOfMovieDetails();
    }

    private static void InstanceOfMovieDetails() {
        // instantiating a new object of the MovieDetails class.
        MovieDetails myFirstMovie = new MovieDetails();
        myFirstMovie.setFirstName("Sylvester");
        myFirstMovie.setLastName("Stallone");
        myFirstMovie.setMovieRole("Actor");
        myFirstMovie.setMovieTitle("Rocky");
        myFirstMovie.setRating("PG-13");
        myFirstMovie.setId(1);


        System.out.print(myFirstMovie.getMovieTitle() + ": ");
        System.out.print(myFirstMovie.getMovieRole() + " --- ");
        System.out.print("  ");
        System.out.print(myFirstMovie.getFirstName() + " ");
        System.out.print("  ");
        System.out.print(myFirstMovie.getLastName()+ " ");
        System.out.println(myFirstMovie.getRating());
        System.out.println(myFirstMovie.getId());


        MovieDetails mySecondMovie = new MovieDetails();
        mySecondMovie.setFirstName("Christoph");
        mySecondMovie.setLastName("Waltz");
        mySecondMovie.setMovieRole("Actor");
        mySecondMovie.setMovieTitle("Inglorious Basterds");
        mySecondMovie.setRating("R");
        mySecondMovie.setId(2);



        System.out.print(mySecondMovie.getMovieTitle() + ": ");
        System.out.print(mySecondMovie.getMovieRole() + " --- ");
        System.out.print("  ");
        System.out.print(mySecondMovie.getFirstName() + " ");
        System.out.print("  ");
        System.out.print(mySecondMovie.getLastName()+ " ");
        System.out.println(mySecondMovie.getRating());
        System.out.println(mySecondMovie.getId());


        // setting the value for the super class

    }

}

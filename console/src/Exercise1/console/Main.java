package Exercise1.console;

import Exercise1.bo.*;

public class Main {

    public static void main(String[] args) {

        InstanceOfMovieDetails();
    }

    private static void InstanceOfMovieDetails() {
        // instantiating a new object of the MovieDetails class.
        MovieDetails myFirstMovie = new MovieDetails();

        //use a method to get a movie object - later on this will come from our DB
        Movie m1 = getMovie();
        //set that object into the MovieDetails properties
        myFirstMovie.setMovie(m1);

        /*
            The above 2 lines of code could have been done in 1 line with the same result
        */
        myFirstMovie.setMovie(getMovie());

        /*
            When we translate lines of code to english many lines will be read from right to left instead of the normal left to right:
            "We are calling the getMovie method, it's return value is used in the setMovie method of the myFirstMovie object"
        */

        System.out.println("Movie: " + myFirstMovie.getMovie().getTitle());

        //use a method to Get a person object - later on this will come from our DB
        Person p1 = getPerson();
        //set that object into the MovieDetails properties
        myFirstMovie.setPerson(p1);

        System.out.println("Movie Person: " + myFirstMovie.getPerson().getLastName() + ", " + myFirstMovie.getPerson().getFirstName());

        // Create more objects and set properties
        // Then use the abstracted objects to output information

    }

    private static Role getRole() {
        Role role = new Role();
        role.setRoleId(1);
        role.setRole("Actor");
        return role;
    }

    private static Movie getMovie() {
        Movie m1 = new Movie();
        m1.setMoviesId(1);
        m1.setTitle("Rocky");
        return m1;
    }

    private static Person getPerson() {
        Person p1 = new Person();
        p1.setActorsId(1);
        p1.setFirstName("Sylvester");
        p1.setLastName("Stallone");
        return p1;
    }

}

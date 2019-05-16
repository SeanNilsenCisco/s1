package Exercise1.console;

import Exercise1.bo.*;

import java.util.ArrayList;
import java.util.List;

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

        /*
            To do this as a Collection (using the List interface and then ArrayList implementation class...
            We can write the following code.
            Line 1 - Create the List as an Array List
            Line 2 - get a ProdMovie object and add it to the List
            Line 3 - put that Movie List into the myFirstMovie object
         */
        List<ProdMovie> theMovieList = new ArrayList<ProdMovie>();
        theMovieList.add(getProdMovie());
        myFirstMovie.setProdMovie(theMovieList);

        //Then we can use for...each structures to iterate and display any data inside that list:
        for(ProdMovie pm : myFirstMovie.getProdMovie()){
            System.out.println("Production Company: " + pm.getProdCo().getCompany());
        }

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

    private static ProdMovie getProdMovie(){
        ProdCo pc = new ProdCo("Warner Brothers");
        ProdMovie pm = new ProdMovie(pc);
        //read from left to right...
        return pm;
    }

}

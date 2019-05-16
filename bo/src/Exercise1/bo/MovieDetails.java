package Exercise1.bo;

import java.util.List;

public class MovieDetails extends BaseBO {

    // region PROPERTIES
    // MovieDetailsId
    private int MovieDetailsId;
    //Movie
    private Movie movie;
    // Person
    private Person person;
    // Role
    private Role role;
    // ProdMovie
    private List<ProdMovie> prodMovie;
    // RatingsId
    private int RatingsId;
    // Rating
    private String Rating;

    //    endregion


    // region GETTERS / SETTERS

    public void setMovieDetailsId(int movieDetailsId) {
        this.MovieDetailsId = movieDetailsId;
    }

    public int getMovieDetailsId() {
        return this.MovieDetailsId;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Role getRole() {
        return this.role;
    }

    public void setRatingsId(int ratingsId) {
        this.RatingsId = ratingsId;
    }

    public int getRatingsId() {
        return this.RatingsId;
    }

    public void setRating(String rating) {
        this.Rating = rating;
    }

    public String getRating() {
        return this.Rating;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public List<ProdMovie> getProdMovie() {
        return prodMovie;
    }

    public void setProdMovie(List<ProdMovie> prodMovie) {
        this.prodMovie = prodMovie;
    }

    // endregion


}

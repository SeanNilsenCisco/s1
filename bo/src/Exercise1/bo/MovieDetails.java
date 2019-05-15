package Exercise1.bo;

public class MovieDetails extends BaseBO {

    // region PROPERTIES
    // MovieDetailsId
    private  int MovieDetailsId;

    //Movie
    private Movie movie;
    // Person
    private Person person;

    // RoleId
    private Role role;

    // MovieRole
    private String MovieRole;

    // ProductionMovieId
    private  int ProductionMovieId;

    // ProdCoId = production company Id
    private  int ProdCoId;

    // Company = production company
    private String Company;

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

    public void setProductionMovieId(int productionMovieId){
        this.ProductionMovieId = productionMovieId;
    }

    public int getProductionMovieId() {
        return this.ProductionMovieId;
    }

    public void setProdCoId(int prodCoId) {
        this.ProdCoId = prodCoId;
    }

    public int getProdCoId() {
        return this.ProdCoId;
    }

    public void setCompany(String company) {
        this.Company = company;
    }

    public String getCompany() {
        return this.Company;
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
    // endregion


}

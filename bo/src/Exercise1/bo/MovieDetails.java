package Exercise1.bo;

public class MovieDetails extends BaseBO {

    // region PROPERTIES
    // MovieDetailsId
    private  int MovieDetailsId;

    // MovieId
    private  int MovieId;

    // MovieTitle
    private  String MovieTitle;

    // PersonId
    private int PersonId;

    // FirstName
    private  String FirstName;

    // LastName
    private  String LastName;


    // RoleId

    private int RoleId;

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

    public void setMovieId(int movieId) {
        this.MovieId = movieId;
    }

    public int getMovieId() {
        return this.MovieId;
    }

    public void setMovieTitle(String movieTitle) {
        this.MovieTitle = movieTitle;
    }

    public String getMovieTitle() {
        return this.MovieTitle;
    }

    public void setPersonId(int personId) {
        this.PersonId = personId;
    }

    public int getPersonId() {
        return this.PersonId;
    }

    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    public String getFirstName() {
        return this.FirstName;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    public String getLastName() {
        return this.LastName;
    }

    public void setRoleId(int roleId) {
        this.RoleId = roleId;
    }

    public int getRoleId() {
        return this.RoleId;
    }

    public void setMovieRole(String movieRole) {
        this.MovieRole = movieRole;
    }

    public String getMovieRole() {
        return this.MovieRole;
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
    // endregion


}

package Exercise1.bo;

public class Movie extends BaseBO{

    private int moviesId;
    private String title;

    //region GETSET
    public int getMoviesId() {
        return moviesId;
    }

    public void setMoviesId(int moviesId) {
        this.moviesId = moviesId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    //endregion
}

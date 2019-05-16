package Exercise1.bo;

public class ProdCo {

    private String company;

    //region Constructors
    public ProdCo(String company){
        this.company = company;
    }
    //endregion

    //region GETSET
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    //endregion
}

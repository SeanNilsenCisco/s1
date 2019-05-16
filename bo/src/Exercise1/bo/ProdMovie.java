package Exercise1.bo;

public class ProdMovie {

    private ProdCo prodCo;

    //region CONSTRUCTORS
    public ProdMovie(ProdCo prodCo){this.prodCo = prodCo;}
    //endregion

    //region GETSET
    public ProdCo getProdCo() {
        return prodCo;
    }

    public void setProdCo(ProdCo prodCo) {
        this.prodCo = prodCo;
    }
    //endregion

}

package Exercise1.bo;

public class BaseBO {

    // region PROPERTY
    /*integers, all of the properties have identical primitive types
    of Id;
     */


    private int Id;

    // endregion

    // region GETTERS / SETTERS
//    creating getters and setters for this Property

    public void setId (int id) {
        this.Id = id;
    }

    public int getId() {
        return this.Id;
    }


    // endregion

}

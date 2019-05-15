package Exercise1.bo;

public class Person extends BaseBO{
    private int personId;
    private String firstName;
    private String lastName;

    //region GETSET
    public int getPersonId() {
        return personId;
    }

    public void setActorsId(int personId) {
        this.personId = personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    //endregion
}

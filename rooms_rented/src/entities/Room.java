package entities;
public class Room {
    private String renter;
    private String email;

    public Room(String renter, String email) {
        this.renter = renter;
        this.email = email;
    }

    public String getRenter() {
        return renter;
    }

    public void setRenter(String renter) {
        this.renter = renter;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String toString() {
        return this.renter + "," + this.email;
    }
}

package VehicleRental.Models;

public class User {
    private String name;
    private String email;
    private String liscence;

    public User(String name, String email,String liscence) {
        this.name = name;
        this.email = email;
        this.liscence = liscence;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    
    public String getLiscence() {
        return liscence;
    }
    
}

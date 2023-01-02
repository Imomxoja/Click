package service.model;

public class User extends IdCreator{
    private String phoneNumber;
    private String password;

    public User(String phoneNumber, String password) {

        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPassword() {
        return password;
    }
}

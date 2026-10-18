package ArrayList;

public class User {
    private String username;
    private String password;
    private String peoplenumber;
    private String phonenumber;

    public User(String username, String peoplenumber, String password, String phonenumber) {
        this.username = username;
        this.peoplenumber = peoplenumber;
        this.password = password;
        this.phonenumber = phonenumber;
    }
    public User(){}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getPeoplenumber() {
        return peoplenumber;
    }

    public void setPeoplenumber(String peoplenumber) {
        this.peoplenumber = peoplenumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

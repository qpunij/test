package test;

public class user implements Cloneable
{
    private String username;

    public user(String username) {
        this.username = username;
    }
    public user(){}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

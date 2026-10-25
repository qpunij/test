package test;

public class clone {
    public static void main(String[] args) throws CloneNotSupportedException {
user u1 = new user("nwd");
user u2 = (user)u1.clone();
        System.out.println(u1.getUsername());
        System.out.println(u2.getUsername());
    }

}

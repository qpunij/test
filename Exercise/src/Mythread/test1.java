package Mythread;

public class test1 {
    public static void main(String[] args) {
        mythread1 m1 = new mythread1();
        mythread1 m2 = new mythread1();
        m1.start();
        m2.start();
    }
}

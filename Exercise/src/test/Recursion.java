package test;

public class Recursion {
    public static void main(String[] args) {
        int num  = 10;
        System.out.println(number(num));
    }
    public static int number(int number){
        if(number==1){
            return number;
        }
       return number*number(number-1);

    }
}

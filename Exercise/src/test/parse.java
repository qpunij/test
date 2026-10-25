package test;

public class parse {
    public static void main(String[] args) {
        String s =  "137147141";
        if(!s.matches("[1-9]\\d{0,9}")){
            System.out.println("数据错误");

        }else {
            System.out.println("数据正确");
        }
        int number = 0;
        for (int i = 0; i < s.length(); i++) {
           int a =  s.charAt(i) - '0';
            System.out.println(a);
            number = number*10+a;
        }
        System.out.println(number);
    }
}

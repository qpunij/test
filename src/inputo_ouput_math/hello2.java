package inputo_ouput_math;

import java.util.Scanner;

public class hello2 {
    public static void main(String[] args) {
      /*  byte a = 127;
        byte b = 124;
        int f = 213;
        byte c = (byte)(a+b);
        int d = a+b;
        int e = f+a;
        char v = 'A';
        char D = (char) (v+32);
        System.out.println(D);
        */
        int a = 10;
        int b = 20;
        a+=b;
        System.out.println(a);
        a-=b;
        System.out.println(a);
        System.out.println("输入我的身高；");
        Scanner s = new Scanner(System.in);
        double c = s.nextDouble();

        System.out.println("别人的身高");

        double e = s.nextDouble();
        boolean f = c>e;
        System.out.println(f);
    }
}
//判断某个数能否被某个数整除

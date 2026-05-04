package inputo_ouput_math;

import java.util.Scanner;

public class hello3 {
   public static void main() {
       Scanner sc = new Scanner(System.in);
      /* System.out.println("输入数字：");
       int a1 = sc.nextInt();
     boolean b =  a1>=1&a1<=10;
       System.out.println( b);
       System.out.println("输入数字：");
       int c = sc.nextInt();
       boolean d = c<=1|c>=10;
       System.out.println(d);

       System.out.println("输入数字四位数：");
       int a = sc.nextInt();
       int ge = a % 10;
       int shi = a / 10 % 10;
       int bai = a / 100 % 10;
       int qian = a / 1000% 10;
       boolean b =   ge==qian&&shi==bai;
       System.out.println(ge==qian|&&hi==bai);
*/

    /*   int a = sc.nextInt();

        int ge =a%10;
        int shi =a/10%10;
       System.out.println(ge==7||shi==7||a%7==0);
       int e = 20;
       int s =  10;
       System.out.println(e>s?e:s);*/
       int hp = 100;
       System.out.println("输入伤害：");
       int hurt = sc.nextInt();
       hp -= hurt;
       if(hp<1){
hp = 1 ;
       }
       System.out.println("恢复血量：");
       int blood = sc.nextInt();
       hp += blood;
       if(hp>100){
hp = 100;
       }
       System.out.println("剩余血量："+hp);

    }


}

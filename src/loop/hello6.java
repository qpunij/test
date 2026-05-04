package loop;

import java.util.Scanner;

public class hello6 {
    public static void main(String args[]){

      /* double benjin = 10000;
        int mubiao  = 20000;
        int year = 0;
        while(benjin<mubiao){
            benjin = benjin + (benjin*0.019);
            year++;

        }
        System.out.println(year);

       */
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        if (a < 0) {
//            a = -a;
//
//        }
//        int sum = 0;
//        while (a != 0) {
//            int b = a % 10;
//            sum = sum + b;
//            a = a / 10;
//
//        }
//        System.out.println(sum);
       // System.out.println("请输入一个数：");
       /* int a = 0;
        while(true){
            System.out.println("请输入一个数：");
            a = sc.nextInt();
            if(a<=0){
                System.out.println("请输入正数");

            }
            else{
                break;
            }
        }
        int count = 0;
        for(int i = 2;i<Math.sqrt(a);i++){
            if(a%i==0){
                System.out.println("不是质数");
                count++;
                break;
            }

        }
        if(count==0){
            System.out.println("是质数");
        }

*/
       /* for(int i = 1;i<=100;i++){
            if(i%10==7||i/10%10==7||i%7==0){
                System.out.println("过");
                continue;
            }
            System.out.println( i);

        }*/
        int a = sc.nextInt();
        for(int i = 1;i<=a;i++){
            if(i%4==0||i%10==4||i/10%10==4){

                continue;
            }
            System.out.println( i);

        }
    }
}

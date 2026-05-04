package conditionaljudgment;

import java.util.Scanner;

public class hello4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
    /*    System.out.println("输入价格：");
        double price = sc.nextDouble();
     double price1 = price * 0.9;
     double price2 = 0;
     if(price>=30){
price2 = price - 10 ;
     }
     else {
price2 = price;
     }
     System.out.println(price1);
     System.out.println(price2);
     System.out.println("最优惠的是：");
     System.out.println(price1<price2?"elm":"meituan");

     */
       /* System.out.println("输入数字：");


        int a = sc.nextInt();

        if(a%2==0){
      a = a/2;
            System.out.println( "shuchu:"+a);
            System.out.println(a<0?"错误，请输入正数":"正确");
        }
        else{
      a = a*3+1;
            System.out.println( "shuchu:"+a);
            System.out.println(a<0?"错误，请输入正数":"正确");
        }

        */
      /*  System.out.println("输入金额：");
        double pay = sc.nextDouble();
        double savepay = 0;
        if(pay>0){
             if(pay<10){
                savepay = 0;

            }
             else if(pay<50){
                savepay = 4;
            }
             else if(pay<100){
                savepay = 25;
            } else if (pay>=200) {
                 savepay = 45;

             }

        }
        else {
            System.out.println("输入错误");
        }
        double huiyuan = pay *0.9;

            System.out.println((pay-savepay)<huiyuan?"不参与会员优惠"+(pay-savepay):"参与会员优惠"+huiyuan);


*/
      /*  System.out.println("输入支付金额：");
        double  balance= sc.nextDouble();
        double chushi=0;
        if(balance>0){
            if(balance<1000){
                balance = balance;

            }
            else if(balance<2000){
                balance = balance + 200;

            }
            else if(balance<5000){
                balance = balance + 500;

            }
            else if(balance>=5000){
                balance = balance + 1000;

            }

        }
        else{
            System.out.println("输入错误");
        }
        System.out.println("余额："+balance);
        */
       /* System.out.println("输入用电度数：");
       double power = sc.nextDouble();
       double pay = 0;
       if(power>0){
           if(power<=100){
               pay = power * 0.5;

           }
           else if(power<=200){
               pay = (power-100)*0.8+100*0.5;

           }
           else if(power<=300){
               pay = (power-200)*1+100*0.5+100*0.8;

           }
           else if(power>300){
               pay = (power-300)*1+100*0.5+100*0.8;

           }
           else {
               System.out.println("输入错误");
           }
           System.out.println("支付金额："+pay);
       }
*/
        System.out.println("输入第一条边：");
        double a = sc.nextDouble();
        System.out.println("输入第二条边：");
        double b = sc.nextDouble();
        System.out.println("输入第三条边：");
        double c = sc.nextDouble();
        if(a+b>c||a+c>b||b+c>a){
            if(a==b&&a==c){
                System.out.println("等边三角形");

            }
            else if(a==b||a==c||b==c){
                System.out.println("等腰三角形");

            }
            else if(a*a+b*b==c*c||a*a+c*c==b*b||b*b+c*c==a*a){
                System.out.println("直角三角形");

            }


        }
        else{
            System.out.println("非三角形");
        }
    }

}

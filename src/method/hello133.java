package method;

import java.util.Scanner;

public class hello133 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入重量单位kg：");
        double a= sc.nextDouble();
        int a1 = (int) a;
        if(a%1!=0){
             a1 = (int) (a+1);
        }
        System.out.println("不足1kg按1kg计算，您的总重为："+a1+"kg");
        int sum2 =post(a1);
        double sum3 = sum2/10.0;
        System.out.println("您需要支付的邮费："+sum3+"元");
    }
    public static int post(int a1){
        double sum =0;
        int sdm1 = 0;
       if(a1<=1){
           sum=10.0;
       }
       else if(a1<=5){
           sum=(a1-1)*2+10;
       }
       else {
           sum=(a1-5)*1.5+18;
       }
       if(sum%1!=0){
            sdm1 = (int) (sum*10);
       }
       else {
           sdm1 = (int) (sum*10);
       }
        return sdm1;
    }
}

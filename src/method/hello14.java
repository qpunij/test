package method;

import java.util.Scanner;

//机票价格
public class hello14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入机票价格：");
        double price = input.nextDouble();
        System.out.println("请输入舱位：0经济仓，1头等舱");
        int level = input.nextInt();
        System.out.println("请输入月份：,3-5月为旺季,6-来年2月为淡季");
        int month = input.nextInt();
        int count =0;
        if(month>=3&&month<=5){
          count=  ticket(price,level,0.9,0.95);
        }
        else if(month>=6&&month<=12||month>=1&&month<=2){
        count =    ticket(price,level,0.6,0.8);
        }
        else{
            System.out.println("请重新输入：");
        }
        System.out.println("票价为："+count);
    }
    public static int  ticket(double price,int level,double evo,double vd){
        int economy = 0;
      if(level==0){
          economy = (int)(price*evo);
      }
      else if(level==1){
          economy = (int)(price*vd);
      }
      else{
          System.out.println("请重新输入：");


      }
        return economy;
    }
}

package loop;

import java.util.Random;
import java.util.Scanner;

public class hello7 {
   public static void main(String[] args) {




        int count2 = 0;
        while(true) {
            Random r = new Random();
            int a = r.nextInt(3,50);



            Scanner sc = new Scanner(System.in);
            int count1 = 0;
            while (true) {
                count1++;

                System.out.println("请输入数字：");
                int b = sc.nextInt();
                if (b < a) {
                    System.out.println(" 傻逼，猜小了");

                } else if (b > a) {
                    System.out.println("傻逼猜错了，猜大了");

                } else {
                    System.out.println("二逼，你终于猜对了");
                    break;
                }
                if (count1 == 3) {
                    System.out.println("你猜了3次，要我给你点提醒吗，要就输入1，不要就输入2");
                    int c = sc.nextInt();
                    if (c == 1) {
                        System.out.println("在" + (a - 4) + "附近");
                    } else {
                        System.out.println("下次要加油");
                    }

                } else if (count1 == 5) {
                    System.out.println("村薜,答案是" + a + "");
                    break;
                }
            }
            System.out.println("回车");
            new Scanner(System.in).nextLine();
            System.out.println("是否继续游戏：输入y是,其余否");
             char d = sc.next().charAt(0);
             if(d!='y'){
                 break;

             }
        }
        int [] arr1 = new int[]{12,23,34,45,56};
        int [] arr2 = {21390,2340,3450,4560,5670};
        double [] arr3 = new double[5];
    }
}

package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>() ;
        Scanner sc = new Scanner(System.in);
        while (true){
            String s = sc.nextLine();
            int num = Integer.parseInt(s);
            if(num<1||num>100){
                System.out.println("不在1到100");
                continue;

            }
            list.add(num);
            int sum = getsum(list);
            if(sum>=200){
                break;
            }else {
                System.out.println("不满足要求");
            }

        }


    }
    public  static int getsum(ArrayList<Integer> list){
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
           sum = sum +  list.get(i);




        }

        return sum;
    }
}

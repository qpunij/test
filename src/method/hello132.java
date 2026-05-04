package method;

import java.util.Scanner;

public class hello132 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; ) {
            System.out.println("请输入");
            int a = sc.nextInt();
            if (a <= 100 && a >= 0) {
arr[i] = a;
i++;
            }
            else {
                System.out.println("请重新输入：");
            }
        }
        double[] result = score(arr);
        System.out.println("及格率为"+result[2]+"平均分"+result[1]+"最高分"+result[3]);
    }
    public static double[]score(int arr[]){
        int sum =0;
        int count =0;
        int max = 0;
        for(int i =0;i<arr.length;i++){
            sum+= arr[i];
            if(arr[i]>=60){
                count++;

            }
            if(max<arr[i]){
                max = arr[i];

            }
        }
        double passrate = (double)count/arr.length;
        int arverage = sum/arr.length;
        return new double[]{ sum,arverage,passrate,max};
    }
}
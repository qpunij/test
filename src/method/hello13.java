package method;

import java.util.Scanner;

public class hello13 {
    public static void main(String[] args) {
        //评委打分
        Scanner sc = new Scanner(System.in);
int arr [] = new int [5];
for(int i=0;i<5;){
    System.out.println("请输入：");
    int a = sc.nextInt();
    if(a>=0&&a<=100){
        arr[i] = a;
        i++;
    }
    else{
        System.out.println("请重新输入：");
    }

}
int [] result = maxandmin(arr);
        System.out.println("最大分数为："+result[0]+"最小分数为："+result[1]+"总分为"+result[2]+"总分平均分数为："+result[2]/5);
        System.out.println("最终平均得分为"+(result[2]-result[0]-result[1])/3);
    }
    public static int[] maxandmin(int arr[]){
        int max = 0;
int sum = 0;
        int min = 100;
        for(int i=0;i<arr.length;i++){
sum += arr[i];
          if(max<arr[i]){
              max = arr[i];
          }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return new int[]{max, min, sum};
    }

}

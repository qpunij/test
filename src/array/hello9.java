package array;

import java.util.Random;

public class hello9 {
    static void main() {
//静态初始化

      /*  int[] arr1 = {12, 12, 13, 14, 15};
        System.out.println(arr1[0]);
        arr1[0]= 100;
        System.out.println(arr1[0]);
        for(int i = 0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
        System.out.println(arr1.length);

       */
        //动态初始化
       /* int [] arr2 = new int [5];//数据类型+【】+数组名=new+数据类型+【数组长度】；
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<arr2.length;i++){
            System.out.println("请输入第");
            arr2[i] = sc.nextInt();

        }
        for(int i = 0;i<arr2.length;i++){
            System.out.println(arr2[i]);

        }

        */
       /* System.out.println(12>13?1:2);
        int[] arr1 = {12, 123, 142, 15, 16,12};
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("请输入");
            int sum = sc.nextInt();
            if (sum == arr1[i]) {
                flag = true;
                System.out.println("存在索引" + i);
break;
            }

        }

        if (flag != true) {
            System.out.println("没找到");

        }

        */
/*        int max = arr1[0];


        for(int i = 0;i<arr1.length;i++){
        if(max<arr1[i]){
            max = arr1[i];

        }
        }
        System.out.println(max);

 */
        /*int [] arr3 = {12,182,20,38,83,29,19,103};
        Random a = new Random();
        for(int i = 0;i<arr3.length;i++){
            int random = a.nextInt(arr3.length);
            int sum = arr3[i];
            arr3[i] = arr3[random];
            arr3[random] = sum;

        }
        for(int i= 0;i<arr3.length;i++){
            System.out.println(arr3[i]);

        }



         */
        int [] arr9 = new int[10];
        Random d = new Random();
        for(int i = 0;i< arr9.length;){
            int sum = d.nextInt(101);
            int count = 0;
for(int j = 0;j<i;j++){

    if(sum==arr9[j]){
            count++;
            break;

    }


}
if(count==0){
    arr9[i] = sum;
    i++;
}
        }
        for(int i =0;i<arr9.length;i++) {
            System.out.print(arr9[i]+"  ");
        }
    }
}

package array;

import java.util.Random;

public class hello11 {
    public static void main(String[] args) {
       /* int arr [] = {1,2,3,4,6,7,8,1,4,59,0};
        int target = 7;
        int count = 0;
        for(int i =0;i<arr.length;i++ ){

            for(int j = i+1;j<arr.length;j++){
               if(target==(arr[i] +arr[j])){
                   System.out.println("target is found at index "+i+" and "+j);
                   count++;


               }

            }

        }
        System.out.println("有"+count+"组");
        System.out.print(arr.length);*/
      /*  int arr [] = {0,1,2,3,4,6,7,8,18,35,59,67};
        int arr1 [] = {5,9,16,23,34,68,99};
        int arr2 [] =new int[arr.length+arr1.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<arr.length && j<arr1.length){
            arr2[k++]=arr[i]<arr1[j]?arr[i++]:arr1[j++];
        }
        while(i<arr.length){
            arr2[k++]=arr[i++];
        }
        while(j<arr1.length){
            arr2[k++]=arr1[j++];
        }
      for( int x = 0;x<arr2.length;x++){
          System.out.println(arr2[x]);
      }

       */
/*int arr [] = {0,1,2,3,4,6,7,8,59};
int target = 9;
    for(int i = 0;i<arr.length;i++){
       if(arr[i]<target&&target<arr[i+1]){
           System.out.println("应该放到"+(i+1));
       }
    }

 */
     /* int su =  get(102,238);
      System.out.println(su);
    }
    public static int get(int a,int b){
int sum = a+b;
        return sum;

      */
        int arr[] = new int[10];
        Random d = new Random();
        for (int i = 0; i < arr.length; ) {
            int target = d.nextInt(101);
          boolean op = removel(arr,target);
            if (!op) {
                arr[i] = target;
                i++;

            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"   ");
        }
    }

    public static boolean removel(int arr[], int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (target == arr[i]) {
                return true;
            }
        }

return false;
    }
}
//数组内存分了栈和堆，int arr[] = new int[10];  arr[]在栈中，new int[10]在堆中,int arr2 = arr;把数组arr的地址赋值给arr2，静态与动态数组都分了栈和堆储存
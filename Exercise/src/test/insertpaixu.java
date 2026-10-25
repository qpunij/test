package test;

public class insertpaixu {
    public static void main(String[] args) {
        int arr[] = {12,17,11,12,10,17,80};
        int start = 0 ;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                System.out.println(i+1);
                start = i+1;
                break;
            }

        }
        for (int i = start; i < arr.length; i++) {
            int j = i;
            while (j>0&&arr[j]<=arr[j-1]){
                //交换位置，同时整体下标向前推进
 int sum  = arr[j];
 arr[j] = arr[j-1];
 arr[j-1] = sum;
j--;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

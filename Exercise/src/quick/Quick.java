package quick;

public class Quick {
    public static void main(String[] args) {
        int [] arr = {15,23,34,2,0,6,8,9,34,23};
        quick(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"   ");

        }
    }
    public static  int [] quick(int []arr,int i,int j){
        int start = i;
        int end = j;

        while(!(start==end)){
            if(start>end){
                return arr;
            }
            while(true){
                if(start>=end||arr[end]<arr[i]){
                    break;
                }
                end--;
            }
            while(true){
                if(start>=end||arr[start]>arr[i]){
                    break;
                }
                start++;
            }
            int sum = arr[start];
            arr[start] = arr[end];
            arr[end] = sum;
        }
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] =temp;
        quick(arr,i,start-1);
        quick(arr,start+1,j);
        return arr;
    }
}

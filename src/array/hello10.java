package array;

public class hello10 {
    public static void main(String[] args) {


        int arr[] = {1, 1, 1, 2,3,3, 3, 3, 4, 4};
        int slow = 0;
        int fast = 1;
        while(fast<arr.length){

            if(arr[slow] != arr[fast]){
                slow++;
                arr[slow] = arr[fast];
            }
            fast++;

        }
        for(int i =  0;i<=slow;i++){
            System.out.print(arr[i]);
        }
    }
}

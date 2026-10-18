package util;

public class arrayutil {
    private arrayutil(){

    }
    public static String getarr(int arr[]){
        StringBuilder str = new StringBuilder();
        str.append("{");
        for (int i = 0; i < arr.length; i++) {
            if(i!=arr.length-1) {
                str.append(arr[i] + ",");
            }else {
                str.append(arr[i]);
            }
        }
        str.append("}");
String s =   str.toString();
return s;
    }
    public static double  avg(int arr[]){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum =  sum +arr[i];
        }
        double avg = sum/arr.length;
        return avg;
    }
}

package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class brithday {
//    public static void main(String[] args) throws ParseException {
//        String s = "2006-07-24";
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        Date date = simpleDateFormat.parse(s);
//        System.out.println(date);
//        long l = date.getTime();
//        System.out.println(l);
//        long todaytime = System.currentTimeMillis();
//        long time = todaytime - l;
//        System.out.println(time / 1000 / 60 / 60 / 24);
//
//    }
    //二分查找
public static void main(String[] args) {
int arr[] = {12,132,134,456,687,1000};
int num = 100;
    System.out.println(search(arr, num));

}
public static int search(int [] arr,int number){

    int min = 0;
    int max = arr.length-1;
 while(true){
     if(min>max ){
         return -1;


     }
     int mid = (max+min)/2;
     if(arr[mid]>number){
         max=mid-1;
         continue;


     } else if (arr[mid]<number) {
         min=mid+1;
         continue;
     }else {
         return arr[mid];

     }
 }



}
}

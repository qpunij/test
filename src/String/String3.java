package String;

import java.util.Scanner;
import java.util.StringJoiner;

public class String3 {
  public static void main(String[] args)  {
      String st1 = "12";
      String st2 =  "15";
int x = change(st1)*change(st2);
String x1 = x+"";
      System.out.println(x1);
    }
    public static  int change(String arr1){
      char q[]  = arr1.toCharArray();
      int number1=0;
    for(int i=0;i<arr1.length();i++){
        number1 = number1*10+q[i]-48;
    }
return number1;
    }
}

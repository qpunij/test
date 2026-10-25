package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class simpledate {
    public static void main(String[] args) throws ParseException {
        String s = "2000-11-11";
        SimpleDateFormat  str1 = new SimpleDateFormat("yyyy-MM-dd");
Date d =  str1.parse(s);
SimpleDateFormat str2 = new SimpleDateFormat("yyyy年MM月dd日");
String s1 =  str2.format(d);
        System.out.println(s1);
    }

}

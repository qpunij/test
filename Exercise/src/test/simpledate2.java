package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class simpledate2 {
    public static void main(String[] args) throws ParseException {
        String s = "2023年11月11日0:0:0";

        String s2 =  "2023年11月11日0:10:0";
        String orderstart = "2023年11月11日0:01:0";
        SimpleDateFormat simple = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
        Date d1 = simple.parse(s);
        Date d2 = simple.parse(s2);
        Date d3 = simple.parse(orderstart);
       String s4 =  simple.format(d1);
        if(d3.getTime()>= d1.getTime()&&d3.getTime()<=d2.getTime()){
            System.out.println("下单成功");
            System.out.println(s4);
        }
    }
    }



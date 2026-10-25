package test;

import javax.xml.crypto.Data;
import java.util.Date;

public class data {
    public static void main(String[] args) {
        Date d  =  new Date();
        Date d1 = new Date();
        System.out.println(d.getTime());
        System.out.println(d1.getTime());
if(d.getTime()<d1.getTime()){
    System.out.println("55");
}

    }
}

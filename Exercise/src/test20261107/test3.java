package test20261107;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class test3 {
    public static void main(String[] args) throws IOException {
        long l = System.currentTimeMillis();
        FileOutputStream fos = new FileOutputStream("Exercise\\aaa");
        fos.write(97);


        String s  = "qjhdqjhfq";
        byte[] bytes = s.getBytes();
        fos.write(bytes);
        FileInputStream inputStream = new FileInputStream("Exercise\\aaa");
        int b = 0;
          byte [] bytes2 =     new byte[2];
          int len  = inputStream.read(bytes2);
        System.out.println(new String(bytes2));
        int len1 = inputStream.read(bytes2);
        System.out.println(new String(bytes2));
        long l1 = System.currentTimeMillis();
        System.out.println(l);
        inputStream.close();
        fos.close();

    }
}

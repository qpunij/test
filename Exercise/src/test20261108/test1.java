package test20261108;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class test1 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\qpunij\\Downloads\\Microsoft.Services.Store.winmd");
        FileOutputStream fileOutputStream = new FileOutputStream("Exercise\\a.winmd");
        byte [] bytes = new byte[1024*1024*8];
        int len;
        while ((len = fileInputStream.read(bytes))!=-1){
fileOutputStream.write(bytes,0,len);

        }
        fileOutputStream.close();
        fileInputStream.close();
        long end = System.currentTimeMillis();
        System.out.println((end - start));
    }
}

package test20261109;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class test2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("", Charset.forName("GBK"));
        FileWriter fw = new FileWriter("",Charset.forName("UTF-8"));
        int b;
while ((b =fr.read())!=-1){
    fw.write(b);
}
    }
}

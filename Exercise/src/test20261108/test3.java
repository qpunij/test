package test20261108;

import java.io.*;

public class test3 {
    public static void main(String[] args) throws FileNotFoundException {
        //资源
       File file = new File("");
       //目标
       File file1 = new File("");
    }
    public static void  copy(File file,File file1) throws IOException {
        file1.mkdirs();

        File[] files = file.listFiles();
        for (File file2 : files) {

            if(file2.isFile()){
                FileInputStream inputStream = new FileInputStream(file2);
                FileOutputStream outputStream  = new FileOutputStream(new File(file1,file2.getName()));
                int b;
                byte [] bytes = new byte[1024];
                while ((b = inputStream.read(bytes))!=-1) {


                    outputStream.write(bytes,0,b);
                }
inputStream.close();
                outputStream.close();

            }else {
copy(file2,new File(file1,file2.getName()));
            }

        }

    }
}

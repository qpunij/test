package test20261107;

import java.io.File;

public class tset1 {
    public static void main(String[] args) {
        String s = "D:\\dsh-portable";
        File f = new File(s);
        System.out.println(f.exists());
        System.out.println(f.length());
        System.out.println(f.getPath());
        System.out.println(f.lastModified());
        File[] files = f.listFiles();
        for (File file : files) {
            System.out.println(file);
if(file.isFile()&&file.getName().endsWith(".txt")){
    System.out.println("找到了");

}
        }
    }
}

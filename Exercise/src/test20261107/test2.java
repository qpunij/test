package test20261107;

import java.io.File;

public class test2 {
    public static void main(String[] args) {
        File file = new File("Exercise\\aaa");
        file.mkdirs();
        System.out.println(have(file));
        file.delete();
    }
    public  static boolean have(File file){
        File[] files = file.listFiles();
        for (File file1 : files) {
            if(file.isFile()&&file.getName().endsWith(".txt")){
                System.out.println("找到了");
                return true;
            }
        }
return false;
    }
}

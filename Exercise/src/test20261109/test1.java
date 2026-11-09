package test20261109;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class test1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(""));
        String line;
        ArrayList<String> list = new ArrayList<>();
        while   (( line =  br.readLine())!=null){
            System.out.println(line);
            list.add(line);

        }

        br.close();
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                  int i = Integer.parseInt( o1.split("\\.")[0]);
                int p = Integer.parseInt( o2.split("\\.")[0]);
                return i-p;
            }
        });
        BufferedWriter bw = new BufferedWriter( new  FileWriter(""));
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();
    }

}

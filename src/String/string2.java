package String;

import java.util.Scanner;

public class string2 {
    public static void main(String[] args) {


        String str  = "hello nubsgfg wgefwhgfgwf";
        char []ch = str.toCharArray();
        int count = 0;
        for (int i = str.length()-1; i >=0; i--) {
            char c = ch[i];
            String st = c+"";
            if(st.equals(" ")){
                count=i;
                break;
            }

        }
int a = str.length()-count-1;
        System.out.println("长度为："+a);
    }
}

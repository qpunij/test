package test20261102;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class test1 {
    public static void main(String[] args) {
        System.out.println(getsum(1, 2, 3, 4, 5, 6));
        ArrayList<String> list  = new ArrayList<>();
        Collections.addAll(list,"12","123","1233","qweq");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list );
        System.out.println(8/5);
    }
    public static int getsum(int a,int...args){
        int sum = 0;
        for (int arg : args) {
         sum = sum +arg;
        }
        return sum;
    }
}


package test20261102;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class test2 {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        Collections.addAll(list1,"张伟","李强","王浩然","刘子轩","陈嘉豪","赵天宇","孙博文");
        Collections.addAll(list2,"林雨萱","周思琪","吴佳怡");
        Collections.addAll(list3,1,1,1,1,1,1,1,1,0,0,0);
        Collections.shuffle(list3);
        Random r = new Random();
        int sum = r.nextInt(list3.size());
        if(list3.get(sum)==1){
           String name =  list1.get(r.nextInt(list1.size()));
            System.out.println(name);

        }else {
            String name = list2.get(r.nextInt(list2.size()));
            System.out.println(name);
        }


    }

}

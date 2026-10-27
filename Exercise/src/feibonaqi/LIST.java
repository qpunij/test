package feibonaqi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class LIST {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<int []> list1  =new ArrayList<>();
        list.add("1111");
        list.add("2222");
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(it);

        }
        for (String s : list) {
            System.out.println(s);
        }//lambda
        list.forEach( s ->{
                System.out.println(s);

        });
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //列表迭代器
ListIterator<String> lt =  list.listIterator();
        while (lt.hasNext()){
            lt.add("666");
            String s = lt.next();
            lt.add("666");
            System.out.println(list);
        }
    }
}

package feibonaqi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class iterator {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        for (String s : list) {
            System.out.println(s);
        }
        list.forEach(s -> System.out.println(s));
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String STR = it.next();
            System.out.println(STR);

        }
    }
}

package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class phonemod {
    public static void main(String[] args) {


        ArrayList<phone> list = new ArrayList<>();
        phone p1 = new phone("xiaomi", "2000");
        phone p2 = new phone("pg", "1000");
        list.add (p1);
        list.add(p2);
        get(list);

    }
    public static void get(ArrayList<phone> list1){
        ArrayList<Integer> list2  =new ArrayList<>();
        StringBuilder SB = new StringBuilder();
        for (int i = 0; i < list1.size(); i++) {
            phone p = list1.get(i);
                    String pric  =p.getPrice();
                    SB.append(pric+"   ");
                    char [] c =pric.toCharArray();
            for (int i1 = 0; i1 < c.length; i1++) {
                int d = c[i1]-48;
                list2.add(d);
            }
        }
        System.out.println(SB);

    }
}

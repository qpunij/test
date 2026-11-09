package E;

import java.util.ArrayList;

public class ListUtil<E> {
    private ListUtil(){}
    public static <E> ArrayList<E> AddListUtil(ArrayList<E> list, E e1, E e2, E e3){
        list.add(e1);
        list.add(e2);
        list.add(e3);
        return (ArrayList<E>) list;
    }
    }


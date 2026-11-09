package E;

import java.util.ArrayList;
import java.util.LinkedList;

public class test {
    public static void main(String[] args) {
        ArrayList<lihuaCat> list = new ArrayList();
        list.add(new lihuaCat());
        ArrayList<bosCat> list1  = new ArrayList<>();
        ArrayList<hasky> list2 = new ArrayList<>();
        ArrayList<labuladuo> list3 = new ArrayList<>();
        keeppet(list);
        keeppet(list1);

        keeppet(list2);
        keeppet(list3);


    }
    public static void keeppet(ArrayList<?extends Animal> list){
        for (Animal animal : list) {
            animal.eat();
        }


    }

}

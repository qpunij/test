package test20261102;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class pokergame {
    static ArrayList<Integer> list = new ArrayList<>();
    static HashMap<Integer ,String> hm = new HashMap<>();
    //准备牌
   static {
        String[] afpt = {"♥", "♦", "♣", "♠"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K","A","2"};
int sum = 1;
        for (String s : number) {
            for (String string : afpt) {
                String end = s+string;
           list.add(sum);
                hm.put(sum,end);
                sum++;
            }
        }
        list.add(sum);
       hm.put(sum,"小王");
        sum++;
        hm.put(sum,"大王");
        list.add(sum);

    }
//打乱
    public pokergame(){
        //打乱
       Collections.shuffle(list);
        System.out.println(list);
        System.out.println(list.size());

        //发牌
        TreeSet<Integer> lodar   = new TreeSet<>();
        TreeSet<Integer> player1   = new TreeSet<>();
        TreeSet<Integer> player2   = new TreeSet<>();
        TreeSet<Integer> player3   = new TreeSet<>();

        for (int i = 0; i < list.size(); i++) {
            if(i<=2){
                lodar.add(list.get(i));
continue;
            }else if (i%3==0){
player1.add(list.get(i));
            } else if (i%3==1) {
                player2.add(list.get(i));
            }else {
                player3.add(list.get(i));
            }
        }
        //看牌
        loop("底牌",lodar);
        loop("漂亮的女生",player1);
        loop("漂亮的女孩",player2);
        loop("漂亮的女人",player3);
    }
    //给牌排序
    public void loop(String name, TreeSet<Integer> list){
        System.out.print(name+":");
        for (Integer s : list) {
           String n =  hm.get(s);
            System.out.print(n+"  ");
        }
        System.out.println();
    }

 }

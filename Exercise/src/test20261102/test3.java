package test20261102;

import java.util.*;

public class test3 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list1,"南京市","无锡市","苏州");
        Collections.addAll(list2,"武汉市","宜昌","鄂州");
        Collections.addAll(list3,"唐山","邢台","保定");
        hm.put("江苏",list1);
        hm.put("湖北",list2);
        hm.put("河北",list3);
         Set<Map.Entry<String, ArrayList<String>>>  entrySet  =    hm.entrySet();

        for (Map.Entry<String, ArrayList<String>> stringArrayListEntry : entrySet) {
            StringJoiner sj = new StringJoiner(",","","");
            String key =   stringArrayListEntry.getKey();
           ArrayList<String> value  = stringArrayListEntry.getValue();
            for (String s : value) {
                sj.add(s);
            }
            System.out.println(key+"="+sj);

        }

    }
}

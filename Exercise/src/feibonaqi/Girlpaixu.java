package feibonaqi;

import quick.Girl;

import java.util.Arrays;

public class Girlpaixu {
    public static void main(String[] args) {
        Girl g1 = new Girl("zhangsan", 19, 168.0);
        Girl g2 = new Girl("zhangsan123", 19, 178.0);
        Girl g3 = new Girl("zhangsan123", 28, 128.0);
        Girl[] s = {g1, g2, g3};
        Arrays.sort(s, (Girl o1, Girl o2)-> {
                double temp = o1.getAge() - o2.getAge();
                temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;
                temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
                if (temp > 0) {
                    return 1;
                } else if (temp < 0) {
                    return -1;
                } else {
                    return 0;
                }


        });
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].getName());

        }
    }

}

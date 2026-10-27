package quick;

import java.util.Arrays;

public class lambda {
    public static void main(String[] args) {
        method(() -> {
            return 0;

        });
        String [] S = {"aa","a","aaa","aaaa"};
        Arrays.sort(S,((o1, o2) -> o1.length()-o2.length()));
        System.out.println(Arrays.toString(S));
    }

    public static void method(swing s) {
        System.out.println("");

    }


}

interface swing {
    int s();
}
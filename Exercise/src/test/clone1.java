package test;

import java.math.BigInteger;

public class clone1 {
    public static void main(String[] args) {
        BigInteger b = BigInteger.valueOf(10);
        BigInteger a = BigInteger.valueOf(9);
       BigInteger [] v = b.divideAndRemainder(a);
        System.out.println(v[0]);
        System.out.println(v[1]);
    }



}

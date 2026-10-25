package test;

public class matcher2 {
    public static void main(String[] args) {
        String s =  "122233323请问阿迪斯";
      String s1=   s.replaceAll("[\\w&&[^_]]+","牛逼");
        System.out.println(s1);
        String[]arr =  s.split("问");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(s.replaceAll("(.)\\1+", "$1"));
    }
}

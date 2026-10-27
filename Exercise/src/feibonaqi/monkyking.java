package feibonaqi;

public class monkyking {
    public static void main(String[] args) {
        System.out.println(get(1));
    }
    public static int get(int i){
        if(i==10){
            return 1;
        }
      return (get(i+1)+1)*2;

    }
}

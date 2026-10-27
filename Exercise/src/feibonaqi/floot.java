package feibonaqi;

public class floot {
    public static void main(String[] args) {
        System.out.println(get(20));
    }
    public static int get(int i){
        if(i==1){
            return 1;
        }else if(i==2){
            return 2;
        }
return get(i-2)+get(i-1);
    }
}

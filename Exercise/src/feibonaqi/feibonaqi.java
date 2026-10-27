package feibonaqi;

public class feibonaqi {
    public static void main(String[] args) {


        System.out.println(get(3));
    }
    public static int get(int month){
        if(month==1||month ==2){
            return 1;

        }
        return get(month-1)+get(month-2);

    }
}

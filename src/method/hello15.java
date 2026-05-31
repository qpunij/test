package method;

import java.util.Random;

public class hello15 {
    public static void main(String[] args) {


        char[] cahe = new char[52];
        for (int i = 0; i < cahe.length; i++) {
if(i<26){
    cahe[i] = (char) (97+i);
}
else {
    cahe[i] = (char) (65+i-26);
}
        }
        Random sc = new Random();
        String result =  "";
        for(int i=0;i<4;i++){
            result = result + cahe[sc.nextInt(53)];
        }
        result = result+sc.nextInt(10);
        System.out.println(result);
    }
}

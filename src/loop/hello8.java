package loop;

public class hello8 {
    public static  void main(String[] args) {
 for(int i = 1;i<=4;i++){
     for(int j = 0;j<=4-i;j++){
         System.out.print("  ");
     }
     for(int k = 1;k<=2*i-1;k++){
         System.out.print("*");
         System.out.print(" ");
     }

     System.out.println();
 }
 for(int j = 1;j<=3;j++) {
     for (int k = 0; k <= (j*2-1)+2; k++) {
         System.out.print(" ");
     }
     for (int i = 1; i <= 6-(j*2-1); i++) {
         System.out.print("*");
         System.out.print(" ");
     }
     System.out.println();
 }
 for(int j = 1;j<=9;j++){
     for(int k = 1;k<=j;k++){
         System.out.print(k+"*"+j+"="+(k*j)+"\t");
     }
     System.out.println();
 }
    }


}

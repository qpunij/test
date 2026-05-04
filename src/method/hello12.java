package method;

public class hello12 {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};
        printArray(arr);
        printMutableArray();
        double len1 = 10.2;
        double width1 = 20.3;
        double len2 = 30.4;
        double width2 = 40.5;
        double area1 = area(len1,width1);
        double area2 = area(len2,width2);
        if(area2>area1){
            System.out.println("area2 is bigger");
        }
        else {
            System.out.println("area1 is bigger");

        }
        if(area2==area1){
            System.out.println("area1 and area2 are equal");

        }
    }
    public static void printArray(int[] arr){
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                System.out.print(arr[i]);
            }
            else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println("]");
        System.out.println();
    }
   public static void printMutableArray(){
        for(int i=1;i<10;i++){
            for(int j=1;j<i;j++){
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }
   }
   public static double area(double len,double width){
        return len*width;
   }
}
//java的同名方法当中，会优先调用实参跟形参一一对应的方法，没有时，会进行隐式转换，范围小的转换成大的，但是int，double跟double，int,只能用一个
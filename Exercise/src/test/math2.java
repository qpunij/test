package test;

public class math2 {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            int ge = i % 10;         // 个位
            int shi = i / 10 % 10;   // 十位
            int bai = i / 100;       // 百位
            double d = Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3);
            // 判断立方和是否等于原数
            if (d == i) {
                System.out.println(i + " = " + bai + "³ + " + shi + "³ + " + ge + "³");
            }
        }
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(Runtime.getRuntime().maxMemory());
    }
}

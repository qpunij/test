package test;

public class math {
    public static void main(String[] args) {
        System.out.println("1001 是否为质数: " + zs(1001));
        System.out.println("1009 是否为质数: " + zs(1009));
    }
    public static boolean zs(int a) {
        // 小于等于1的数不是质数
        if (a <= 1) {
            return false;
        }
        double d = Math.sqrt(a);
        int count = 0;
        // 必须用 <= 才能覆盖到平方根恰好是因子的情况（如 49 = 7×7）
        for (int i = 2; i <= d; i++) {
            if (a % i == 0) {
                System.out.println(count);
                return false;
            }
            count++;
        }
        System.out.println(count);
        return true;
    }
}

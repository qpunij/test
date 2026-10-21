package test;

public class practice {
    public static void main(String[] args) {
        System.out.println(Math.abs(-13.01));
        // 向上取整，返回大于等于参数的最小 double 整数
        // 例: Math.ceil(4.1) → 5.0
        Math.ceil(4.1);

        // 向下取整，返回小于等于参数的最大 double 整数
        // 例: Math.floor(4.9) → 4.0
        Math.floor(4.9);

        // 四舍五入，返回最接近参数的 long 整数
        // 例: Math.round(4.5) → 5
        Math.round(4.5);

        // 返回两个数中的较大值
        // 例: Math.max(3, 7) → 7
        Math.max(3, 7);

        // 返回两个数中的较小值
        // 例: Math.min(3, 7) → 3
        Math.min(3, 7);

        // 返回 a 的 b 次幂
        // 例: Math.pow(2, 3) → 8.0
        Math.pow(2, 3);

        // 返回平方根
        // 例: Math.sqrt(9.0) → 3.0
        Math.sqrt(9.0);

        // 返回立方根
        // 例: Math.cbrt(27.0) → 3.0
        Math.cbrt(27.0);

        // 返回 [0.0, 1.0) 之间的随机 double 数
        // 例: Math.random() → 0.734...
        Math.random();

    }
}

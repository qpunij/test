package method;

import java.util.Scanner;




import java.util.Scanner;

public class hello133 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入重量单位kg：");
        double weight = sc.nextDouble();

        // 重量向上取整
        int roundedWeight = (int) Math.ceil(weight);//math.ceil()方法返回大于或等于一个给定数字的最小整数
        System.out.println("不足1kg按1kg计算，您的总重为：" + roundedWeight + "kg");

        // 计算邮费（单位：角）
        int postageInJiao = calculatePostage(roundedWeight);
        // 转换为元
        double postageInYuan = postageInJiao / 10.0;
        System.out.println("您需要支付的邮费：" + postageInYuan + "元");
    }

    public static int calculatePostage(int weight) {
        double postage;

        if (weight <= 1) {
            postage = 10.0;
        } else if (weight <= 5) {
            postage = (weight - 1) * 2 + 10;
        } else {
            postage = (weight - 5) * 1.5 + 18;
        }

        // 将邮费转换为角（整数）
        return (int)(postage * 10);
    }
}
//方法在jvm的栈里面执行，从上到下执行，调用进栈，用完出栈;ctrl+alt+M 快速抽取方法
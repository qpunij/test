package inputo_ouput_math;

import java.util.Scanner;

public class hello1 {
    public static void main(String[] args) {
        System.out.println(

        );
//输出恐龙信息:年龄、性别男、身高189、体重89kg、颜色蓝色;
        //输出恐龙名字
        Scanner s = new Scanner(System.in);
        int b = s.nextInt();
        int hours = b / 3600;
        int minutes = b % 3600 / 60;
        int seconds = b % 3600 % 60;
        System.out.println(hours + "小时" + minutes + "分钟" + seconds+"秒");
    }
}

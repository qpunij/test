package util;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil(){}
    public static int getage(ArrayList<Student>List){
        //定义参照物
        int max = List.get(0).getAge();
        for (int i = 0; i < List.size(); i++) {
      int s=      List.get(i).getAge();
            if (s>max){
                max = s;
            }

        }
        return max;

    }
}

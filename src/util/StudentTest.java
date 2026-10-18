package util;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> List = new ArrayList<>();
        Student st1 = new Student("zahnsgan","nan",16);
        Student st2 = new Student("zahnsn","nan",75);
        Student st3 = new Student("zahnn","nan",65);
        List.add(st1);
        List.add(st2);
        List.add(st3);
        int max =  StudentUtil.getage(List);
        System.out.println(max);
    }
}

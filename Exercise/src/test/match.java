package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class match {
    public static void main(String[] args) {
      String regest = "\\w{4,16}";
      String regset1 = "[1-9]\\d{16}(\\d|x|X)";
      String s = "51152420as060724197x";
        System.out.println(s.matches(regset1));
            String sfz = "[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])\\d{3}[\\dxX]";
        System.out.println(s.matches(sfz));
        String regex = "\\d{1,10}";
        Pattern p   = Pattern.compile(regex);
       Matcher m =  p.matcher(s);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}

package test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Locadate {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2006,7,24,0,0,0);
        LocalDateTime today = LocalDateTime.now();
        Duration duration = Duration.between(localDateTime,today);
       long l =  duration.toDays();
        System.out.println(l);
        System.out.println("相差多少月份"+ ChronoUnit.MONTHS.between(localDateTime,today));
    }
}

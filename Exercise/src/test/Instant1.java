package test;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class Instant1 {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);
        Instant instant1 = Instant.ofEpochMilli(0L);
        System.out.println(instant1);
        Instant instant2 = Instant.ofEpochMilli(1000L);
        System.out.println(instant1.isBefore(instant2));
        System.out.println(instant2);
      Instant instant3 =   instant2.minusSeconds(1L);
        System.out.println(instant3);
        Set<String> zoneId = ZoneId.getAvailableZoneIds();
        System.out.println(zoneId);
        ZoneId zoneId1 = ZoneId.of("Asia/Shanghai");

        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant2,zoneId1);
        System.out.println(zonedDateTime);
    }
}

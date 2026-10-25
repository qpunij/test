package test;

import java.time.ZoneId;

public class Zoneid {
    public static void main(String[] args) {
        ZoneId zoneid = ZoneId.systemDefault();
        System.out.println(zoneid);
        ZoneId zoneId1 = ZoneId.of("");
    }
}

package src.basic.day20;

import java.util.TimeZone;

public class PrintTimeZoneID {
    public static void main(String[] args) {
        String[] availableIDs = TimeZone.getAvailableIDs();
        // 시간대 ID 를 모두 출력
        for (String id : availableIDs) {
            System.out.println(id);
        }
    }
}

package src.basic.day20;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date now = new Date();

        // 현재 날짜를 문자열로 출력
        String strNow1 = now.toString();
        System.out.println(strNow1);

        // SimpleDateFormat 클래스를 이용하여 현재 날짜를 원하는 형식의 문자열로 출력
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        String strNow2 = sdf.format(now);
        System.out.println(strNow2);
    }
}

package src.day8;

import java.util.Calendar;

public class WeekExample {
    public static void main(String[] args) {
        Week today = null;

        Calendar calendar = Calendar.getInstance(); // 컴퓨터 날짜 및 시간 정보를 가진 객체
        int week = calendar.get(Calendar.DAY_OF_WEEK); // 오늘의 요일 얻기, 일(1) ~ 토(7)

        switch (week) {
            case 1:
                today = Week.SUNDAY;
                break;
            case 2:
                today = Week.MONDAY;
                break;
            case 3:
                today = Week.TUESDAY;
                break;
            case 4:
                today = Week.WEDNESDAY;
                break;
            case 5:
                today = Week.THURSDAY;
                break;
            case 6:
                today = Week.FRIDAY;
                break;
            case 7:
                today = Week.SATURDAY;
                break;
        }

        if (today == Week.THURSDAY) {
            System.out.println("목요일에는 자바를 학습합니다");
        } else {
            System.out.println("열심히 공부를 합니다");
        }

    }
}

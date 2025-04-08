package src.day6;

public class SubStringExample {
    public static void main(String[] args) {
        /*
        문자열에서 특정 위치의 문자열을 잘라내어 가져올 경우 substring() 메소드를 사용함
        .substring(int 시작인덱스) 이 경우 시작인덱스부터 끝까지 잘라냄
        .substring(int 시작인덱스, int 종료인덱스) 이 경우 시작인덱스 부터 종료인덱스 까지 잘라냄
         */
        String ssn = "880815-1234567";

        String firstNum = ssn.substring(0, 6);
        System.out.println(firstNum);

        String secondNum = ssn.substring(7);
        System.out.println(secondNum);
    }
}

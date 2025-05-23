package src.basic.day6;

public class SplitExample {
    public static void main(String[] args) {
        /*
        문자열의 일부분을 분리해서 얻고 싶을 경우 split() 메소드를 사용
        .split(분리할 기준이 될 문자열)
        또는
        .split(정규표현식, 제한할 인덱스 수)
        주의: split() 메소드의 반환형은 String[] 타입이다
         */
        String board = "1,자바 학습,참조 타입 String 을 학습합니다.,김철수";

        String[] tokens = board.split(",");
        System.out.println("번호: " + tokens[0]);
        System.out.println("제목: " + tokens[1]);
        System.out.println("내용: " + tokens[2]);
        System.out.println("성명: " + tokens[3]);

    }
}

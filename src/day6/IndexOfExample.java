package src.day6;

public class IndexOfExample {
    public static void main(String[] args) {
        /*
        특정 문자열의 인덱스(시작지점)를 얻고자 할 경우 indexOf() 메소드를 사용함
        .indexOf(문자열값) 반환형은 int 타입
         */
        String subject = "자바 프로그래밍";

        int location = subject.indexOf("프로그래밍");
        System.out.println(location); // 출력 3

        /*
        만약 문자열이 포함되있지 않는 경우 indexOf() 는 -1 을 리턴함
         */
        int wrongIndex = subject.indexOf("JAVA");
        System.out.println(wrongIndex); // 출력 -1

        /*
        만약 단순히 문자열이 포함되있는지만 원할 경우 contains() 메소드를 사용
        contains() 메소드는 문자열이 포함될 경우 true, 미포함일 경우 false 를 반환함
         */
        boolean result = subject.contains("JAVA");
        System.out.println(result); // false
    }
}

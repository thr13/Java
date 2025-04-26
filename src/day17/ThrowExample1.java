package src.day17;

/*
사용자 정의 예외
일반 예외 객체는 Exception 클래스
실행 예외는 RuntimeException 의 자식클래스로 선언한다
 */
public class ThrowExample1 {
    public static void main(String[] args) {
        try {
            findClass(); // 메서드 호출
        } catch (ClassNotFoundException e) {
            // 호출한 곳 (즉, 위의 try 블록 에서 발생한 예외를 catch)
            System.out.println("예외처리: " + e.toString());
        }
    }

    public static void findClass() throws ClassNotFoundException {
        Class.forName("java.lang.String2");
    }
}

package src.basic.day17;

// 사용자 정의 예외 - 컴파일러가 체크하지 않는 실행예외는 RuntimeException 의 자식 클래스, 일반예외는 Exception 의 자식 클래스로 구현
public class InsufficientException extends RuntimeException {
    public InsufficientException() {
        // 기본생성자
    }

    public InsufficientException(String message) {
        // 예외 메세지를 담는 생성자
        super(message);
    }
}

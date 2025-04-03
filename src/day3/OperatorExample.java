package src.day3;

public class OperatorExample {
    public static void main(String[] args) {
        // +, - 연산식 사용 주의
        byte byteValue = 100;
        /*
        아래는 컴파일 에러가 발생함 왜냐하면 정수 타입(byte, short, int) 연산의 결과는 int 타입이기 떄문
        byte result = -byteValue;
        */
        int result = -byteValue;
        System.out.println("result = " + result);

        // 전위 연산자: 변수를 먼저 증가시킨 후에 값을 반환함, 연산이 수행될때 이미 값이 증가된 상태
        int prefix = 1;
        int resultPrefix = ++prefix; // 2 출력
        System.out.println("resultPrefix = " + resultPrefix);

        // 후위 연산자: 현재 값을 먼저 반환한 후 증가 연산이 수행됨, 연산이 끝난 뒤 값이 증가함
        int postfix = 1;
        int resultPostfix = postfix++; // 1 출력
        System.out.println("resultPostfix = " + resultPostfix);
    }
}

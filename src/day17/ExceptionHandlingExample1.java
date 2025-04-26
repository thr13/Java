package src.day17;

public class ExceptionHandlingExample1 {

    // 입력받은 문자열 길이를 출력하는 메소드: 입력받은 매개값 data 가 null 일 경우 NullPointerException 이 발생함
    public static void printLength(String data) {
        try {
            int result = data.length(); // 오류 발생 지점
            System.out.println("문자 수: " + result);
        } catch (NullPointerException e) {
            //System.out.println(e.getMessage());
            /*
            Cannot invoke "String.length()" because "data" is null
            예외가 발생한 "이유" 만 리턴됨
             */

            //System.out.println(e.toString());
            /*
            java.lang.NullPointerException: Cannot invoke "String.length()" because "data" is null
            예외가 발생한 "이유" 와 "에외의 종류(타입)" 도 리턴됨
             */

            //e.printStackTrace();
            /*
            예외객체에는 예외타입, 발생원인 메세지 뿐만 아니라 예외가 발생하기까지의 메서드 호출 스택 정보가 담겨있다
            그리고 printStackTrace() 는 이 스택 정보를 읽어서 콘솔에 출력하는 메서드 이다
            스택 정보이므로 예외가 발생하기까지 호출되었던 메서드들의 목록이 시간 역순으로 출력된다
             */
        } finally {
            System.out.println("[마무리 실행]");
        }
    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null); // NullPointerException 발생
        System.out.println("[프로그램 종료]");
    }
}

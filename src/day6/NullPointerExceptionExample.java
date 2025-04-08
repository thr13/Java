package src.day6;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        /*
        참조 타입 변수는 아직 번지를 저장하고 있지 않다는 뜻으로 null 값을 가질 수 있다.
        null 도 초기값으로 사용할 수 있기 때문에 null 로 초기화된 참조 변수는 Stack 영역에 생성된다.
        null 을 가진 참조 타입 객체를 사용하는 코드들은 NullPointerException 에 조심해야한다
         */
        int[] intArray = null;
        //intArray[0] = 10; // NullPointerException 발생

        String str = null;
        //System.out.println("총 문자 수: " + str.length() ); // NullPointerException 발생
    }
}

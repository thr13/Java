package src.basic.day19;

public class BoxingUnBoxingExample {
    public static void main(String[] args) {
        // Boxing (Primitive -> Wrapper)
        Integer obj = 100;
        System.out.println("value: " + obj.intValue()); // intValue() 메소드는 포장객체인 Integer 객체 내부의 int 값을 반환한다

        // Unboxing (Wrapper -> Primitive)
        int value = obj;
        System.out.println("value: " + value);

        // 연산시 Unboxing
        int result = obj + 100;
        System.out.println("result: " + result);
    }
}

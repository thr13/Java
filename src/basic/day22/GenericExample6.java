package src.basic.day22;

/*
제한된 타입 파라미터:
public <타입파라미터 extends 상위타입> 리턴타입 메소드명(매개변수) {}

모든 타입으로 대체할 수 없고 특정 타입과 자식 또는 구현 관계에 있는 타입만 대체할 수 있는 타입 파라미터를 제한된 타입 파라미터(bounded type parameter) 라고 한다
상위타입은 클래스 뿐만 아니라 인터페이스도 가능(딴, implements 를 사용하지않는다)

타입 파라미터로 제한할 경우 Object 메소드 뿐만 아니라 제한된 타입이 가지고 있는 메소드도 사용 가능하다
 */
public class GenericExample6 {
    // 제한된 타입 파라미터(Number 타입으로 제한된 타입파라미터)를 가지는 제네릭 메소드
    public static <T extends Number> boolean compare(T t1, T t2) {
        // 타입파라미터 T 출력(문자열)
        System.out.println("compare(" + t1.getClass().getSimpleName() + ", " + t2.getClass().getSimpleName() + ")");

        // Number 타입의 메소드 호출
        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();

        return (v1 == v2);
    }

    public static void main(String[] args) {
        // 제네릭 메소드 호출 - 타입 파라미터 T 를 Integer 타입으로 대체
        boolean result1 = compare(10, 20);
        System.out.println(result1);
        System.out.println();

        // 제네릭 메소드 호출 - 타입 파라미터 T 를 Double 타입으로 대체
        boolean result2 = compare(4.5, 4.5);
        System.out.println(result2);
    }
}

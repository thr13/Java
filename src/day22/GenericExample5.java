package src.day22;

public class GenericExample5 {
    /*
    제네릭메소드:
    접근제어자 <타입파라미터> 클래스명<타입파라미터> 메소드명(타입파라미터 매개변수명){}
     */
    public static <T> BoxMethod<T> boxing(T t) {
        BoxMethod<T> box = new BoxMethod<>();
        box.set(t);
        return box;
    }

    public static void main(String[] args) {
        /*
        타입파라미터 T 가 Integer 로 대체되므로 반환형이 BoxMethod<Integer> 타입이 되고 매개변수 타입도 Integer 로 대체된다
         */
        BoxMethod<Integer> box1 = boxing(100);
        int intValue = box1.get();
        System.out.println(intValue);

        /*
        타입파라미터 T 가 String 로 대체되므로 반환형이 BoxMethod<String> 타입이 되고 매개변수 타입도 String 로 대체된다
         */
        BoxMethod<String> box2 = boxing("홍길동");
        String strValue = box2.get();
        System.out.println(strValue);
    }
}

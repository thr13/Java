package src.day22;

// 타입 파라미터 T - 기본타입을 제외한 대체 타입인 경우 해당 타입으로 변환 가능
public class Box<T> {
    public T content; // 반환형은 제네릭 타입인 필드

    /*
    타입 파라미터는 기본적으로 Object 타입으로 간주된다
    그러므로 Object 타입이 가지고 있는 메소드를 호출할 수 있다(여기서는 .equals() 메소드를 의미)
    + 클래스는 외부에서 자신의 참조를 전달 할 수 있다
     */
    public boolean compare(Box<T> other) {
       return content.equals(other.content);
    }
}

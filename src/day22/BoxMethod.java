package src.day22;

/*
제네릭 메소드는 타입 파라미터를 가지고 있는 메소드르 의미함
타입 파라미터가 메소드 선언부에 정의된다는 점에서 제네릭 타입과 차이가 있다

 */
public class BoxMethod<T> {
    private T t;

    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }
}
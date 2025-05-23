package src.basic.day22;

/*
제네릭 타입: 아직 결정되지 않은 타입을 파라미터(매개변수)로 가지는 클래스 또는 인터페이스를 의미한다
제네릭타입은 클래스 이름 뒤에 <> 꺽쇠 기호가 붙고 쉼표(,) 로 꺽쇠 기호 사이에 타입 파라미터들을 넣을 수 있다
일반적으로 타입 파라미터는 대문자 알파벳 한 글자로 표현한다 (만약 타입파라미터를 지정안할 경우 Object 타입으로 암묵적으로 사용된다)
 */
public class Product<K, M>{
    private K kind; // 제네릭 타입에서 선언된 것들 중 일부 파라미터를 가져다 사용할 수 있다
    private M model;

    // 제네릭 타입은 필드 뿐만 아니라 메소드의 반환형으로도 사용할 수 있다
    public K getKind() {
        return kind;
    }
    // Setter 를 이용해서 외부에서 타입을 결정할 수 있다
    public void setKind(K kind) {
        this.kind = kind;
    }

    public M getModel() {
        return model;
    }
    public void setModel(M model) {
        this.model = model;
    }
}

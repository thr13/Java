package src.basic.day22;

// 타입파라미터 T
public class Applicant<T> {
    // 필드
    public T kind;

    // 생성자
    public Applicant(T kind) {
        this.kind = kind;
    }
}

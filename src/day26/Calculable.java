package src.day26;

/*
@FunctionalInterface 는 컴파일 과정에서 추상 메소드가 1개인지 검사하는 어노테이션
 */
@FunctionalInterface
public interface Calculable {
    void calculate(int x, int y); // 추상 메소드 1개 - 함수형 인터페이스
}
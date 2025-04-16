package src.day12;

/*
봉인된 클래스를 상속받는 자식클래스 (final)
final 클래스는 더 이상 상속이 불가능한 클래스 임을 나타냄
 */
public final class Employee extends SealedPerson {

    @Override
    public void work() {
        System.out.println("제품을 생산합니다");
    }
}

package src.basic.day12;

/*
봉인된 클래스를 상속받는 자식클래스 (non-sealed)
non-sealed 는 클래스의 봉인을 해제 시키고 추가로 자식 클래스를 만들 수 있도록 변경함 (상속가능)
 */
public non-sealed class Manager extends SealedPerson {

    @Override
    public void work() {
        System.out.println("생산 관리를 합니다");
    }
}

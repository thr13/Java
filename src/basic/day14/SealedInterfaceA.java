package src.basic.day14;

/*
봉인된 인터페이스 - 봉인된 상속과 비슷하게 인터페이스도 sealed ~ permits 을 이용해서 자식 인터페이스 생성을 제한할 수 있다
봉인된 인터페이스를 상속받는 쪽은 non-sealed 키워드로 봉인을 해제하거나 다시 sealed 키워드를 사용해서 또 다른 봉인 인터페이스로 선언해야한다
 */
public sealed interface SealedInterfaceA permits SealedInterfaceB{
    void methodA();
}

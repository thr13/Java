package src.day14;

/*
인터페이스가 봉인해제 되었으므로 (SealedInterfaceB) 상속이 가능하다
 */
public interface SealedInterfaceC extends SealedInterfaceB {
    void methodC();
}

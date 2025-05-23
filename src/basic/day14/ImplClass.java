package src.basic.day14;

// 최종적으로 상속받은 SealedInterfaceC 를 구현하는 클래스
public class ImplClass implements SealedInterfaceC {
    @Override
    public void methodA() {
        System.out.println("methodA() 실행");
    }

    @Override
    public void methodB() {
        System.out.println("methodB() 실행");
    }

    @Override
    public void methodC() {
        System.out.println("methodC() 실행");
    }
}

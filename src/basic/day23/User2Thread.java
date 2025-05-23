package src.basic.day23;

// Thread 를 상속받는 작업메소드2
public class User2Thread extends Thread {
    private Calculator calculator;

    public User2Thread() {
        setName("User2Thread"); // 작업스레드 이름 변경
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator; // 외부에서 공융 객체 Calculator 를 매개값으로 전달받아서 필드에 저장
    }

    @Override
    public void run() {
        calculator.setMemory2(100); // 동기화 블록을 가진 메소드 호출
    }
}

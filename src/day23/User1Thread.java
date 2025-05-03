package src.day23;

// 스레드를 상속받는 작업스레드1
public class User1Thread extends Thread {
    private Calculator calculator;

    public User1Thread() {
        setName("User1Thread"); // 작업스레드 이름 변경
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator; // 외부에서 공용 객체 Calculator 를 매개값으로 전달받아서 필드에 저장
    }

    @Override
    public void run() {
        calculator.setMemory1(100); // 동기화 메소드 호출
    }
}

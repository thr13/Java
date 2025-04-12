package src.day10;

public class StaticMemberExample {

    public static void main(String[] args) {
        /*
        JAVA 는 클래스 로더(loader) 를 이용해서 클래스를 메소드 영역에 저장하고 사용함 -> 정적멤버(Static Member) 는 메소드 영역의 클래스에 고정적으로 위치한 멤버를 의미한다
        그러므로 정적 멤버는 객체를 생성할 필요 없이 클래스를 통해 바로 사용이 가능함 (클래스가 메모리에 로딩되면 바로 사용가능함)
         */
        double result1 = 10 * 10 * PICalculator.pi;

        System.out.println("반지름이 10 인 원의 넓이: " + result1);

    }
}

class PICalculator {
    String color; // 인스턴스 필드

    static double pi = 3.14; // 객체마다 따로 가지고 있을 필요성이 없는 필드는 정적 필드로 선언하는게 좋음

    // 인스턴스 메소드: 인스턴스 필드인 color 를 변경하므로 인스턴스 메서드로 선언
    void setColor(String color) {
        this.color = color;
    }

    // 정적 메소드: 외부에서 준 매개값 만 가지고 처리하므로 정적 메소드로 선언하는게 좋음
    static int plus(int x, int y) {
        return x + y;
    }
    static int minus(int x, int y) {
        return x - y;
    }
}



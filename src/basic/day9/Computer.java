package src.basic.day9;

public class Computer {
    /*
    일반적으로 메소드를 호출할때 매개변수 갯수를 맞춰야한다
    그러나 만약 메소드가 가변길이 매개변수를 가지고 있다면, 매개변수 갯수와 상관없이 메소드에 매개변수 값을 넣어줄 수 있다
    사용 예) 매개변수 타입과 이름 사이에 ... 을 추가
    int sum(int ... values) {
    }
    이떄 매개변수는 자동으로 배열로 변환된다 그러므로 메소드 호출시 가변길이 매개변수 자리에 배열을 넣어도 된다
     */
    int sum(int ... values) {
        int sum = 0;

        for (int i=0; i<values.length; i++) {
            sum += values[i];
        }

        return sum;
    }
}

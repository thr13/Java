package src.day9;

public class ComputerExample {
    public static void main(String[] args) {
        Computer computer = new Computer();

        // 가변길이 메소드 호출
        int result1 = computer.sum(1,2,3,4,5);
        System.out.println("result1: " + result1);

        // 가변길이 메소드의 매개변수 자리에 배열을 넣는 경우1
        int[] values1 = {1, 2, 3, 4, 5};
        int result2 = computer.sum(values1);
        System.out.println("result2: " + result2);

        // 가변길이 메소드의 매개변수 자리에 배열을 넣는 경우2
        int result3 = computer.sum(new int[] {1, 2, 3, 4, 5});
        System.out.println("result3: " + result3);
    }
}

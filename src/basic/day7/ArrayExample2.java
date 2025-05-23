package src.basic.day7;

public class ArrayExample2 {
    public static void main(String[] args) {
        /*
        주의: 배열 변수를 미리 선언한 후에는 값 목록을 변수에 대입할 수 없다
        타입[] 변수;
        변수 = { 값0, 값1, ...}; 이런식으로 입력할 경우 컴파일 에러 발생

        배열 변수를 선언한 시점과 값 목록이 대입되는 시점이 다르면
        변수 = new 반환타입[] {값0, 값1, ...}; 이런식으로 사용가능하다

        예를 들어 String 타입 배열인 경우
        String[] name = null;
        names = new String[] {"김자바, "이클립", "인텔리"}; 이런식으로 사용가능

        메소드 호출시 매개변수에 배열을 사용할 경우도 동일하다
        printItem(new int[] {95, 85, 90});
         */
        int[] scores;
        scores = new int[] {83, 90, 87};

        int sum1 = 0;
        for(int i=0; i<scores.length; i++) {
            sum1 += scores[i];
        }
        System.out.println("총합: " + sum1);

        printItem(new int[] {83, 90, 87});
    }

    public static void printItem(int[] scores) {
        for(int i=0; i<scores.length; i++) {
            System.out.println("scores[" + i + "]: " + scores[i]);
        }
    }
}

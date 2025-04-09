package src.day7;

public class ArrayExample1 {
    public static void main(String[] args) {
        /*
        배열은 연속된 공간에 값을 나열시키고 각 값에 인덱스를 부여한다
        또한, 배열은 같은 타입의 값만 관리하고 일반적으로 배열의 길이는 늘리거나 줄일 수 없다(배열은 생성과 동시에 길이가 결정됨)
        배열 변수는 참조 변수이므로 배열은 객체이다 즉, 힙 영역에 생성되고 배열 변수는 힙 영역의 배열 주소를 저장한다 (배열 변수도 null 로 초기화가 가능함)
        반환타입[] 변수이름; 또는 반환타입 변수이름[]; 으로 선언할 수 있다
         */
        String[] season = { "Spring", "Summer", "Fall", "Winter" };

        for (int i=0; i<season.length; i++) {
            System.out.println("계절목록: " + season[i]);
        }

        season[1] = "여름"; // 1번 인덱스 항목의 값 변경
        System.out.println(season[1]);

    }
}

package src.day7;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        /*
        힙에는 배열변수[인덱스] 의 번지가 저장되고 스택에는 배열변수가 저장된다 또한, 스택의 배열변수는 힙에 저장된 번지를 참조한다
        그러므로 다차원 배열은 1차원 배열을 서로 연결한 것과 같다
        변수[1차원인덱스][2차원인덱스][...][N차원인덱스];
         */
        int[][] scores = {
                {80, 90, 96},
                {76, 88}
        };

        System.out.println("1차원 배열 길이: " + scores.length); // 1차원 배열 길이는 행의 수
        System.out.println("2차원 배열 길이: " + scores[0].length); // 2차원 배열부터는 열의 수
        System.out.println("2차원 배열 길이: " + scores[1].length); // 2차원 배열부터는 열의 수

        /*
        new 연산자로 다차원 배열 생성시, 선언시에 대괄호를 차원수만큼 붙이고 new 타입 뒤에도 동일하게 작성하면 된다
        반환타입[][] 변수이름 = new  반환타입[1차원인덱스][2차원인덱스];
         */
        int[][] newScores = new int[2][]; // 2차원 인덱스를 나중에 추가 가능
        newScores[0] = new int[3];
        newScores[1] = new int[2];

    }
}

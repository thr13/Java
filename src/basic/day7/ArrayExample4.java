package src.basic.day7;

public class ArrayExample4 {
    public static void main(String[] args) {
        /*
        배열변수.length 사용시 배열의 길이를 int 타입으로 반환함
         */
        int[] scores = {84, 90, 96};
        System.out.println("배열길이: " + scores.length);

        /*
        만약 배열의 길이를 벗어날 경우 ArrayIndexOutOfBoundsException 발생
         */
        for(int i = 0; i<scores.length; i++){
            System.out.print("값: " +scores[i+1] + ", ");
        }
    }
}

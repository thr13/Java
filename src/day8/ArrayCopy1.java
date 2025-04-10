package src.day8;

public class ArrayCopy1 {
    public static void main(String[] args) {
        int[] oldIntArray = { 1, 2, 3 };
        int[] newIntArray = new int[5];

        for(int i=0; i<oldIntArray.length; i++){
            newIntArray[i] = oldIntArray[i]; // 배열 항목을 하나씩 읽고 저장함
        }

        for(int i=0; i<newIntArray.length; i++){
            System.out.println(newIntArray[i]); // 복사한 배열 출력 (남은 공간들은 기본값으로 초기화되어있음)
        }

    }
}

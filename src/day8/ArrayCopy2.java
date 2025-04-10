package src.day8;

public class ArrayCopy2 {
    public static void main(String[] args) {
        /*
        배열복사에는 System 의 arraycopy() 메소드를 이용할 수 있다
        System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
        System.arraycopy(원본배열, 원본배열의 복사를 시작할 인덱스, 새 배열, 새 배열의 붙여넣기 시작할 인덱스, 복사 항목수);
         */
        String[] oldStrArray = { "java", "array", "copy" };
        String[] newStrArray = new String[5];

        // oldStrArray 의 모든 항목을 newStrArray 에 복사
        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

        for(int i=0; i<newStrArray.length; i++){
            System.out.println(newStrArray[i] + ", ");
        }
    }
}

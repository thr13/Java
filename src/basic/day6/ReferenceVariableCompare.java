package src.basic.day6;

public class ReferenceVariableCompare {
    public static void main(String[] args) {
        int[] arr1;
        int[] arr2;
        int[] arr3;

        arr1 = new int[] { 1, 2, 3};
        arr2 = new int[] { 1, 2, 3};
        arr3 = arr2; // 배열 변수 arr2 의 ㄱ밧을 배열 변수 arr3 에 대입

        // 각각의 배열 변수가 같은 배열을 참조하는지 검사
        System.out.println(arr1 == arr2); // 결과 false
        System.out.println(arr2 == arr3); // 결과 true
    }
}

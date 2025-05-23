package src.basic.day5;

public class ContinueExample {
    public static void main(String[] args) {
        /*
        continue 문은 반복문에서 사용된다. 실행시 현재 실행중인 반복문의 싫랭문을 건너뛰고 조건식 위치로 이동한다
         */
        for(int i=0; i<=10; i++){
            if(i%2==0){
                continue; // 짝수 인경우 continue
            }
            System.out.print(i+" ");
        }
    }
}

package src.basic.day10;

public class UnreachableExample {

    int plus(int x, int y) {
        int result = x + y;
        return result;
        /*
        반환할 return 문 이후에 실행문이 남아있으면 'Unreachable code' 컴파일 에러 발생함
        왜냐하면 return 문으로 반환된 이후에 실행문은 실행되지 않기 때문
         */
        //System.out.println(result);
    }
}

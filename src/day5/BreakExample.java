package src.day5;

public class BreakExample {
    public static void main(String[] args) {
        /*
        break 는 switch 문과 반복문의 실행을 중지시키는게 사용된다
        중첩된 반복문에서 바깥쪽 반복문까지 종료시키기 위해서는 레이블이름: 반복문 및 break 레이블; 을 사용해야한다
         */
        Outter: for(char upper='A'; upper <= 'Z'; upper++) {
            for(char lower='a'; lower <= 'z'; lower++) {
                System.out.println(upper + "~" + lower);
                if(lower == 'g') {
                    break Outter;
                }
            }
        }
        System.out.println("프로그램 종료");
    }
}

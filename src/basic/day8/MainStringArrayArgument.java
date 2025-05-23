package src.basic.day8;

public class MainStringArrayArgument {
    public static void main(String[] args) {
        /*
        자바에서는 main 함수의 매개변수에 있는 String[] args 를 명령 프롬프트에 할당해서 저장할 수 있다
         */
        if(args.length != 2){
            System.out.println("프로그램의 입력값이 부족합니다");
            System.exit(0); // 프로그램 강제 종료
        }

        // 입력된 데이터 얻기
        String strNum1 = args[0];
        String strNum2 = args[1];

        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);

        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);

    }
}

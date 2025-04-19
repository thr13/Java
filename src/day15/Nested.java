package src.day15;

/*
생성자 또는 메소드 내부에서 선언된 클래스를 로컬 클래스라고 부름
로컬 클래스는 해당 생성자와 메소드가 실행될 동안에만 객체를 생성할 수 있다
로컬 클래스 내부에 정적 필드, 메소드는 JAVA 17 부터 선언이 가능하다
 */
public class Nested {

    public void method1(int arg) { // 매개값은 final int arg
        // 로컬 변수
        int var = 1; // final int var = 1; 과 같음

        // 로컬 클래스 Local
        class Local {
            /*
            로컬 변수(로컬 클래스 내부에서 선언된 변수) 를 사용할 경우 final 특성을 갖게 되므로 값을 읽을 수만 있고 수정할 수 없게 된다 왜냐하면 로컬 클래스 내부에서 값을 변경하기 못하도록 제한하기 때문이다
            JAVA 8 이후부턴 명시적으로 final 키워드를 붙이지 않아도 되지만, 로컬 변수에 final 키워드를 추가해서 명확히 할 수 있따 (JAVA 7 까지는 final 키워드를 반드시 붙여야했다)
             */

            void method2() {
                // 로컬 변수 읽기
                System.out.println("arg: " + arg);
                System.out.println("var: " + var);

                // 로컬 변수 수정 불가능 (final 특성)
                //arg = 2;
                //var = 2;
            }
        }

        Local local = new Local();
        local.method2();

        //로컬 변수 수정 불가
        //arg = 3;
        //var = 3;
    }
}

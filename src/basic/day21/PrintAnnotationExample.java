package src.basic.day21;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
    public static void main(String[] args) throws Exception {
        //  Service.java 클래스에 선언된 메소드를 리플렉션
        Method[] declaredMethods = Service.class.getDeclaredMethods();

        for (Method method : declaredMethods) {
            // 현재 리플렉션의 Method 객체가 나타내는 메서드에 PrintAnnotation 어노테이션이 붙어 있는지 확인하고, 있다면 그 어노테이션 객체를 printAnnotation 변수에 저장
            PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);

            printLine(printAnnotation);

            /*
            리플렉션 객체(printAnnotation)가 나타낸 실제 메서드(Service 클래스의 메서드)를 호출
            (반환타입은 Object 타입, 만약 메서드의 반환형이 void 타입이면 null 반환)
            여기서 new Service() 는 메서드를 호출할 대상 클래스의 객체를 새로 생성하는 것을 의미한다
            만약 메서드가 static 메서드라면 첫 번째 인자로 null 을 전달한다
            */
            method.invoke(new Service());

            printLine(printAnnotation);
        }
    }

    // 값이 할당된 어노테이션을 이용해서 콘솔 출력
    public static void printLine(PrintAnnotation printAnnotation) {
        if(printAnnotation != null) {
            int number = printAnnotation.number();

            for(int i=0; i<number; i++) {
                String value = printAnnotation.value();
                System.out.print(value);
            }
            System.out.println();
        }
    }
}

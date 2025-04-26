package src.day17;

public class ThrowsExample2 {
    // main 에서 예외를 던질경우 최종적으로 JVM 이 처리함
    public static void main(String[] args) throws Exception {
        findClass(); // 호출한 메서드에서 발생한 ClassNotFoundException 예외를 이 main 문에서 처리하거나 새로 던져야한다
    }

    public static void findClass() throws ClassNotFoundException {
        // 이 메서드에서 발생된 ClassNotFoundException 예외는 메서드 호출자 가 처리해야한다
        Class.forName("java.lang.String2");
    }
}

package src.day17;

public class ExceptionHandlingExample4 {
    public static void main(String[] args) {
        String[] array = {"100", "1oo"};

        for (int i = 0; i <= array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "] = " + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                // 인덱스 크기 초과시 발생하는 예외 ArrayIndexOutOfBoundsException
                System.out.println("배열 인덱스가 초과됨: " + e.getMessage());
            } catch (Exception e) {
                // 상위 예외 클래스 Exception
                System.out.println("실행에 문제가 있습니다");
                /*
                예외가 발생하면 catch 블록은 위에서부터 차례대로 검사대상이 되는데, 상위 예외 클래스가 있는 경우 먼저 검사 대상이 되면 하위 예외 클래스가 실행이 안된다
                그러므로 상위 예외 클래스는 아래쪽에 작성해야한다
                 */
            }
        }
    }
}

package src.day17;

public class ExceptionHandlingExample3 {
    public static void main(String[] args) {
        String[] array = {"100", "1oo"};

        for (int i = 0; i <= array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "] = " + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                // 인덱스 크기 초과시 발생하는 예외 ArrayIndexOutOfBoundsException
                System.out.println("배열 인덱스가 초과됨: " + e.getMessage());
            } catch (NumberFormatException e) {
                // 숫자타입이 아닐때 발생하는 예외 NumberFormatException
                System.out.println("숫자로 변환될 수 없음: " + e.getMessage()); // 일반적으로 try 블록에서는 예외가 동시에 여러개가 발생하지않으므로 catch 문은 한번에 하나씩만 실행된다
            }
        }
    }
}

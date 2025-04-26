package src.day17;

public class ExceptionHandlingExample5 {
    public static void main(String[] args) {
        String[] array = {"100", "1oo"};

        for (int i = 0; i <= array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "] = " + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                // 인덱스 크기 초과시 발생하는 예외 ArrayIndexOutOfBoundsException
                System.out.println("배열 인덱스가 초과됨: " + e.getMessage());
            } catch (NullPointerException | NumberFormatException e) {
                // | 을 사용해서 두개 이상의 예외를 하나의 catch 블록으로 동일하게 예외처리
                System.out.println("데이터에 문제가 있음: " + e.getMessage());
            }
        }
        }
    }
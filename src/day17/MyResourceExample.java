package src.day17;

public class MyResourceExample {
    public static void main(String[] args) {
        try (MyResource res = new MyResource("A")) {
            String data = res.read1();
            int value = Integer.parseInt(data);
        } catch (Exception e) {
            System.out.println("예외 처리: " +e.getMessage());
        }

        System.out.println();

        try (MyResource res = new MyResource("A")) {
            String data = res.read2(); // NumberFormatException 발생
            int value = Integer.parseInt(data);
        } catch (Exception e) {
            System.out.println("예외 처리: " +e.getMessage());
        }

        System.out.println();

        MyResource res1 = new MyResource("A");
        MyResource res2 = new MyResource("B");

        // 다중 리소스 사용
        try (
                res1;
                res2
        ) {
            String data1 = res1.read1(); // 리소스 res1 사용
            System.out.println();
            String data2 = res2.read1(); // 리소스 res2 사용
        } catch (Exception e) {
            System.out.println("예외 처리: " + e.getMessage());
        }
    }
}

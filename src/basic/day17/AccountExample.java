package src.basic.day17;

public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();

        // 예금하기
        account.deposit(10000);
        System.out.println("예금액: " + account.getbalance());

        // 출금하기
        try {
            account.withdraw(30000); // 사용자 정의 예외 발생
        } catch (InsufficientException e) {
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}

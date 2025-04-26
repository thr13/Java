package src.day17;

public class Account {
    private long balance;

    public Account() {}

    public long getbalance() {
        return balance;
    }

    public void deposit(int money) {
        balance += money; // int 타입과 long 타입이 연산시 더 큰 타입인 long 타입으로 자동변환
    }

    public void withdraw(int money) throws InsufficientException {
        if (balance < money) {
            throw new InsufficientException("잔고 부족: " + (money - balance) + " 만큼 모자람");
        }
        balance -= money;
    }
}

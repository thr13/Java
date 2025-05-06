package src.day25;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Coin> coinBox = new Stack<>();

        coinBox.push(new Coin(100));
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(500));
        coinBox.push(new Coin(10)); // 스택은 LIFO 구조이므로 마지막에 넣은 객체부터 출력한다

        // 객체가 비어있지 않을때까지 반복
        while(!coinBox.isEmpty()) {
            Coin coin = coinBox.pop(); // 스택의 맨 위 객체를 꺼내옴
            System.out.println("꺼내온 동전: " + coin.getValue() + "원");
        }
    }
}

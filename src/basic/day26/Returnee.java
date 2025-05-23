package src.basic.day26;

public class Returnee {
    public void action(Returnable returnable) {
        double result = returnable.calc(10, 4);
        System.out.println("결과: " + result);
    }
}
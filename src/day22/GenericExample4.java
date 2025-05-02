package src.day22;

public class GenericExample4 {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        box1.content = "100";

        Box<String> box2 = new Box<>();
        box2.content = "100";

        boolean result = box1.compare(box2);
        System.out.println("결과: " + result);
    }
}

package src.basic.day22;

public class GenericExample1 {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        /*
        위 코드는 Box<String> box1 = new Box<String>(); 와 같다
        객체 Box 를 생성할때, 클래스 Box 의 타입 파라미터 T 대신 String 이 들어간다
         */
        box1.content = "안녕하세요"; // 타입파라미터 T 는 곧 String 타입 으로 대체됨
        System.out.println(box1.content);

        String str1 = box1.content;
        System.out.println(str1);

        Box<Integer> box2 = new Box<>();
        /*
        위 코드는 Box<Integer> box2 = new Box<Integer>(); 와 같다
        객체 Box 를 생성할때, 클래스 Box 의 타입 파라미터 T 자리에 Integer 가 대신 들억나다
         */
        box2.content = 100;
        System.out.println(box2.content);
        int value = box2.content;
        System.out.println(value);
    }
}

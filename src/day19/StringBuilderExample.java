package src.day19;

public class StringBuilderExample {
    public static void main(String[] args) {
        // StringBuilder 객체를 메소드 체이닝 패턴 사용
        String data = new StringBuilder()
                .append("DEF")
                .insert(0,"ABC")
                .delete(3, 4)
                .toString();
        System.out.println(data);
    }
}

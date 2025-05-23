package src.basic.day2;

public class StringType {
    public static void main(String[] args) {
        String name = "최수관";
        String hometown = "광주";
        System.out.println("name: " + name);
        System.out.println("hometown: " + hometown);

        String str = "나는 \"자바\"를 배웁니다";
        System.out.println(str);

        str = "번호\t이름\t고향";
        System.out.println(str);

        System.out.print("나는\n");
        System.out.print("자바를\n");
        System.out.print("배웁니다\n");

        System.out.print("캐리지리턴1\r");
        System.out.print("캐리지리턴2\r");

        System.out.println("\" 큰따옴표 출력");
        System.out.println("\' 작은따옴표 출력");
        System.out.println("\\ 역슬래쉬 출력");
        System.out.println("\u0000 16진수 유니코드 출력");

        String textBlock1 = "" + "{\n" + "\t\"id\":\"winter\",\n" + "\t\"name\":\"눈송이\"\n" + "}";
        String textBlock2 = """
                {
                    "id": "winter",
                    "name": "눈송이"
                }
                """;
        System.out.println(textBlock1);
        System.out.println("----");
        System.out.println(textBlock2);
    }
}

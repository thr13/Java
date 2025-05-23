package src.basic.day9;

public class KoreanExample {
    public static void main(String[] args) {
        Korean kor1 = new Korean("박자바", "011225-1234567");

        System.out.println("kor1.nation: " + kor1.nation);
        System.out.println("kor1.name: " + kor1.name);
        System.out.println("kor1.ssn: " + kor1.ssn);

        Korean kor2 = new Korean("김자바", "930525-0654321");

        System.out.println("kor2.nation: " + kor2.nation);
        System.out.println("kor2.name: " + kor2.name);
        System.out.println("kor2.ssn: " + kor2.ssn);
    }
}

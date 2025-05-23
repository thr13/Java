package src.basic.day9;

public class Korean {
    String nation = "대한민국";
    String name;
    String ssn;

    public Korean(String name, String ssn) {
        // this 는 현재 객체를 의미하는 키워드 이다
        this.name = name;
        this.ssn = ssn;
    }
}

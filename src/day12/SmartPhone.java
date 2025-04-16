package src.day12;

public class SmartPhone extends Phone {

    public SmartPhone(String owner) {
        // 추상클래스(부모클래스) 인 Phone 의 생성자 호출
        super(owner);
    }

    void internetSearch() {
        System.out.println("인터넷 검색을 합니다");
    }
}

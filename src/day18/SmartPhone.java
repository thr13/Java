package src.day18;

public class SmartPhone {
    private String company; // 제조사
    private String os; // 운영체제

    public SmartPhone(String company, String os) {
        this.company = company;
        this.os = os;
    }

    // Object 클래스의 toString() 을 오버라이드 해서 제조사와 운영체제의 정보를 결합돈 문자열로 반환함
    @Override
    public String toString() {
        return company + " " + os;
    }
}

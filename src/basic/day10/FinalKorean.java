package src.basic.day10;

/*
final 필드는 한번 초기값을 설정하면 프로그램 실행 도중에 할 수 없다
final 필드에 초기값을 설정하는 방법은 필드 선언시에 초기값 대입 그리고 생성자에서 초기값 대입 2가지 방식이 있다
만약 고정된 값이라면 필드 선언시 초기값을 대입하는게 좋다 하지만 객체 생성시 외부에서 전달된 값으로 초기화할려면 생성자에서 해야한다
 */
public class FinalKorean {
    final String nation = "대한민국"; // 필드 선언시 초기값 대입
    final String ssn;

    String name; // 인스턴스 필드

    public FinalKorean(String name, String ssn) {
        this.name = name;
        this.ssn = ssn; // 객체 생성시 생성자를 통해서 final 변수 초기화
    }

    public static void main(String[] args) {
        FinalKorean k1 = new FinalKorean("김자바", "123456-1234567");

        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);

        /*
        주의: final 변수들은 초기화 된 이후 프로그램 실행 중에 변경할 수 없다
        k1.nation = "USA";
        k1.ssn = "123-12-1234";
         */

        k1.name = "이자바"; // final 변수가 아니라면 프로그램 실행 중에 값 변경가능
    }
}

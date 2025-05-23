package src.basic.day10;

public class SingletonExample {
    public static void main(String[] args) {
        /*
        생성자를 private 로 선언했기 때문에 아래는 컴파일 에러가 발생한다
        Singleton obj = new Singleton();
         */
        Singleton obj1 = Singleton.getInstance(); // 정적메소드를 통해서 객체를 불러와 이를 변수에 대입해서 사용할 수 있다
        Singleton obj2 = Singleton.getInstance();

        if ((obj1 == obj2)) {
            System.out.println("같은 Singleton 객체 입니다");
        } else {
            System.out.println("다른 Singleton 객체 입니다");
        }

    }
}

package src.day11;

public class CatExample {
    public static void main(String[] args) {
        /*
        자동타입변환(Promotion) 은 의미 그대로 자동으로 타입이 변환되는 것을 의미한다
        자식클래스가 부모클래스의 타입을 상속받았으므로 부모와 동일하게 취급될 수 있다
        그래서 자식 클래스 객체를 생성하고 부모 클래스 객체에 대입하면 자동타입변환 이 일어난다
         */
        Cat cat = new Cat();
        Animal animal = cat; // 자동타입변환(Promotion) 발생 - 타입만 다를뿐이지 동일한 자식객체를 참조한다

        System.out.println(cat == animal); // true 반환

    }
}

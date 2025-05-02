package src.day22;

public class GenericExample2 {
    public static void main(String[] args) {
        /*
        제네릭 타입 클래스인 Product<K, M> 에서 타입 파라미터 K 를 클래스 Tv 타입으로, 타입 파라미터 M 을 String 으로 결정한다
         */
        Product<Tv, String> product1 = new Product<>();
        product1.setKind(new Tv()); // 타입 파라미터 K 가 클래스 Tv 타입이므로 매개값으로 Tv 객체를 생성해서 넣는다
        product1.setModel("스마트Tv"); // 타입 파라미터 M 이 String 타입이므로 매개값으로 문자열을 넣는다

        printType(product1.getKind()); // 제네릭 타입 객체를 Object 타입 매개변수로 전달할 경우 타입소거가 발생해 제네릭 타입 정보가 사라지고 암묵적으로 Object 으로 변환된다
        printType(product1.getModel());

        Product<Car, Integer> product2 = new Product<>();
        product2.setKind(new Car());
        product2.setModel(10);

        printType(product2.getKind());
        printType(product2.getModel());
    }

    public static void printType(Object obj) {
        if (obj instanceof Tv) {
            System.out.println("Tv 타입 입니다");
        } else if (obj instanceof Car) {
            System.out.println("Car 타입 입니다");
        } else if (obj instanceof String) {
            System.out.println("String 타입 입니다");
        } else if (obj instanceof Integer) {
            System.out.println("Integer 타입 입니다");
        }
    }
}

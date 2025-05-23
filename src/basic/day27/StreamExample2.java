package src.basic.day27;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample2 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        for (int i=1; i<=5; i++) {
            Product product = new Product(
                    i,
                    "상품"+i,
                    "멋진 회사",
                    (int)(10000*Math.random())
            );
            list.add(product);
        }

        // List 컬렉션으로 부터 Stream<T> 객체 얻기
        Stream<Product> parallelStream = list.parallelStream();
        parallelStream.forEach(p -> System.out.println(p));
        System.out.println();
    }
}

package src.day27;

import java.util.Collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample1 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>(); // List 컬렉션 생성

        // List 컬렉션 값 추가
        for (int i=1; i<=5; i++) {
            Product product = new Product(
                    i,
                    "상품"+i,
                    "멋진 회사",
                    (int)(10000*Math.random())
            );
            list.add(product);
        }

        // List 컬렉션으로부터 Stream<T> 객체 얻기
        Stream<Product> stream1 = list.stream();
        stream1.forEach(p -> System.out.println(p));
        System.out.println();

        Set<Product> set = new HashSet<>(); // Set 컬렉션 생성

        // Set 컬렉션 값 추가
        for (int i=1; i<=5; i++) {
            Product product = new Product(
                    i,
                    "상품"+i,
                    "멋진 회사",
                    (int)(10000*Math.random())
            );
            set.add(product);
        }

        // Set 컬렉션으로부터 Stream<T> 객체 얻기
        Stream<Product> stream2 = set.stream();
        stream2.forEach(p -> System.out.println(p));
        System.out.println();
    }
}

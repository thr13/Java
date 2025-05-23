package src.basic.day25;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit> {
    // Fruit 객체의 필드 price 를 기준으로 정렬
    @Override
    public int compare(Fruit fruit1, Fruit fruit2) {
        if (fruit1.price < fruit2.price) {
            return -1;
        } else if (fruit1.price == fruit2.price) {
            return 0;
        } else
            return 1;
    }
}

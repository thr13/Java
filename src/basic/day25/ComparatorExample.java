package src.basic.day25;

import java.util.TreeSet;

public class ComparatorExample {
    public static void main(String[] args) {
        TreeSet<Fruit> treeSet = new TreeSet<>(new FruitComparator());

        treeSet.add(new Fruit("포도", 3000));
        treeSet.add(new Fruit("수박", 10000));
        treeSet.add(new Fruit("딸기", 6000)); // FruitComparator 를 비교자로 사용해 price 를 기준으로 객체를 정렬시킴

        for(Fruit fruit : treeSet) {
            System.out.println(fruit.name + ":" + fruit.price);
        }
    }
}

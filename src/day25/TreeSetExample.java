package src.day25;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(87);
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(80);

        for (Integer s : scores) {
            System.out.printf(s + " ");
        }
        System.out.println("\n");

        System.out.println("가장 낮은 점수: " + scores.first()); // first() 는 값이 제일 낮은 객체를 리턴한다
        System.out.println("가장 높은 점수: " + scores.last()); // last() 는 값이 제일 높은 객체를 리턴한다
        System.out.println("95점 아래 점수: " + scores.lower(95)); // lower() 는 주어진 객체보다 낮은 값을 가진 객체를 리턴
        System.out.println("95점 위의 점수: " + scores.higher(95)); // higher() 는 주어진 객체보다 높은 값을 가진 객체를 리턴
        System.out.println("95점이거나 바로 아래 점수: " + scores.floor(95)); // floor() 는 주어진 객체와 동등한 객체가 있으면 리턴, 만약 없는 경우 객체보다 낮은 값을 가진 객체를 리턴
        System.out.println("85점이거나 바로 위의 점수: " + scores.ceiling(85)); // ceiling() 는 주어진 객체와 동등한 객체가 있으면 리턴, 만약 없는 경우 객체보다 높은 값을 가진 객체를 리턴
        System.out.println();

        // 내림차순 정렬
        NavigableSet<Integer> descendingScores = scores.descendingSet(); // descendingSet() 메소드는 내림차순으로 정렬된 객체를 NavigableSet<> 타입으로 반환함 (NavigableSet 도 똑같은 java.util 패키지에 존재)
        for(Integer s : descendingScores) {
            System.out.printf(s + " ");
        }
        System.out.println("\n");

        // 85 이하의 범위 검색
        NavigableSet<Integer> rangeSet = scores.tailSet(80, true); // 매개값으로 준 객체보다 높은 값을 가진 객체들을 NavigableSet 으로 리턴한다 만약, 두번쨰 매개변수인 inclusive 값이 true 라면, 동등한 객체도 포함한다
        for(Integer s : rangeSet) {
            System.out.printf(s + " ");
        }
        System.out.println("\n");

        // 80 이상 90 이하 범위 검색
        rangeSet = scores.subSet(80, true, 90, false); // 80 이상 90 이하 값을 가진 객체들을 NavigableSet 타입으로 반환함, fromInclusive 와 toInclusive 의 매개값이 객체를 포함할지 결정함
        for (Integer s : rangeSet) {
            System.out.printf(s + " ");
        }
        System.out.println("\n");

        // Iterator 를 이용하여 내림차순 검색
        Iterator<Integer> iterator = scores.descendingIterator(); // descendingIterator() 메소드는 내림차순으로 정렬된 Iterator 타입을 리턴함
        while (iterator.hasNext()) {
            System.out.printf(iterator.next() + " ");
        }
        System.out.println("\n");

        System.out.println(scores.pollFirst()); // pollFirst() 메소드는 제일 낮은 객체를 꺼내오고 컬렉션에서 제거
        System.out.println(scores.pollLast()); // pollLast() 메소드는 제일 높은 객체를 꺼내오고 컬렉션에서 제거
        System.out.println();

        // 90 이하의 범위 검색
        NavigableSet<Integer> headSet = scores.headSet(90, true); // 매개값으로 준 객체보다 낮은 값을 가진 객체들을 NavigableSet 으로 리턴한다 만약, 두번쨰 매개변수인 inclusive 값이 true 라면, 동등한 객체도 포함한다
        for (Integer s : headSet) {
            System.out.printf(s + " ");
        }

    }
}

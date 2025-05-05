package src.day25;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample3 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Spring");

        // iterator() 메소드로 Iterator 객체 생성
        Iterator<String> iterator = set.iterator();

        // 다음 객체가 없을때까지 반복
        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
            if (element.equals("JSP")){
                iterator.remove(); // 가져온 객체를 컬렉션에서 제거
            }
        }
        System.out.println();
        set.remove("JDBC"); // 컬렉션에서 객체 제거

        // 객체를 하나씩 가져와서 출력함
        for(String element : set){
            System.out.println(element);
        }
    }
}

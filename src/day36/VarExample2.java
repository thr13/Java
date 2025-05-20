package src.day36;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class VarExample2 {
    public static void main(String[] args) {
        method1();
        method2();
    }

    // 타입을 명시적으로 작성한 메소드
    public static void method1() {
        Map<String, Integer> map = new HashMap<>();
        map.put("김자바", 70);
        map.put("이시플", 80);
        map.put("박이썬", 60);

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ":" + value);
        }
    }

    // var 를 사용하여 컴파일러가 지역변수의 타입을 추론하도록 작성한 메소드
    public static void method2() {
        var map = new HashMap<String, Integer>();
        map.put("김자바", 70);
        map.put("이시플", 80);
        map.put("박이썬", 60);

        var entrySet = map.entrySet();
        var entryIterator = entrySet.iterator();

        while (entryIterator.hasNext()) {
            var entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ":" + value);
        }
    }
}

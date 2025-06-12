package src.intermediate.ch6;

import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.partitioningBy;

public class StreamDivideExample2 {
    public static void main(String[] args) {
        // 소수 분류 프로그램 구현
        int n = 23;
        Map<Boolean, List<Integer>> partition = partitionPrimes(n);
        System.out.println(partition);
    }

    /*
    // 주어진 수가 소수인지 판별하기
    public static boolean isPrime(int candidate) {
        return IntStream.range(2, candidate) // 2부터 candidate 미만 사이의 자연수를 생성
                .noneMatch(i -> candidate % i == 0); // 스트림의 모든 정수로 candidate 를 나눌 수 없으면 true 를 반환
    }
    */

    // 소수의 대상을 주어진 수의 제곱근 이하로 제한하기
    public static boolean isPrime(int candidate) {
        int candidateRoot = (int) Math.sqrt((double) candidate);
        return IntStream.range(2, candidateRoot)
                .noneMatch(i -> candidate % i == 0); // 스트림의 모든 정수로 candidate 를 나눌 수 없으면 true 를 반환
    }

    // isPrime 메서드를 Predicate 로, partitionBy 컬렉터로 리듀스하기
    public static Map<Boolean, List<Integer>> partitionPrimes(int n) {
        return IntStream.range(2, n)
                .boxed()
                .collect(partitioningBy(candidate -> isPrime(candidate)));
    }
}

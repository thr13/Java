package src.intermediate.ch5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class StreamPracticeProblem {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        // 2011 년에 일어난 모든 트랙잭션을 찾아 값을 오름차순으로 정렬하기
        List<Transaction> practice1 = transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(comparing(Transaction::getValue))
                .collect(toList());
        System.out.println(practice1);

        // 거래자가 근무하는 모든 도시를 중복 없이 나열하기
        List<String> practice2 = transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(toList());
        System.out.println(practice2);

        // Cambridge 에서 근무하는 모든 거래차를 찾아서 이름순으로 정렬하기
        List<Trader> practice3 = transactions.stream()
                .map(Transaction::getTrader) // 트랜잭션의 모든 거래자 추출
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct()
                .sorted(comparing(Trader::getName))
                .collect(toList());
        System.out.println(practice3);

        // 모든 거래자의 이름을 알파벳순으로 정렬하기
        String practice4 = transactions.stream()
                .map(transaction -> transaction.getTrader().getName()) // 모든 거래자명을 문자열 스트림으로 추출
                .distinct()
                .sorted() // 중복된 이름 제거
                .reduce("", (n1, n2) -> n1 + n2); // 이름을 알파벳순으로 정렬
        System.out.println(practice4);

        // Milan 에 거래자가 있는지 출력하기
        boolean practice5 = transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
        System.out.println(practice5);

        // Cambridge 에 거주하는 거래자의 모든 트랜잭션값을 출력하기
        transactions.stream()
                .filter(transaction -> "Cambridge".equals(transaction.getTrader().getCity()))
                .map(Transaction::getValue)
                .forEach(System.out::println);

        // 전체 트랙잭션 중 최대값 출력하기
        Optional<Integer> practice7 = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);
        System.out.println(practice7);

        // 전체 트랙잭션 중 최소값 출력하기
        Optional<Transaction> practice8 = transactions.stream()
                .reduce((t1, t2) -> t1.getValue() < t2.getValue() ? t1 : t2);
        System.out.println(practice8);
    }
}

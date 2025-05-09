package src.day27;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamExample5 {
    public static void main(String[] args) throws Exception {
        // 리플렉션을 이용해서 이 클래스파일의 경로를 구한다음 해당 경로 내에 존재하는 data.txt 파일의 위치를 가리키는 참조를 얻는다
        Path path = Paths.get(StreamExample5.class.getResource("data.txt").toURI());

        // 읽은 파일의 내용을 문자열을 한줄씩 읽고 Stream<String> 객체로 변환
        Stream<String> stream = Files.lines(path, Charset.defaultCharset());
        stream.forEach(line -> System.out.println(line));

        // 스트림이 사용했던 시스템 자원 반환
        stream.close();
    }
}

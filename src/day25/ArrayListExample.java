package src.day25;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Board> list = new ArrayList<>();

        // ArrayList 객체 추가
        list.add(new Board("제목1", "내용1", "글쓴이1"));
        list.add(new Board("제목2", "내용2", "글쓴이2"));
        list.add(new Board("제목3", "내용3", "글쓴이3"));
        list.add(new Board("제목4", "내용4", "글쓴이4"));
        list.add(new Board("제목5", "내용5", "글쓴이5"));

        // ArrayList 에 저장된 객체 수 얻기
        int size = list.size();
        System.out.println("총 객체 수: " + size);
        System.out.println();

        // 특정 인덱스의 객체 가져오기
        Board board = list.get(2); // 2번 인덱스에 담긴 객체 가져오기
        System.out.println(board.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());
        System.out.println();

        for(int i=0; i<list.size(); i++) {
            Board b = list.get(i);
            System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
        }
        System.out.println();

        // 객체 삭제
        list.remove(2);
        list.remove(2); // 위에서 2번 인덱스를 삭제한 결과 3번 인덱스가 2번 인덱스로 변경되므로 다시 2번 인덱스를 삭제할 수 있음

        for(Board b : list) {
            System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
        }
    }
}

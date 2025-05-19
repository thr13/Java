package src.day35;

import java.sql.*;
import java.util.Scanner;

public class BoardExample3 {
    private Scanner scanner = new Scanner(System.in);
    private Connection conn;

    public BoardExample3() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/thisisjava",
                    "root",
                    "cjddyd0405@"
            );
        } catch (Exception e) {
            e.printStackTrace();
            exit();
        }
    }

    public void list() {
        System.out.println();
        System.out.println("[게시물 목록]");
        System.out.println("-----------------------------------------------------");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
        System.out.println("-----------------------------------------------------");

        // boards 테이블 게시물 정보 출력
        try {
            String sql = new StringBuilder()
                    .append("SELECT bno, btitle, bcontent, bwriter, bdate ")
                    .append("FROM boards ")
                    .append("ORDER By bno DESC")
                    .toString();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while(rs.next()) {
                Boards boards = new Boards();
                boards.setBno(rs.getInt("bno"));
                boards.setBtitle(rs.getString("btitle"));
                boards.setBcontent(rs.getString("bcontent"));
                boards.setBwriter(rs.getString("bwriter"));
                boards.setBdate(rs.getDate("bdate"));
                System.out.printf("%-6s%-12s%-16s%-40s \n",
                        boards.getBno(),
                        boards.getBwriter(),
                        boards.getBdate(),
                        boards.getBtitle());
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
            exit();
        }

        mainMenu(); // 메인메뉴
    }

    public void mainMenu() {
        System.out.println();
        System.out.println("-----------------------------------------------------");
        System.out.println("메인 메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit");
        System.out.print("메뉴 선택: ");
        String menuNo = scanner.nextLine();
        System.out.println();

        switch (menuNo) {
            case "1" -> create();
            case "2" -> read();
            case "3" -> clear();
            case "4" -> exit();
        }
    }

    public void create() {
        System.out.println("*** create() 메소드 실행됨");
        list();
    }

    public void read() {
        System.out.println("*** read() 메소드 실행됨");
        list();
    }

    public void clear() {
        System.out.println("*** clear() 메소드 실행됨");
        list();
    }

    public void exit() {
        System.exit(0);
    }

    public static void main(String[] args) {
        BoardExample3 boardExample3 = new BoardExample3();
        boardExample3.list();
    }
}

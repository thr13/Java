package src.basic.day35;

import java.sql.*;
import java.util.Scanner;

public class BoardExample9 {
    private Scanner scanner = new Scanner(System.in);
    private Connection conn;

    public BoardExample9() {
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
        // 메뉴 입력
        Boards boards = new Boards();
        System.out.println("[새 게시물 입력]");
        System.out.println("제목: ");
        boards.setBtitle(scanner.nextLine());
        System.out.println("내용: ");
        boards.setBcontent(scanner.nextLine());
        System.out.println("작성자: ");
        boards.setBwriter(scanner.nextLine());

        // 보조 메뉴 출력
        System.out.println("-----------------------------------------------------");
        System.out.println("보조 메뉴: 1.OK | 2.CANCEL");
        System.out.println("메뉴 선택: ");
        String menuNo = scanner.nextLine();
        if(menuNo.equals("1")) {
            // boards 테이블에 게시물 정보 저장
            try {
                String sql = new StringBuilder()
                        .append("INSERT INTO boards (btitle, bcontent, bwriter, bdate ")
                        .append("VALUES (?, ?, ?, now())")
                        .toString();
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, boards.getBtitle());
                pstmt.setString(2, boards.getBcontent());
                pstmt.setString(3, boards.getBwriter());
                pstmt.executeUpdate();
                pstmt.close();
            } catch (Exception e) {
                e.printStackTrace();
                exit();
            }
        }

        list();
    }

    public void read() {
        System.out.println("[게시물 읽기]");
        System.out.print("bno: ");
        int bno = Integer.parseInt(scanner.nextLine());

        try {
            String sql = new StringBuilder()
                    .append("SELECT bno, btitle, bcontent, bwriter, bdate ")
                    .append("FROM boards ")
                    .append("WHERE bno=?")
                    .toString();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, bno);
            ResultSet rs = pstmt.executeQuery();

            if(rs.next()) {
                Boards boards = new Boards();
                boards.setBno(rs.getInt("bno"));
                boards.setBtitle(rs.getString("btitle"));
                boards.setBcontent(rs.getString("bcontent"));
                boards.setBwriter(rs.getString("bwriter"));
                boards.setBdate(rs.getDate("bdate"));
                System.out.println("##########");
                System.out.println("번호: " + boards.getBno());
                System.out.println("제목: " + boards.getBtitle());
                System.out.println("내용: " + boards.getBcontent());
                System.out.println("작성자: " + boards.getBwriter());
                System.out.println("날짜: " + boards.getBdate());

                // 보조 메뉴 출력
                System.out.println("-----------------------------------------------------");
                System.out.println("보조 메뉴: 1.UPDATE | 2.DELETE | 3.LIST");
                System.out.println("메뉴 선택: ");
                String menuNo = scanner.nextLine();
                if(menuNo.equals("1")) {
                    update(boards);
                } else if(menuNo.equals("2")) {
                    delete(boards);
                } else if(menuNo.equals("3")) {
                    list();
                }
                System.out.println("##########");
            }
            rs.close();
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        list();
    }

    public void update(Boards boards) {
        System.out.println("[수정 내용 입력]");
        System.out.print("제목: ");
        boards.setBtitle(scanner.nextLine());
        System.out.println("내용: ");
        boards.setBcontent(scanner.nextLine());
        System.out.println("작성자: ");
        boards.setBwriter(scanner.nextLine());

        // 보조 메뉴 출력
        System.out.println("-----------------------------------------------------");
        System.out.println("보조 메뉴: 1.OK | 2.CANCEL");
        System.out.println("메뉴 선택: ");
        String menuNo = scanner.nextLine();
        if(menuNo.equals("1")) {
            // boards 테이블 정보 수정
            try {
                String sql = new StringBuilder()
                        .append("UPDATE boards SET btitle= ?, bcontent= ?, bwriter=? ")
                        .append("WHERE bno=?")
                        .toString();
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, boards.getBtitle());
                pstmt.setString(2, boards.getBcontent());
                pstmt.setString(3, boards.getBwriter());
                pstmt.setInt(4, boards.getBno());
                pstmt.executeUpdate();
                pstmt.close();
            } catch (Exception e) {
                e.printStackTrace();
                exit();
            }
        } else if(menuNo.equals("2")) {
            delete(boards);
        }
        list();
    }

    public void delete(Boards boards) {
        // boards 테이블 데이터 삭제
        try {
            String sql = new StringBuilder()
                    .append("DELETE FROM boards WHERE bno=?")
                    .toString();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, boards.getBno());
            pstmt.executeUpdate();
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            exit();
        }
        list();
    }

    public void clear() {
        System.out.println("[게시물 전체 삭제]");
        System.out.println("-------------------------------------------------------");
        System.out.println("보조 메뉴: 1.Ok | 2.Cancel");
        System.out.print("메뉴 선택: ");
        String menuNo = scanner.nextLine();
        if(menuNo.equals("1")) {
            // boards 테이블의 데이터 전부 삭제
            try {
                String sql = new StringBuilder()
                        .append("TRUNCATE TABLE boards")
                        .toString();
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.executeUpdate();
                pstmt.close();
            } catch (Exception e) {
                e.printStackTrace();
                exit();
            }
        }
        list();
    }

    public void exit() {
        if(conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {

            }
        }
        System.out.println("** 게시판 종료 **");
        System.exit(0);
    }

    public static void main(String[] args) {
        BoardExample9 boardExample9 = new BoardExample9();
        boardExample9.list();
    }
}

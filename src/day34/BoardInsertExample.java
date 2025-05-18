package src.day34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BoardInsertExample {
    public static void main(String[] args) {
        Connection conn = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            // DB 연결
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/thisisjava",
                    "root",
                    "cjddyd0405@"
            );

            // SQL 문
            String sql = new StringBuilder()
                    .append("INSERT INTO boards (btitle, bcontent, bwriter, bdate, bfilename, bfiledata) ")
                    .append("VALUES (?, ?, ?, now(), ?, ?)")
                    .toString();

            // PreparedStatement 얻기 및 값 지정
            PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1, "눈 오는 날");
            pstmt.setString(2, "함박눈이 내려요.");
            pstmt.setString(3, "winter");
            pstmt.setString(4, "snow.jpg");
            pstmt.setBlob(5, new FileInputStream("src/day34/snow.jpeg"));

            // SQL 문 실행
            int rows = pstmt.executeUpdate();
            System.out.println("저장된 행 수: " + rows);

            // 속성 bno 의 값 얻기
            if (rows == 1) {
                ResultSet rs = pstmt.getGeneratedKeys();

                if (rs.next()) {
                    int bno = rs.getInt(1); // 1번쨰 속성값을 리턴
                    System.out.println("저장된 bno: " + bno);
                }

                rs.close(); // ResultSet 메모리 할당 해제
            }

            pstmt.close(); // PreparedStatement 메모리 할당 해제

        } catch (SQLException e) {
            System.err.println("SQL 오류 발생 " + e.getMessage());
        } catch (ClassNotFoundException | FileNotFoundException e) {
            System.err.println("DB 연결 오류 발생 " + e.getMessage());
        } finally {
            // DB 연결 끊기
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {}
        }
    }
}
package src.day34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BoardUpdateExample {
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

            // 매개변수화된 SQL 문
            String sql = new StringBuilder()
                    .append("UPDATE boards SET ")
                    .append("btitle= ?, ")
                    .append("bcontent= ?, ")
                    .append("bfilename= ?, ")
                    .append("bfiledata=? ")
                    .append("WHERE bno=?")
                    .toString();

            // PreparedStatement 얻기 및 값 지정
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "눈사람");
            pstmt.setString(2, "눈으로 만든 사람");
            pstmt.setString(3, "snowman.jpeg");
            pstmt.setBlob(4, new FileInputStream("src/day34/snowman.jpeg"));
            pstmt.setInt(5, 2);

            // SQL 문 실행
            int rows = pstmt.executeUpdate();
            System.out.println("수정된 행 수: " + rows);

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

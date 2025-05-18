package src.day34;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsertExample {
    public static void main(String[] args) {
        Connection conn = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // JDBC Driver 등록

            // DB 연결
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/thisisjava",
                    "root",
                    "cjddyd0405@"
            );

            // 매개변수화된 SQL 문
            String sql = new StringBuilder()
                    .append("INSERT INTO users (userid, username, userpassword, userage, useremail) ")
                    .append("VALUES (?, ?, ?, ?, ?)")
                    .toString();

            // PreparedStatement 얻기 및 값 지정
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "winter");
            pstmt.setString(2, "한겨울");
            pstmt.setString(3, "12345");
            pstmt.setInt(4, 25);
            pstmt.setString(5, "winter@mycompany.com");

            // SQL 문 실행
            int rows = pstmt.executeUpdate();
            System.out.println("저장된 행 수: " + rows);

            // PreparedStatement 닫기
            pstmt.close();
        } catch (SQLException e) {
            System.err.println("SQL 오류 발생 " + e.getMessage());
        } catch (ClassNotFoundException e) {
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
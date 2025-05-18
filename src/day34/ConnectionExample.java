package src.day34;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionExample {
    public static void main(String[] args) {
        Connection conn = null; // DB 연결 객체

        try {
            // Class.forName() 정적 메소드를 이용하여 JDBC Driver 등록
            Class.forName("com.mysql.cj.jdbc.Driver");

            // DriverManager.getConnection() 정적 메소드를 이용하여 DB 연결
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/thisisjava",
                    "root",
                    "cjddyd0405@"
            );
            System.out.println("연결 성공");

        } catch (ClassNotFoundException e) {
            // JDBC 등록이 실패한 경우
            System.err.println("JDBC 등록 실패 " + e.getMessage());
        } catch (SQLException  e) {
            // DB 연결이 실패한 경우
            System.err.println("DB 연결 실패 " + e.getMessage());
        } finally {
            // 연결이 성공한 경우
            if (conn != null) {
                try {
                    // DB 연결 종료
                    conn.close();
                    System.out.println("연결 종료");
                } catch (SQLException e) {}
            }
        }
    }
}

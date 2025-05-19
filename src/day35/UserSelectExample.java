package src.day35;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserSelectExample {
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
                    .append("SELECT userid, username, userpassword, userage, useremail ")
                    .append("FROM users ")
                    .append("WHERE userid=?")
                    .toString();

            // PreparedStatement 얻기 및 값 지정
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "winter");

            // SQL 문 실행 후, ResultSet 을 통해 데이터 읽기
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                User user = new User(); // users 테이블을 매핑할 User 객체 생성
                user.setUserId(rs.getString("userid"));
                user.setUserName(rs.getString("username"));
                user.setUserPassword(rs.getString("userpassword"));
                //user.setUserAge(rs.getInt("userage"));
                user.setUserAge(rs.getInt(4)); // 위의 코드와 같은 결과를 가짐, 컬럼 순번을 이용
                //user.setUserEmail(rs.getString("useremail"));
                user.setUserEmail(rs.getString(5));
                System.out.println(user);
            } else {
                // 데이터 행을 못가져온 경우
                System.out.println("사용자 아이다가 존재하지 않음");
            }
            rs.close();
            pstmt.close();
        } catch (ClassNotFoundException e) {
            // JDBC Driver 를 찾지 못한경우
            System.err.println("JDBC 오류: " + e.getMessage());
        } catch (SQLException e) {
            // DB 연결 오류
            System.err.println("DB 연결 오류: " + e.getMessage());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {}
            }
        }
    }
}

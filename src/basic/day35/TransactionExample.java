package src.basic.day35;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionExample {
    public static void main(String[] args) {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/thisisjava",
                    "root",
                    "cjddyd0405@"
            );

            // 트랙잭션 시작
            conn.setAutoCommit(false); // 자동 커밋 기능 끄기

            // 출금 작업
            String sql1 = new StringBuilder()
                    .append("UPDATE accounts SET balance=balance-? WHERE ano=?")
                    .toString();
            PreparedStatement pstmt1 = conn.prepareStatement(sql1);
            pstmt1.setInt(1, 10000);
            pstmt1.setString(2, "111-111-1111");
            int rows1 = pstmt1.executeUpdate();

            if (rows1 == 0) {
                throw new Exception("출금 실패");
            }
            pstmt1.close();

            // 입금 작업
            String sql2 = new StringBuilder()
                    .append("UPDATE accounts SET balance=balance+? WHERE ano=?")
                    .toString();
            PreparedStatement pstmt2 = conn.prepareStatement(sql2);
            pstmt2.setInt(1, 10000);
            pstmt2.setString(2, "111-111-1111");
            int rows2 = pstmt2.executeUpdate();

            if (rows2 == 0) {
                throw new Exception("입금 실패");
            }

            conn.commit(); // 수동 커밋(모든 소작업들을 성공 처리)
            System.out.println("계좌 이체 성공");

            // 트랜잭션 종료
        } catch (Exception e) {
            try {
                // 수동 롤백(모든 소작업들을 실패 처리)
                conn.rollback();
            } catch (SQLException e1) {
            }
            System.out.println("계좌 이체 실패");
            e.printStackTrace();
        } finally {
            if (conn != null) {
                // Connection 이 연결되어 있으면 실행
                try {
                    conn.setAutoCommit(true); // 자동 커밋 기능 켜기
                    conn.close();
                } catch (SQLException e2) {
                }

            }
        }
    }
}

package src.day35;

import java.io.*;
import java.sql.*;

public class BoardSelectExample {
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

            // 매개변수화된 SQL 문 작성
            String sql = new StringBuilder()
                    .append("SELECT bno, btitle, bcontent, bwriter, bdate, bfilename, bfiledata ")
                    .append("FROM boards ")
                    .append("WHERE bwriter=?")
                    .toString();

            // PreparedStatement 얻기 및 값 지정
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "winter");

            // SQL 문 실행 후 ResultSet 을 통해 데이터 읽기
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Board board = new Board(); // 데이터 행을 읽고 저장할 Board 객체 생성
                board.setBno(rs.getInt("bno"));
                board.setBtitle(rs.getString("btitle"));
                board.setBcontent(rs.getString("bcontent"));
                board.setBwriter(rs.getString("bwriter"));
                board.setBdate(rs.getDate("bdate"));
                board.setBfilename(rs.getString("bfilename"));
                board.setBfiledata(rs.getBlob("bfiledata"));
                System.out.println(board);

                // 파일 저장
                Blob blob = board.getBfiledata();
                if (blob != null) {
                    InputStream is = blob.getBinaryStream();
                    OutputStream os = new FileOutputStream("src/day35/temp/" + board.getBfilename());
                    is.transferTo(os);
                    os.flush();
                    os.close();
                    is.close();
                }
            }
            rs.close();
            pstmt.close();
        } catch (ClassNotFoundException e) {
            // JDBC Driver 를 찾지 못한경우
            System.err.println("JDBC 오류: " + e.getMessage());
        } catch (SQLException e) {
            // DB 연결 오류
            System.err.println("DB 연결 오류: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("파일 저장 오류: " + e.getMessage());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {}
            }
        }
    }
}

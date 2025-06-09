package database.ex1;

import java.sql.*;

public class DB {
    private static Connection conn;

    // DB 초기화
    public static void init() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/gym?serverTimezone=UTC&useUnicode=true&characterEncoding=UTF-8",
                "root",
                "rootroot"
            );
            System.out.println("DB 연결 성공");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("DB 연결 실패");
            e.printStackTrace();
        }
    }

    // SELECT 실행
    public static ResultSet executeQuery(String sql, Object... params) {
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            setParams(pstmt, params);
            return pstmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    // INSERT / UPDATE / DELETE 실행
    public static int executeUpdate(String sql, Object... params) {
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            setParams(pstmt, params);
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }

    // 파라미터 설정
    private static void setParams(PreparedStatement pstmt, Object... params) throws SQLException {
        for (int i = 0; i < params.length; i++) {
            pstmt.setObject(i + 1, params[i]);
        }
    }
}

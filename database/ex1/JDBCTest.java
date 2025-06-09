package database.ex1;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.x.protobuf.MysqlxSql.StmtExecute;

public class JDBCTest {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/gym?serverTimezone=UTC&useUnicode=true&characterEncoding=UTF-8"

					, "root", "rootroot");
			
			Statement statement = conn.createStatement();
			String insertSQL = "INSERT INTO members(name, phone, membership_months, cabinet, start_date) VALUES (?, ?, ?, ?, ?)";

			PreparedStatement pstmt = conn.prepareStatement(insertSQL);
			pstmt.setString(1, "홍길동");                      // name
			pstmt.setString(2, "01012345678");               // phone
			pstmt.setInt(3, 3);                              // membership_months
			pstmt.setInt(4, 1);                              // cabinet
			pstmt.setDate(5, Date.valueOf("2024-06-01"));    // start_date

			
			int num = pstmt.executeUpdate();
			if(num > 0) {
				System.out.println("입력 성공");
			}
			else {
				System.out.println("입력 실패");
			}
			String selectSQL = "select * from members";
			ResultSet rs = statement.executeQuery(selectSQL);
			

			
			while (rs.next()) {
			    int id = rs.getInt("id");
			    String name = rs.getString("name");
			    String phone = rs.getString("phone");
			    int months = rs.getInt("membership_months");
			    int cabinet = rs.getInt("cabinet");
			    Date startDate = rs.getDate("start_date");

			    System.out.println("회원번호: " + id + ", 이름: " + name + ", 전화번호: " + phone + 
			                       ", 개월 수: " + months + ", 사물함: " + cabinet + ", 시작일: " + startDate);
			}
			

			
			
			
			System.out.println("ok");
		} catch (ClassNotFoundException e) {
			System.err.println("해당 드라이버를 찾지 못했습니다 : ");
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println("sql 오류 발생");
			e.printStackTrace();
		}
		
	}

}

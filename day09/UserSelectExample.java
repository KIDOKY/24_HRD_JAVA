package day09;
/*
 * 	1. JDDBC 드라이버 로드
 *  2. 데이터 베이스 연결
 */

import java.util.*;
import java.sql.*;

public class UserSelectExample {

	public static void main(String[] args) {
		Connection con = null;
		
		try {
			//1. 드라이버 로딩...
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. 데이터 베이스 연결...
			String url = "jdbc:mysql://localhost:3306/contacts";
			String id = "root";
			String pwd = "1234";
			con = DriverManager.getConnection(url, id, pwd);
			System.out.println("DB 연결 성공~~");
			
			String sql2 = "select * from users where userid = ?";
			PreparedStatement st = con.prepareStatement(sql2);
			st.setString(1, "lee");
			
			// 4. 데이터 추가 명령 전송하기
			ResultSet rs = st.executeQuery();
			
			if(rs.next()) {
				System.out.println("데이터 조회 성공~~");
				String name = rs.getString("username");
				int age = rs.getInt("userage");
				System.out.println("이름: " + name);
				System.out.println("나이: " + age);
				
			}else {
				System.out.println("데이터 저장 실패!!");
			}
			
		}catch(Exception e) {
			System.out.println("드라이버 로딩 실패");
			
		}finally {
			try {
				con.close();
				System.out.println("연결 끊기");
			}catch(SQLException es) {
				
			}
		}
	}

}

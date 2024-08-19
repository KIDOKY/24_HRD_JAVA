package day09;
/*
 * 	1. JDDBC 드라이버 로드
 *  2. 데이터 베이스 연결
 */

import java.util.*;
import java.sql.*;

public class UserinsertExample {

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
			
			// 3. sql 실행 하기 위한 Statement, PreparedStatement 객체생성
			//String sql = "INSERT INTO person VALUES ('kido','010-456-4566','kim@a.com',30);";
			String sql2 = "insert into users (userid, username, userpassword, userage, useremail) " + "values (?,?,?,?,?);";
			PreparedStatement st = con.prepareStatement(sql2);
			st.setString(1, "lee");
			st.setString(2, "이자바");
			st.setString(3, "4567");
			st.setInt(4, 20);
			st.setString(5, "java@a.com");
			
			// 4. 데이터 추가 명령 전송하기
			int result = st.executeUpdate();
			
			if(result > 0) {
				System.out.println("데이터 저장 성공~~");
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

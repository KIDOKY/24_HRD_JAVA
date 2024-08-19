package day09;
/*
 * 	1. JDDBC 드라이버 로드
 *  2. 데이터 베이스 연결
 */

import java.io.IOException;
import java.sql.*;
import java.io.FileInputStream;

public class BoardInsertExample {

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
			String sql2 = "insert into boards(btitle, bcontent, bwriter, bdate, bfilename, bfiledata)" + "VALUES (?,?,?,now(),?,?);";
			PreparedStatement st = con.prepareStatement(sql2,Statement.RETURN_GENERATED_KEYS);
			st.setString(1, "눈 오는 날");
			st.setString(2, "함박눈");
			st.setString(3, "winter");
			st.setString(4, "winterpic.jpg");
			st.setBlob(5, new FileInputStream("C:\\Users\\COMPUTER\\eclipse-workspace\\JavaOOP\\src\\day09\\winterpic.jpg"));
			
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

package day10;
import java.sql.*;
import java.io.*;
public class ConnectDB {
	
	static Connection con = null;
	
	public ConnectDB() {
		
		try {
			//1. 드라이버 로딩...
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. 데이터 베이스 연결...
			String url = "jdbc:mysql://localhost:3306/contacts";
			String id = "root";
			String pwd = "1234";
			con = DriverManager.getConnection(url, id, pwd);
			System.out.println("DB 연결 성공~~");
			
		}catch(Exception en)  {
			
		}
	}//생성자-----------------------------------------------------
	
	Connection getCon() {
		return con;
	}

}

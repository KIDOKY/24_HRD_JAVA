package day10;

import java.sql.*;
import java.io.*;
import java.util.*;

public class DataModel {
// 1. 데이터 베이스 연결..
// 2. 데이터 입출력 담당 메소드 구현
	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	ConnectDB cdb = null;
	Board board = null;
	Scanner sc = null;
	
	public DataModel() {
		cdb = new ConnectDB();
		con = cdb.getCon();
		if(con != null) {
			System.out.println("연결 성공!");
		}else {
			System.out.println("연결 실패!");
		}
		sc = new Scanner(System.in);
	}// 생성자...
	
	// 데이터 추가 메소드 insertData() (insert into~)
	public void insertData(Board board) throws SQLException{
		int num = 0;
		this.board = board;
		String sql = "INSERT INTO boards(btitle,bcontent,bwriter,bdate) VALUES (?,?,?,now())";
		pst = con.prepareStatement(sql);
		pst.setString(1, board.getBtitle());
		pst.setString(2, board.getBcontent());
		pst.setString(3, board.getBwriter());
		
		num = pst.executeUpdate();
		
		if(num > 0) System.out.println("저장 성공~~");
		else System.out.println("저장 실패~~");
	}
	
	// 게시물 데이터 입력 받기
	public void create() throws SQLException{
		Board board = new Board();
		System.out.println("[새 게시물 입력]");
		System.out.print("제목: ");
		board.setBtitle(sc.nextLine());
		System.out.print("내용: ");
		board.setBcontent(sc.nextLine());
		System.out.print("작성자: ");
		board.setBwriter(sc.nextLine());
		///////////////////////////////////////
		insertData(board);
		///////////////////////////////////////
		list();
	}
	
	// 데이터 검색 list()
		public void list() throws SQLException {
			System.out.println("[게시물 목록]");
			System.out.println("-----------------------------------------------------");
			System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
			System.out.println("-----------------------------------------------------");
			
			String sql = "select bno, btitle, bcontent, bwriter, bdate from boards order by bno desc";
			pst = con.prepareStatement(sql);
			
			rs = pst.executeQuery();
			
			while(rs.next()) {
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				
				System.out.print(board.getBno());
				System.out.print("\t" + board.getBwriter());
				System.out.print("\t" + board.getBdate());
				System.out.println("\t" + board.getBtitle());
			}
			
			// 메인 메뉴 출력
			BoardExample be = new BoardExample();
			be.mainMenu();
		}
	
	// 3. 데이터 조건 검색 list()
		public void list(String name) throws SQLException {
			System.out.println("[게시물 목록]");
			System.out.println("-----------------------------------------------------");
			System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
			System.out.println("-----------------------------------------------------");
			
			String sql = "select bno, btitle, bcontent, bwriter, bdate from boards where bwriter = ?";
			pst = con.prepareStatement(sql);
			pst.setString(1, name);
			rs = pst.executeQuery();
			
			while(rs.next()) {
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				
				System.out.printf("%-6s%-12s%-16s%-40s\n", board.getBno(),board.getBtitle(),board.getBcontent(),board.getBwriter());
			}
		}//list(String name)---------------------------------
		
		// 게시물 읽기 메소드 구현하기 bno를 입력받아서 해당 게시물을 읽어오기
		public void read(int bno) throws SQLException{
			System.out.println("[게시물 읽기]");
			
			String sql = "select bno,btitle,bcontent,bwriter,bdate from boards where bno = ?";
			pst = con.prepareStatement(sql);
			pst.setInt(1, bno);
			rs = pst.executeQuery();
			
			while(rs.next()) {
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				System.out.println("###########");
				System.out.println("번호: " + board.getBno());
				System.out.println("제목: " + board.getBtitle());
				System.out.println("내용: " + board.getBcontent());
				System.out.println("작성자: " + board.getBwriter());
				System.out.println("날짜: " + board.getBdate());
				System.out.println("###########");
				
				// 보조 메뉴 출력
				System.out.println("----------------");
				System.out.println("보조 메뉴: 1.Update | 2.Delete | 3.List");
				System.out.print("메뉴 선택: ");
				String menuNo = sc.nextLine();
				if(menuNo.equals("1")) {
					update(board);
				}else if(menuNo.equals("2")) {
					delete(board);
				}else if(menuNo.equals("3")) {
					list();
				}
			}
			
		}
		
		public void read() throws SQLException{
			System.out.println("[게시물 읽기]");
			System.out.println("bno: ");
			int bno = sc.nextInt();
			String sql = "select bno,btitle,bcontent,bwriter,bdate from boards where bno = ?";
			pst = con.prepareStatement(sql);
			pst.setInt(1, bno);
			rs = pst.executeQuery();
					
			while(rs.next()) {
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				System.out.println("###########");
				System.out.println("번호: " + board.getBno());
				System.out.println("제목: " + board.getBtitle());
				System.out.println("내용: " + board.getBcontent());
				System.out.println("작성자: " + board.getBwriter());
				System.out.println("날짜: " + board.getBdate());
				System.out.println("###########");
						
				// 보조 메뉴 출력
				System.out.println("----------------");
				System.out.println("보조 메뉴: 1.Update | 2.Delete | 3.List");
				System.out.print("메뉴 선택: ");
				String menuNo = sc.nextLine();
				if(menuNo.equals("1")) {
					update(board);
				}else if(menuNo.equals("2")) {
					delete(board);
				}else if(menuNo.equals("3")) {
					list();
				}
			}
					
		}
		
		// 4. 게시물 수정 기능 메소드 구현
		public void update(Board board) throws SQLException{
			// 수정 내용 입력 받기
			System.out.println("[수정 내용 입력]");
			System.out.print("제목: ");
			board.setBtitle(sc.nextLine());
			System.out.print("내용: ");
			board.setBcontent(sc.nextLine());
			System.out.println("작성자: ");
			board.setBwriter(sc.nextLine());
			
			// 보조 메뉴 출력
			System.out.println("----------------");
			System.out.println("보조 메뉴: 1.OK | 2.Cancel");
			System.out.print("메뉴 선택: ");
			String menuNo = sc.nextLine();
			if(menuNo.equals("1")) {
				// 게시물 정보 수정(update set ~~~~)
				String sql = "UPDATE boards SET btitle = ?, bcontent = ?, bwriter = ? where bno = ?";
				pst = con.prepareStatement(sql);
				pst.setString(1, board.getBtitle());
				pst.setString(2, board.getBcontent());
				pst.setString(3, board.getBwriter());
				pst.setInt(4, board.getBno());
				
				pst.executeUpdate();
				pst.close();
				con.close();
				
			}else if(menuNo.equals("2")) {
				System.out.println("취소");
			}
		}//update()-----------------------
		
		
		public void delete(Board board) throws SQLException{
			
			System.out.println("[삭제 내용 입력]");
			System.out.print("제목: ");
			board.setBtitle(sc.nextLine());
			System.out.print("내용: ");
			board.setBcontent(sc.nextLine());
			System.out.println("작성자: ");
			board.setBwriter(sc.nextLine());
			
			// 보조 메뉴 출력
			System.out.println("----------------");
			System.out.println("보조 메뉴: 1.OK | 2.Cancel");
			System.out.print("메뉴 선택: ");
			String menuNo = sc.nextLine();
			if(menuNo.equals("1")) {
				// 게시물 정보 삭제(delete set ~~~~)
				String sql = "DELETE boards SET btitle = ?, bcontent = ?, bwriter = ? where bno = ?";
				pst = con.prepareStatement(sql);
				pst.setString(1, board.getBtitle());
				pst.setString(2, board.getBcontent());
				pst.setString(3, board.getBwriter());
				pst.setInt(4, board.getBno());
						
				pst.executeUpdate();
				pst.close();
				con.close();
							
				}else if(menuNo.equals("2")) {
					System.out.println("취소");
				}
		}//delete()--------------------------
		
		public void clear() throws SQLException{
			System.out.println("[게시물 전체 삭제]");
			System.out.println("------------------------");
			System.out.println("보조 메뉴: 1.OK | 2.Cancel");
			System.out.println("메뉴 선택: ");
			String menuNo = sc.nextLine();
			if(menuNo.equals("1")) {
				// 게시물 정보 삭제(delete set ~~~~)
				String sql = "CLEAR boards SET btitle = ?, bcontent = ?, bwriter = ? where bno = ?";
				pst = con.prepareStatement(sql);
				pst.setString(1, board.getBtitle());
				pst.setString(2, board.getBcontent());
				pst.setString(3, board.getBwriter());
				pst.setInt(4, board.getBno());
				
				pst.executeUpdate();
				pst.close();
				con.close();
							
				}else if(menuNo.equals("2")) {
					System.out.println("취소");
				}
		}
		
		public void exit() {
			if(con != null) {
				try {
					con.close();
				}catch(SQLException sq) {
					
				}
			}
			System.out.println("** 게시판 종료");
			System.exit(0);
		}
		
	public static void main(String[] args) throws SQLException{
		DataModel dm = new DataModel();
		//dm.create();
		//dm.list("winter");
		dm.read();
	}

}

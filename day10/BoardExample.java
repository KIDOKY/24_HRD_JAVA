package day10;

import java.sql.SQLException;
import java.util.Scanner;

public class BoardExample{
	
	// Scanner 필드 정의
	Scanner sc = new Scanner(System.in);
	DataModel dm = null;
	
	// 생성자
	public BoardExample() {
		dm = new DataModel();
	}
	
	// mainMenu() 메소드 정의
	public void mainMenu() throws SQLException {
		System.out.println();
		System.out.println("-------------");
		System.out.println("메인 메뉴: 1. Create | 2. Read | 3. Clear | 4. Exit");
		System.out.print("메뉴 선택: ");
		String menuNo = sc.nextLine();
		System.out.println();
		
		switch(menuNo) {
		case "1":
			dm.create();
			break;
		case "2":
			dm.read(1);
			break;
		case "3":
			dm.clear();
			break;
		case "4":
			dm.exit();
			break;
		}
	}
	public static void main(String[] args) throws Exception{
		BoardExample bexample = new BoardExample();
		bexample.mainMenu();
	}

}

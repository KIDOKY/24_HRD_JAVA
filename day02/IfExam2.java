package day02;

import java.util.Scanner;

public class IfExam2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int buysell;
		
		System.out.println("## 메뉴 선택 ##");
		System.out.println("[1] 구매자 [2] 판매자");
		System.out.print("## 메뉴를 선택 하세요-> ");
		buysell = sc.nextInt();
		
		String buysell2 = "";
		if(buysell == 1) {
			buysell2 = "구매자";
		}else if(buysell == 2) {
			buysell2 = "판매자";
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		System.out.println("환영합니다! " + buysell2 + "로 로그인하셨습니다.");
	}

}

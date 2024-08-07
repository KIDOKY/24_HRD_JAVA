package day02;
import java.util.Scanner;
public class DoWhileExam1 {

	public static void main(String[] args) {
		
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		String mes;
		
		do {
			System.out.print(">");
			mes = sc.nextLine();
			System.out.println(mes);
		}while(! mes.equals("q"));
		
		System.out.println();
		System.out.println("프로그램 종료");
	}
		
}

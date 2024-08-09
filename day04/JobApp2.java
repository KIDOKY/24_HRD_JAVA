package day04;

import java.util.Scanner;
import static java.lang.System.out;
import java.util.ArrayList;

public class JobApp2 {
	
	static Person2 p1;
	static Company2 p2;
	ArrayList<Person2> arraylist = new ArrayList<Person2>();
	ArrayList<Company2> arraylist2 = new ArrayList<Company2>();
	
	// 필드, 생성자, 메소드
	public void showMenu() {
		out.println("**********JOB v1.1***********");
		out.println("      ** 1. 구직 등록 **     ");
		out.println("      ** 2. 구인 등록 **     ");
		out.println("  ** 3. 구직자 정보 출력 **  ");
		out.println(" ** 4. 구인회사 정보 출력 ** ");
		out.println("       ** 5. 종료 **         ");
		out.println("*****************************");
		out.print("메뉴 번호를 입력하세요=>");
	}//showMenu()-------------
	
	
	public void inputPerson() {
		// 이름, 나이, 성별, 전화번호를 입력받아
		// Person2 객체에 저장
		Scanner sc = new Scanner(System.in);
		p1 = new Person2();
		
		System.out.println("--구직 등록 start------");
		System.out.print("이름 입력=>");
		String nm = sc.next();
		p1.name = nm;
		System.out.print("나이 입력=>");
		int a = sc.nextInt();
		p1.age = a;
		//성별, 전화번호 입력.....
		System.out.println("--성별 메뉴---");
		System.out.println("1.남자	2.여자");
		System.out.println("---------------");
		System.out.print("성별 메뉴번호 입력=>");
		int s = sc.nextInt();
		if(s == 1)
			p1.gender = 'M';
		else if(s == 2)
			p1.gender = 'F';
		else
			out.println("지원되지 않는 메뉴 번호입니다.");
			out.print("전화번호 입력=>");
		String t = sc.next();
		p1.tel = t;
		
		arraylist.add(p1);
	}
	
	// 구직자 정보 출력 메소드
	void showInfo() {
		for(Person2 p : arraylist) {
			p.getInfo();
		}
	}
	
	public void inputCompany() {
		// 이름, 나이, 성별, 전화번호를 입력받아
		// Company2 객체에 저장
		Scanner sc = new Scanner(System.in);
		p2 = new Company2();
		System.out.println("--구인 등록 start------");
		System.out.print("채용담당자 명 입력=>");
		String nm = sc.next();
		p2.name = nm;
		System.out.print("나이 입력=>");
		int a = sc.nextInt();
		p2.age = a;
		//성별, 전화번호 입력.....
		System.out.println("--성별 메뉴---");
		System.out.println("1.남자	2.여자");
		System.out.println("---------------");
		System.out.print("성별 메뉴번호 입력=>");
		int s = sc.nextInt();
		if(s == 1)
			p2.gender = 'M';
		else if(s == 2)
			p2.gender = 'F';
		else
			out.println("지원되지 않는 메뉴 번호입니다.");
			out.print("전화번호 입력=>");
		String t = sc.next();
		p1.tel = t;
		
		arraylist = new ArrayList<Person2>();
		arraylist2.add(p2);
	}
	
	// 구인자 정보 출력 메소드
	void showComInfo() {
		for(Company2 p : arraylist2) {
			p.getComInfo();
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		JobApp2 ja = new JobApp2();
		
		while(true) {
			ja.showMenu();
			int no = sc.nextInt();
			if(no == 5) {	// 종료
				System.exit(0);	// 프로그램 종료-0: 정상종료
			}else if(no == 1) {	//1. 구직등록...
				// 직장을 구하는 사람의 인적 정보를 입력받아야 한다.
				ja.inputPerson();
				// 인적정보를 입력받는 모듈
			}else if(no == 3) {
				ja.showInfo();
			}else if(no == 2) {
				ja.inputCompany();
			}else if(no == 4) {
				ja.showComInfo();
			}
		}	// while----------------
	}

}

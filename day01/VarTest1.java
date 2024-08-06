package day01;
import java.util.Scanner;

public class VarTest1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 1. 정수 변수
		
		int x;	//변수 x 선언
		//변수 초기화
		x = 5;	//변수 x에 1 값을 저장
		
		System.out.print("첫번째 정수 입력:");
		
		x = sc.nextInt();
		
		int y = 8;	//변수 y를 선언하고 2 값을 저장
		System.out.print("두번째 정수 입력:");
		
		y = sc.nextInt();
		
		int result = x + y; //변수 result를 선언하고 변수 x와 y를 더한 값을 저장
		System.out.println(result);	//콘솔에 변수의 값을 출력하는 println() 메소드 호출
		System.out.println(); //sysout 쓰고 ctrl + space + enter
		
		// 2. 실수 변수
		// float(4byte), double(8byte)
		double height = 175.5;
		float weight = 45.5f;
		
		System.out.print("첫번째 실수 입력(키):");
		
		height = sc.nextDouble();
		
		System.out.print("두번째 실수 입력(몸무게):");
		
		weight = sc.nextFloat();
		
		// 3. 문자형 변수
		// char
		
		char blood = 'B';
		
		// 4. 문자열 변수
		// String
		String name = "KIDOKY";
		
		System.out.print("이름을 입력하시오:");
		name = sc.next();
		
		System.out.println("키:"+height+"\n몸무게:"+weight);
		
		System.out.println("혈액형:" + blood + "형 입니다.");
		
		System.out.println("이름:" + name + " 입니다.");
		
		// 5. 논리형 변수
		
		// boolean형
		boolean stop = true;
		
		if(stop == true) {
			System.out.println("중지합니다.");
			//stop = false; //위치 바꿀 때 alt + 방향키
		}else {
			System.out.println("시작합니다.");
		}
			
	}

}

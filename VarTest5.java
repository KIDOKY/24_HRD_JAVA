package day01;
/*
 * 4칙연산과 나머지 연산을 하는 간단한 계산기 예제
 */
import java.util.Scanner;
public class VarTest5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 4칙 연산을 입력 받아 저장하는 변수 선언
		String opp;
		// 2. 2개 정수 입력 받아 저장하는 변수 선언
		int num1, num2;
		// 3. "+" 덧셈연산, "-" 뺄셈연산, "*" 곱셈연산, "/" 나누기연산, "%" 나머지연산
		System.out.print("다음 연산자 중 하나를 입력(+,-,*,/,%):");
		opp = sc.next();
		// 4.결과 출력 (result)
		int result = 0;
		System.out.print("첫번째 정수 입력: ");
		num1 = sc.nextInt();
		System.out.print("두번째 정수 입력: ");
		num2 = sc.nextInt();
		
		if(opp.equals("+")) {
			result = num1 + num2;
		}else if(opp.equals("-")) {
			result = num1 - num2;
		}else if(opp.equals("*")) {
			result = num1 * num2;
		}else if(opp.equals("/")) {
			result = num1 / num2;
		}else if(opp.equals("%")) {
			result = num1 % num2;
		}
		System.out.println("연산결과: " + num1 + opp + num2 + " = " + result);
	}

}

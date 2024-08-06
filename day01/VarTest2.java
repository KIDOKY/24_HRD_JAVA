package day01;

public class VarTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 정수형 변수 2개 선언하기 i, j
		int i = 10;
		int j = 20;
		// 문자열형 변수 1개 선언하기 var1
		String var1 = "KIDOKY";
		//문자형 변수 1개 선언하기 var2
		char var2 = 'A';
		//정수형 변수 1개와 문자열 변수 연결해서 출력하기
		
		System.out.println(i + var2);
		
		//문자열 변수 출력하기
		
		System.out.println(var1);
		
		// 강제 형 변환
		
		double k = 3.141592;
		
		j = j + (int)k;
		System.out.println("j:"+ j + "\nk:" + k);
	}

}

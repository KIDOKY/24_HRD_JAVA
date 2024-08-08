package day03;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {
		
		// 문자열 데이터 4개를 저장할 배열 선언 및 초기화
		String[] season = { "Spring", "Summer", "Fall", "Winter"};
		for(int i = 0; i < 4; i++) {
			System.out.println(season[i]);
		}
		
		/*
		//배열의 항목값 읽기
		System.out.println("season[0] : " + season[0]);
		System.out.println("season[1] : " + season[1]);
		System.out.println("season[2] : " + season[2]);
		System.out.println("season[3] : " + season[3]);		
		*/
		
		//인덱스 1번 항목의 값 변경
		season[1] = "여름";
		
		for(int i = 0; i < 4; i++) {
			System.out.println(season[i]);
		}
		
		// 이름 문자열 3개를 저장할 배열 선언 및 초기화
		String[] names = null;
		
		names = new String[] {"KIDOKY", "아신", "타키오"};
		
		for(int i= 0; i < 3; i++) {
			System.out.println(names[i]);
		}
		
	}

}

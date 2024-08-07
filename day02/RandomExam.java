package day02;
import java.util.Random;
public class RandomExam {

	public static void main(String[] args) {
		// 임의의 수를 생성과 수를 다루는 내장 객체 -> Random 클래스
		// 참조형 변수 선언으로 생성한다.
		Random ran = new Random();
		
		// 1 ~ 5번까지 수 생성하기
		
		for(int i = 1; i <= 6; i++) {
			int num = ran.nextInt(45) + 1;
			System.out.println(num);
		}
	}
		
}

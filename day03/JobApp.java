package day03;
import java.util.Scanner;

public class JobApp {

	public static void main(String[] args) {
		
		
		//person 객체 생성
		
		Person hong = new Person();
		hong.age = 20;
		hong.name = "홍길동";
		hong.먹다();
		hong.웃다();
		
		System.out.println("****");
		
		Scanner sc = new Scanner(System.in);
	}

}

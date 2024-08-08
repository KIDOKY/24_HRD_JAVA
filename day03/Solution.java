package day03;
import java.util.Scanner;
public class Solution {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				System.out.print("문자열(String)과 횟수(int)를 입력하시오: ");
				String str = sc.next();
				int n = sc.nextInt();
				
				for(int i = 1; i <= n; i++) {
					System.out.print(str);
				}

	}

}

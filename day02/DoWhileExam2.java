package day02;
import java.util.Scanner;
public class DoWhileExam2 {

	public static void main(String[] args) {
		
		int i = 1;
		while(i <= 10) {
			i++;
			if(i % 2 != 0) {
				continue;	//무시
			}
			System.out.print(i+ " ");
		}
		
	}
		
}

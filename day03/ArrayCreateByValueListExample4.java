package day03;
import java.util.Scanner;
public class ArrayCreateByValueListExample4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int studentNum = 0;
		int [] scores = null;
		
		int maxScore = 0;
		double avgScore = 0.0;
		int sum = 0;
		
		while (true) {
			
			System.out.println("------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(sc.nextLine());
		
			if(selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(sc.nextLine());
				scores = new int[studentNum];
					
			}else if(selectNo == 2) {
				for(int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = Integer.parseInt(sc.nextLine());
				}
			}else if(selectNo == 3) {
				for(int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]: " + scores[i]);
				}
			}else if(selectNo == 4) {
				maxScore = scores[0];
				for(int i = 0; i < scores.length; i ++) {
					if(scores[i] > maxScore) {
						maxScore = scores[i];
					}
					sum += scores[i];	
				}
				avgScore = (double) sum / scores.length;
				System.out.println("최고 점수: " + maxScore);
				System.out.println("평균 점수: " + avgScore);
			}else if(selectNo == 5) {
				System.out.println("프로그램 종료");
			}
		}
	}	
}

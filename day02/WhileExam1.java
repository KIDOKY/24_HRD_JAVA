package day02;

public class WhileExam1 {

	public static void main(String[] args) {
		// 0에서 100까지 짝수들의 총합을 계산하여 출력하시오.
		
		int i = 0, sum = 0;	//초기식
		
		while (i <= 100) {	//조건식
			// i가 짝수인지 조건 판단하여 맞으면 누적, 그렇지 않으면 무시
			if(i % 2 == 0) {
				sum = sum + i;
			}
			i++;	//증감식
		}
		System.out.println("0에서 100까지 짝수들의 합: " + sum);
	}
		
}

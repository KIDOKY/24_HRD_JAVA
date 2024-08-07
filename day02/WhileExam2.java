package day02;

public class WhileExam2 {

	public static void main(String[] args) {
		// 0에서 100까지 짝수들의 총합을 계산하여 출력하시오.
		
		int num = 20;	//초기식
		
		while (num > 10) {	//조건식
			System.out.println(num--);
			}
		
			boolean flag = true;
			while(flag) {
				num--;
				if(num == 3) {
					System.out.println("num = 3 종료");
					flag = false;
				}
		}
	}
		
}

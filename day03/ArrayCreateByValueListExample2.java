package day03;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		
		// 2차원 배열
		
		int[][] scores = new int[2][3];
		
		scores[0][0] = 90;
		scores[0][1] = 50;
		scores[0][2] = 80;
		scores[1][0] = 100;
		scores[1][1] = 70;
		scores[1][2] = 90;
		
		int sum = 0;
		double avg = 0.0;
		int totalStudent = 0;
		for (int i = 0; i < scores.length; i++) {
			totalStudent += scores[i].length;
			for(int j = 0; j < scores[i].length; j++) {
				sum = sum + scores[i][j];
			}
		}
		System.out.println(totalStudent);
		avg = sum / totalStudent;
		System.out.println("총점: " + sum + ", 평균:" + avg);
	}

}

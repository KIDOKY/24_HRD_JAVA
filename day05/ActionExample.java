package day05;

// 확인 문제 5번
interface Action {
	public void work();
}

public class ActionExample {

	public static void main(String[] args) {
		
		Action action = new Action() {
			public void work() {
				System.out.println("복사를 합니다.");
			}
		};
		
		action.work();
	}

}

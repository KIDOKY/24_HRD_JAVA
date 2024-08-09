package day04;

public class Phone {
	
	public String model;
	public String color;
	
	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
		System.out.println("부모클래스생성자 실행입니다.");
	}
	
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	public void sendVoice(String message) {
		System.out.println("자기: " + message);
	}
	
	public void receiveVoice(String message) {
		System.out.println("상대방: " + message);
	}
	
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}

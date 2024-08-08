package day03;

public class Member {
	
	String name;
	String id;
	String password;
	int age;
	
	// 기본 생성자
	public Member () {
		
	}
	
	// 인자 생성자....
	public Member(String name, String id) {
		this.name = name;
		this.id = id;
	}
}

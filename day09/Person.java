package day09;

public class Person {
	// 은닉화...
	private String name;
	private String phone;
	private String email;
	private int age;
	
	public Person() {
		
	}
	
	// 인자 생성자..
	public Person(String name, String phone, String email, int age) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

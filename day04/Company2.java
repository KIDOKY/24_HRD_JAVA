package day04;

public class Company2 {
	// 객체 모델링(클래스 멤버)
	
			// 속성 : has - a
			int age;
			String name;
			char gender;	// 'F', 'M'
			String tel;
			
			// 기본 생성자
			public Company2() {
				
			}
			
			// 메소드 getInfo()
			void getComInfo() {
				System.out.println(this.name + "님 정보------");
				System.out.println("나이:" + this.age);
				System.out.println("성별: " + this.gender);
				System.out.println("전화번호: " + this.tel);
				System.out.println("-------------------------");
			}
}

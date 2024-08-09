package day04;

public class Person2 {

		
		// 객체 모델링(클래스 멤버)
		
		// 속성 : has - a
		int age;
		String name;
		char gender;	// 'F', 'M'
		String tel;
		
		// 기본 생성자
		public Person2() {
			
		}
		
		// 메소드 getInfo()
		void getInfo() {
			System.out.println(this.name + "님 정보------");
			System.out.println("나이:" + this.age);
			System.out.println("성별: " + this.gender);
			System.out.println("전화번호: " + this.tel);
			System.out.println("-------------------------");
		}
		
		// 메소드
		void 웃다() {
			System.out.println("웃는다.");
		}
		void 먹다() {
			System.out.println("먹는다.");
		}
		
		
		/*public String showProfile() {
			String info = "---" + name + " 프로필-----";
			info += "\n나이";
		}*/
	
}


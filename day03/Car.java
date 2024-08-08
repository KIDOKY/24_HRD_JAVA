package day03;

public class Car {
		
		// 필드 선언

		String company;
		String model;
		String color;
		int maxSpeed;
		int wheelinch;
		
		int rpm;
		int speed;
		
		// 생성자 선언
		public Car() {
			
		}
		
		public Car(String company, String model, String color, int maxSpeed) {
			this.company = company;
			this.model = model;
			this.color = color;
			this.maxSpeed = maxSpeed;
		}
		
		public Car(String company, String model, String color) {
			this(company, model, color, 200);
		}
		
		// 메소드 선언
		void CarInfo() {
			System.out.println("====================");
			System.out.println("제조회사: " + company);
			System.out.println("모델: " + model);
			System.out.println("색깔: " + color);
			System.out.println("최고속도: " + maxSpeed);
			System.out.println("휠 인치: " + wheelinch);
			System.out.println("====================");
		}
	
}


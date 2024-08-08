package day03;

public class CarExam {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		myCar.color = "노랑";
		myCar.company = "현대";
		myCar.model = "제네시스";
		myCar.maxSpeed = 200;
		myCar.wheelinch = 16;

		// 메소드 호출
		myCar.CarInfo();
		
		Car myCar2 = new Car("기아", "K7", "검정", 200);
		
		myCar2.CarInfo();
	}

}

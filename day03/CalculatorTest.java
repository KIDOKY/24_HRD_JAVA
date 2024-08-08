package day03;

public class CalculatorTest {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		cal.x = 150;
		cal.y = 30;
		
		// 메소드 호출1
		System.out.println("더하기: " + Calculator.add(100, 40));
		cal.minus(100, 40);
		System.out.println("곱하기: " + cal.multi());
		cal.div();
		
		// 정사각형의 넓이 구하기
		//double result = cal.areaRect(10);
		double result = 10 * 10 * Calculator.pi;
		
		// 직사각형의 넓이 구하기
		double result1 = cal.areaRect(10, 20);
		
		System.out.println("정사각형의 넓이: " + result);
		System.out.println("직사각형의 넓이: " + result1);
	}

}

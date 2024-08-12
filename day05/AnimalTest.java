package day05;

abstract class Animal {
	// 추상 클래스.. 적어도 한 개 이상의 추상 메소드를 갖는 클래스
	// 추상 메소드: {} 바디가 없는 메소드
	
	abstract void sound();
}

class Dog extends Animal {

	@Override
	void sound() {
		System.out.println("멍멍 소리낸다.");
		
	}
	
}

class Cat extends Animal {

	@Override
	void sound() {
		System.out.println("야옹 소리낸다.");
		
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		
		Animal animal = new Dog();
		animal.sound();
		
		Animal animal2 = new Cat();
		animal2.sound();
	}

}

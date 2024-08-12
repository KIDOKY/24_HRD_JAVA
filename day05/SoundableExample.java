package day05;

interface Soundable {
	public String sound();
}

class Dog1 implements Soundable {

	@Override
	public String sound() {
		return "멍멍";
	}

	
	
}

class Cat1 implements Soundable {

	@Override
	public String sound() {
		return "야옹";
	}
	
}

public class SoundableExample {
	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	public static void main(String[] args) {
		
		SoundableExample.printSound(new Dog1());
		SoundableExample.printSound(new Cat1());
	}

}

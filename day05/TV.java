package day05;

interface Remocon {
	public void powerOn();
}
public class TV implements Remocon{
	public void powerOn() {
		System.out.println("TV를 켰습니다.");
	}
	

	public static void main(String[] args) {
		
		Remocon r = new TV();
		r.powerOn();

	}

}

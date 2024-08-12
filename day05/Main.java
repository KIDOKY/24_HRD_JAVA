package day05;

interface weapon {
	public void work();
}

interface kitchenutensils {
	public void work();
}

class bow implements weapon{
	public void work() {
		System.out.println("활 작동");
	}
}

class knife implements kitchenutensils, weapon {
	
	@Override
	public void work() {
		System.out.println("칼 작동");
	}
}

public class Main {

	public static void main(String[] args) {
	
	bow weapon1 = new bow();
	knife weapon2 = new knife();
	
	weapon1.work();
	weapon2.work();
	
	weapon [] weapons = new weapon[2];
	
	weapons[0] = weapon1;
	weapons[1] = weapon2;
	
	for(int i = 0; i < weapons.length;i++) {
		weapons[i].work();
	}
	}

}

package day06;

// 쇼핑몰 규격을 정의한 인터페이스,
// 모든 쇼핑몰은 IShop 인터페이스를 구현해야 함.

public interface IShop {
	
	public void setTitle(String title);
	public void genUser();
	public void genProduct();
	public void start();
}

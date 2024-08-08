package day03;

public class Printer {
	
	Printer printer = new Printer();
	
	
	public void println(int x) {
		printer.println(10);
	}
	
	public void println(boolean x) {
		printer.println(true);
	}
	
	public void println(double x) {
		printer.println(5.7);
	}
	
	public void println(String x) {
		printer.println("홍길동");
	}
}

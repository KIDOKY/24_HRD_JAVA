package day08;
import java.io.*;
import java.net.Socket;
import java.util.Scanner;
public class ProductClient {
	//필드
	private Socket socket;
	private DataInputStream dis;
	private DataOutputStream dos;
	private Scanner scanner;
	
	//메소드: 서버 연결
	public void start() throws IOException {
		//서버 연결하기
		socket = new Socket("localhost", 50001);
		dis = new DataInputStream(socket.getInputStream());
		dos = new DataOutputStream(socket.getOutputStream());
		System.out.println("[클라이언트] 서버에 연결됨");
		scanner = new Scanner(System.in);
		// 상품 목록 보여주기
		list();
	}
	
	// 메소드: 메뉴
	public void menu() throws IOException {
		System.out.println();
		System.out.println("--------------------------------------------------");
		System.out.println("메뉴: 1.Create | 2.Update | 3.Delete | 4.Exit");
		System.out.println("선택: ");
		String menuNo = scanner.nextLine();
		System.out.println();
		switch (menuNo) {
		case "1":
			break;
		case "2":
			break;
		case "3":
			break;
		case "4":
			break;
		}
	}
	public void stop() {
		try {
			socket.close();
			
		} catch(Exception e) {
			
		}
	}
	public static void main(String[] args) {
		
	}

}

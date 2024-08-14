package day07;

import java.net.*;
import java.io.*;

public class ServerExample {

	// ServerSocket 객체 선언
	static ServerSocket ser = null;
	static Socket sock = null;	// 클라이언트와의 접속 후 통신하는 객체
	static DataInputStream dis = null;
	static DataOutputStream dos = null;
	
	public static void startServer() throws IOException {
		
		System.out.println("클라이언트의 접속을 기다리는 중~~");
		ser = new ServerSocket(5555);
		sock = ser.accept();
		System.out.println("클라이언트와의 접속 성공~~~");
		
		dos = new DataOutputStream(sock.getOutputStream());
		String message = "반갑습니다.";
		dos.writeUTF(message);
		dos.flush();
	}
	
	public static void main(String[] args) throws IOException {
		
		startServer();
	}

}

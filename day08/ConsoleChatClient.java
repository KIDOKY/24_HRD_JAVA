package day08;
import day07.ConsoleChatServer;
import java.io.*;
import java.net.*;

public class ConsoleChatClient implements Runnable{
	
	// Socket 클래스
	// DataIn,out 객체
	Socket socket = null;
	
	public ConsoleChatClient() {
		
		try {
			socket = new Socket("192.168.0.3", 50001);	// 127.0.0.1
			System.out.println("서버와 연결 성공~");
			BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter pout = new PrintWriter(socket.getOutputStream(), true);
			
			// 서버가 보내주는 메시지를 계속 듣는 스레드 동작
			Thread thread = new Thread(this);
			thread.start();
			///////////////////////////////////////////////////
			String msg = "";
			while((msg = key.readLine()) != null) {
				pout.println(msg);
			}
		} catch(IOException e) {
			
		}
	}
	
	public static void main(String[] args) {
		
		new ConsoleChatClient();
	}

	@Override
	public void run() {
		try {
			InputStream is = socket.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String serverMsg = "";
			while(true) {
				System.out.print("입력>>");
				serverMsg = br.readLine();
				System.out.println("From Server: " + serverMsg);
			}
		} catch (Exception e) {
			System.out.println("예외: " + e.getMessage());
		}
	}

}

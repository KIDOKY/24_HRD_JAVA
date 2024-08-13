package day06;
import java.io.IOException;
import java.io.*;

/*
 * 	DataOutputStream: 보조 스트림
 * 	자바의 다양한 자료형(Data Type)들을 바이트 단위로 분해하여
 *  쓰기 작업을 한다.
 *  DataInputStream과 짝을 이뤄 사용한다.
 */

public class DataInOutStream {
	
	static DataOutputStream dos = null;
	static DataInputStream dis = null;
	
	public static void main(String[] args) {
		try {
			//dis = new DataInputStream(System.in);
			dos = new DataOutputStream(System.out);
			dos.writeInt(10);
			dos.writeDouble(155.5);
			dos.writeBoolean(true);
			dos.writeChar('가');
			dos.writeUTF("문자열 입력하기");
			
			System.out.println("정수값: " + dis.readInt());
			System.out.println("실수값: " + dis.readDouble());
			System.out.println("논리값: " + dis.readBoolean());
			System.out.println("문자값: " + dis.readChar());
			System.out.println("문자열값: " + dis.readUTF());
			
		} catch(IOException e) {
			e.getMessage();
		}
		

	}

}

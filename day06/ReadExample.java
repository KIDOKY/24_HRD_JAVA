package day06;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {
	
	public static void main(String[] args) throws IOException {
		
		try {
			Reader reader = null;
			reader = new FileReader("file.txt");
			
			while(true) {
				int data = reader.read();
				if(data == -1)
					break;
					System.out.println((char)data);
			}
			reader.close();
			System.out.println();
			
			// 문자 배열로 읽기
			reader = new FileReader("test.txt");
			char[] data = new char[100];
			
			while(true) {
				int num = reader.read(data);
				if(num == -1)
					break;
					for(int i = 0; i < num; i++) {
						System.out.println(data[i]);
					}
					reader.close();
					System.out.println();
			}
			
		}catch(FileNotFoundException fe) {
			System.out.println("파일이 존재하지 않습니다.");
		}
		
	}

}

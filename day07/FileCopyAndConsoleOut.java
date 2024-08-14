package day07;
// 데이터 소스: 파일
// 데이터 목적지: 파일, 콘솔
// FileReader, FileWriter, BufferedReader, BufferedWriter
// 파일 복사 기능 구현하기
import java.io.*;

public class FileCopyAndConsoleOut {
	
	public static void main(String[] args) {
		
		String fileName = "copy.txt";
		
		try {
			FileReader fr = new FileReader("Fileout.java");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);
			OutputStreamWriter osw = new OutputStreamWriter(System.out);
			
			int n = 0;
			
			while((n = br.read()) != -1) {
				
				bw.write(n);
				bw.flush();
				osw.write(n);
				osw.flush();
			}
			
			br.close();
			bw.close();
			osw.close();
			
			
		} catch(Exception e) {
			
		}
	}
}

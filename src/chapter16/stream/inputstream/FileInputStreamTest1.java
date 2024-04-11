package chapter16.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//입출력스트림을 바이트단위로 작업하는 옞[
//input.txt 내용을 읽어오는 작업.
public class FileInputStreamTest1 {

	public static void main(String[] args) {
		
		//읽기(입력), 바이트단위, 파일
		FileInputStream fis = null;
		
		//예외처리
		try {
			// fis객체 : 연결통로(빨대)
//			fis = new FileInputStream("C:\\Dev\\Lecture\\JavaWork\\study\\src\\chapter16\\stream\\inputstream\\input.txt");
			// study 프로젝트밑에 input.txt파일을 위치해야 동작됨.
			fis = new FileInputStream("input.txt"); //input.txt 파일이 존재하지 않으면, 예외발생이 되기때문에 문법적으로 예외작업 규칙이 존재		
			
			System.out.println((char)fis.read()); //a
			System.out.println((char)fis.read()); //b
			System.out.println((char)fis.read()); //c
			
			
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(fis != null) {
				try {
					fis.close();
				}catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("프로그램 종료");
	}
	
}

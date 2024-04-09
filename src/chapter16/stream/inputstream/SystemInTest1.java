package chapter16.stream.inputstream;

import java.io.IOException;

// 표준입출력 스트림 : 키보드로 입력받고, 화면(모니터)에 출력하는 기능을 지원목적.
public class SystemInTest1 {

	public static void main(String[] args) {
		
		System.out.println("알파벳 하나를 입력하고, [Enter]를 누르세요.");
		
		int i;
		
		try {
			
		// System.in.read() 구문이 실행이 되면, 사용자가 키보드로 입력할 때 대기상태에 존재한다.
		// 키보드로 입력하고 Enter를 치면, 입력한 데이터가 버퍼(임시기억장소)에 저장이 된다.
		// System.in 표준입력스트림이 읽어온다.
			
		i = System.in.read();
		System.out.println(i);
		System.out.println((char)i);
	} catch(IOException e) {
	
		e.printStackTrace();
	}

	}	
}

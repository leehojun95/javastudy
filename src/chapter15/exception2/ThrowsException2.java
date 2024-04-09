package chapter15.exception2;

//예외전가(예외처리 미루기)
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException2 {

	//예외전가 : 메서드안에서 예외가 발생시 자체 예외처리를 하지않고 호출한 쪽으로 다시 예외를 돌리는 것을 말함.
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		Class c = null;

		   FileInputStream fis = new FileInputStream(fileName);
		   c = Class.forName(className);

		return c;
	}
	 
	
	
	
	public static void main(String[] args) {
		ThrowsException2 test = new ThrowsException2();
		
		// 이 메서드가 호출하면서, 예외전가에 의하여, 예외를 받으면, 현재 이코드에서 예외처리를 해줘야 한다.
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (FileNotFoundException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(Exception ex) {
			// 최상의 예외클래스는 마지막에 작성
			
		}
	
	}

}

package chapter10.interfaceex2;

//구현 클래스 - > 객체생성
public class CompleteCalc extends Calculator {

	@Override
	public int time(int num1, int num2) {
		
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		
		return num1 / num2;
	}
	
	//디폴트 재정의
	@Override
	public void description() {
	}
	
	

}

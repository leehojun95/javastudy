package chapter10.interfaceex2;

//추상 클래스 : 상속목적으로 설계. 객체생성불 가능
// 부분만 한다면 abstract 을 사용해줘야 된다.
public abstract class Calculator implements Calc {

	//구현되지 않은 추상메서드를 2개상속받은 상태
	
	@Override
	public int add(int num1, int num2) {
		
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		
		return num1 - num2;
	}
	
	

}

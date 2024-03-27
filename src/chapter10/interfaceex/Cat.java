package chapter10.interfaceex;

// 인터페이스를 상속받는 클래스는 implements 사용해야 한다.
//구현클래스라고한다.
public class Cat implements Animal {

	//부모인터페이스의 추상메서드를 구현한다.(구현메서드). 재정의 메서드라고 부를수도 있다.
	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub

	}

}

package chapter9.abstractex;

// 추상클래스를 부모로 상속받으면, 자식클래스는 추상메서드를 반드시 재정의(구현 : implement) 해야한다.(규칙)
public class Cat extends Animal  {
	
	@Override
	void run() {
		System.out.println("사자가 달린다.");

	}

	@Override
	void cry() {
		System.out.println("사자가 표효한다.");

	}
}

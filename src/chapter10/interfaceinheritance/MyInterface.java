package chapter10.interfaceinheritance;

// 클래스가 부모인터페이스를 상속 implements
// 클래스들끼리 상속하기 extends
// 인터페이스끼리 상속하기 extends
public interface MyInterface extends X, Y {
	
	//x(), y() 2개와 myMethod() 1개까지 포함해서 총3개의 추상매서드를 가지고 있는 의미.
	void myMethod();
	

}

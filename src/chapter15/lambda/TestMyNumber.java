package chapter15.lambda;


//인터페이스를 이용한 구현클래스
class Test implements MyNumber{

	public int getMax(int num1, int num2) {
		
		if(num1 > num2) {
			return num1;
		}else {
			return num2;
		}
	}
}
public class TestMyNumber {

	public static void main(String[] args) {
		
		// 방법1> 인터페이스를 설계하고, 상속받아 구현클래스를 만들고 사용하는 기본적인형태.
		Test t1 = new Test();
		System.out.println(t1.getMax(10, 20));
		
		// 방법2> 함수형인터페이스 일 경우에만 람다식문법으로 추상메서드를 구현
		// 함수형인터페이스의 추상메서드를 람다식문법으로 표현
		/*
		인터페이스 변수 = 추상메서드를 구현한 람다식문법코딩
		*/
		MyNumber max = (x, y) -> (x >= y) ? x: y;
		System.out.println(max.getMax(10, 20));

	}

}

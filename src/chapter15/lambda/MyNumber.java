package chapter15.lambda;

//함수형 인터페이스 : 추상메서드 단 1개를 가지고 있는 인터페이스
//@FunctionalInterface : 인터페이스가 추상메서드를 1개 일 경우에만 사용가능.
@FunctionalInterface //@이름 : Annotation
public interface MyNumber {

	//추상메서드
	int getMax(int num1, int num2);
	
	//함수형 인터페이스에 추상메서드 추가하면 에러발생
//	int( sum(int a, int b));
}

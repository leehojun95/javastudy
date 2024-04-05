package chapter15.lambda;

//객체생성 불가능, 상속을 목적을 한 설계도
//함수형인터페이스 : 추상메서드 1개를 가지고 있ㄴㄴ 인터페이스
// 람다식 문법을 사용가눙.
@FunctionalInterface
public interface StringConcat {

	public void makeString(String s1, String s2);
}

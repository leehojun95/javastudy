package chapter15.lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		// 구현클래스를 객체생성항 사용.
		
		String s1 ="Hello";
		String s2 ="World";

		// 1) StringConCatImpl인터페이스를 구현한 클래스 객체 생성(기본적인 사용)
		StringConCatImpl concat1 = new StringConCatImpl();
		concat1.makeString(s1, s2);
		
		// 2)StringConcat함수형인터페이스ㅇ,; makeString()추상메서드를 람다식문법으로 사용.
		StringConcat concat2 = (s, v) ->System.out.println(s1 + "," + s2);
		concat2.makeString(s1, s2);
		
		// 3)익명구현개채로 사용(일회성). 다른 파일에서 아래내용을 참조 할 수 가없다.
		StringConcat Concat3 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + "," + s2);
				
			}
		};
		
		Concat3.makeString(s1, s2);
		
	}

}

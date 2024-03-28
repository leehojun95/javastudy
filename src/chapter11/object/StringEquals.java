package chapter11.object;

// 문자열 비교.
public class StringEquals {

	public static void main(String[] args) {
		
		//기본데이터타입 사용법처럼 사용가능. int a =100;
		//String name = "홍길동";
		
		// String은 클래스이므로, 참조타입처럼 사용
		String str1 = new String("abc");
		String str2 = new String("abc");

		// == 비교연산자는 주소값을 비교가능
		System.out.println(str1 == str2); // false
		//Ojbect클래스의 equals()메서드를 String클래스가 힙영역의 값 비교로 재정을 해서 제공되괴 있다.
		System.out.println(str1.equals(str2));
		
		//데이터 비교시
		/*
		  - 기본데이터타입은 == 비교
		  - 문자열데이터타입(String)은 equals()메서드 사용
		 */
		
		int a =100;
		int b =100;
		if(a == b) {
			System.out.println("a 와 b는 데이터가 동일하다.");
		}else {
			System.out.println("a 와 b는 데이터가 동일하지않다.");
		}
		
		String name1 = "홍길동";
		String name2 = "홍길동";
		//String클래스이므로 == 주소값 비교가 진행된다.
		if(name1 == name2) {
			System.out.println("name1 와 name2는 동일하다.");
		}else {
			System.out.println("name1 와 name2는 동일하지않다.");
		}
		
		// 재정의도어, 문자열 데이터비교
		if(name1.equals(name2)) {
			System.out.println("name1 와 name2는 동일하다.");
		}else {
			System.out.println("name1 와 name2는 동일하지않다.");
		}
	}

}

package chapter11.string;

//String클래스 : 문자열 데이터를 관리
public class StringTest1 {

	public static void main(String[] args) {
		
		// 1)이 표현형태는 힙영역에 메모리가 각각 생성된다.
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2); // 주고비교로 false 결과.
		System.out.println(str1.equals(str2)); // 문자열비교로 true 결과.
		
		//2)이 표현형태로 사용하면, 힙영역에 "abc"라는 문자열데이터가 한번이라도 상용이 되어 있으면, 재사용한다.
		//주소가 동일하게 된다.
		String str3 = "abc";
		String str4 = "abc"; //"abc" 기억장소를 재사용한다.
		
		System.out.println(str3 == str4); // ture
		System.out.println(str3.equals(str4)); //true
	}
}

package chapter2;

public class CharacterEx3 {

	public static void main(String[] args) {
		// 문자형 데이터타입 : char(2)
		// char 데이터타입으로 만든 기억장소에는 값은 ''(작은따옴표)로 표현한다.
		// 문자1개 코딩해야한다.
		// 문자로 저장되지만, 내부적으로는 숫자의 의미를 가지고 있다.
		//문자로 해석하여 사용된다.
		//아스키, 유니코드 사용, 유니코드값은 0 ~ 65535범위로 사용.
		
		//문자1개를 저장
		char ch1 = 'A';
		System.out.println(ch1);  //문자출력 A로출력
		System.out.println((int)ch1);  //문자에 해당하는 숫자값 출력
		
		// 숫자로 저장.
		char ch2 = 66;
		System.out.println(ch2); //문자출력 B로출력
		
		int ch3 = 67;
		System.out.println(ch3); //숫자출력 67출력
		System.out.println((char)ch3); //문자출력 C로출력

	}

}

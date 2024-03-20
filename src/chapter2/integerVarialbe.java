package chapter2;

public class integerVarialbe {

	public static void main(String[] args) {
		// 정수형 데이터 타입 : byte(1), short(2), int(4), long(8)
		// 크기를 이용하여 기억장소를 생성한다.
		// 예로 byte 는 1바이트로 기억장소를 생성한다.
		// byte는 8bit로 구성되어있다.
		// bit는 0, 1인 2진수값으로 저장하도록 설계되어있어
		
		byte bVal = 20;
		short sVal = 10;
		
		System.out.println(sVal + bVal);
		
		// long 데이터를 저장할 경우에는 숫자데이터 끝부분에 알파벳 L or l을 기입힌다.
		long lVal = 12345678900L;
		
		System.out.println(lVal);

	}

}

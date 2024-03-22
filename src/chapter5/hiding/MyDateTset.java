package chapter5.hiding;

// default 필드는 동일한 패키지는 일경우는 접근
//MyDate클래스를 사용하는 현재 입자에서 동일한 패키지 일 경우에는 default 이상은 접근이 가능하다.
public class MyDateTset {

	public static void main(String[] args) {
		MyDate date = new MyDate();
		date.day = 1; // public
		date.month = 10;// default는 public
//		date.year = 2024; private접근자로 되어있기때문에 접근이 안되는 특징이 있다.

	}

}

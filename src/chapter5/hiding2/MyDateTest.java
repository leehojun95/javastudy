package chapter5.hiding2;

import chapter5.hiding.MyDate;


//default 필드는 동일한 패키지는 일경우는 접근이 안된다.
public class MyDateTest {

	public static void main(String[] args) {
		//import구문때문에 chapter5.hiding 패키지를 생략가능할수가 있다.
		MyDate date1 = new MyDate();
		MyDate date2 = new MyDate();
		MyDate date3 = new MyDate();
		MyDate date4 = new MyDate();
		MyDate date5 = new MyDate();
		
		date1.day = 1; //public
		//date1.month = 10; //default는 private

	}

}

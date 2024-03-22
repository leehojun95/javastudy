package chapter5.hiding;

//접근자 - 4가지 유형
/*
 private : 접근 금지.
 접근자 사용안함. default
 public : 접근 허용
 protected < default < public
 default 필드는 동일한 패키지 일경우는 접근이되고(public), 다른 패키지에서는 접근이 안된다.(private)
 */

public class MyDate {
	public int day;
	int month;
	private int uear;

}

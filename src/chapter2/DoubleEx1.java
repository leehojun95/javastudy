package chapter2;

public class DoubleEx1 {

	public static void main(String[] args) {
		//실수형 데이터타입이 부동소수점방식으로 표현하여, 오차를 일으키는 예제.
		double dnum = 1; //1D or 1d 가 붙는다(자동으로)
		
		for(int i=0; i<10000; i++) {
			dnum = dnum + 0.1;
		}
		
		System.out.println(dnum); //1001.000000000159
	}

}

package chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {
		
		//큰데이터타입 = 작은데이터타입 (가능)
		//작은데이터타입 = 큰데이터타입 (불가능)  ->  작은데이터타입 = (좌측데이터타입)큰데이터타입 (가능)
		
		double dNum1 = 1.2; //해석 : double dNum1 = 1.2d;
		float fNum2 = 0.9f;
		
		int iNum3 = (int) dNum1 + (int)fNum2; //실수값이 정수로 변환되면 소수부분은 버려진다(내림)
		int iNum4 = (int) (dNum1 + fNum2);
		
		System.out.println(iNum3); //1
		System.out.println(iNum4); //2

	}

}

package chapter11.wrapper;

//Wrapper클래스
/*
 기본데이터타입을 객체관점으로 사용할 때 기능을 제공한다.
 
 기본데이터타입           Wrapper클래스
 boolean              Boolean
 byte                 Byte
 char                 Char
 short                Short
 int                  Int
 long                 Long
 float                Float
 double               Double
 */

public class IntegerTest {

	public static void main(String[] args) {
		
		//Boxing과UnBoxing
		//Boxing : 기본형을 객체형으로 변환하여 사용될 때
		//UnBoxing : 객체형을 기본형으로 꺼내오는 것.
		
		//참조타입클래스 = 기본데이터 타입값
		// 100데이터가 힙영역에 기억장소를 생성하고, 들어가는 과정을 Boxing 형변환 이 진행된다.
		Integer num = 100;  //Boxing
		int iNum = num.intValue(); //Integer클래스에서 정수값만 가져옴. UnBoxing
        int jNum = 200;
        
        int sum = iNum + jNum;
        System.out.println(sum);
	}

}

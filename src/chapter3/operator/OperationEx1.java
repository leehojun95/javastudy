package chapter3.operator;

// 산술연산자 : +, -, *, /, %
public class OperationEx1 {

	public static void main(String[] args) {
		int mathScore = 90;
		int engScore = 75;
		
		int totalScore = mathScore + engScore;
		
		System.out.println(totalScore);  //165
		
		// totalScore / 2;    해석 : int형끼리 연산하면 결과는 int가 된다.
		// double avgScore = totalScore / 2; 소수점까지 평균을 구하지 못한다.
		
		double avgScore = totalScore / 2.0;  // 해석 (double)totalScore / 2.0;
		System.out.println(avgScore);

	}

}

package chapter4.ifexample;

//단일if문 : 조건식이 1개일 때 사용
public class IfExample {

	public static void main(String[] args) {
		
		boolean isMarried = true;
		
		if(isMarried) {
			System.out.println("기혼입니다.");
		}
		
		boolean isEven;
		int num =10;
		
		// 해석 : (num % 2 ==0) 코드가 true이면 true가 대입, false이면 false가 대입
		isEven = (num % 2 ==0)? true:false;
		System.out.println(isEven);

	}

}

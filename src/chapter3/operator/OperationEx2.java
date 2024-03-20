package chapter3.operator;

// 증감연산자 ++, --
// 변수앞 또는 변수뒤에 사용하느냐에 따라 동작(해석) 달라진다.
public class OperationEx2 {
	
	//main -> Ctrl + Space bar = public static void main(String[] args)
	public static void main(String[] args)  {
		
		int gameScore = 150;
		
		//++변수 앞에 사용되면, +1을 변수에 적용한 후 값을 읽어온다.
		int lastScore1 = ++gameScore;
		System.out.println(lastScore1); // 151
		
		//--변수 앞에 사용되면, -1을 변수에 적용한 후 값을 읽어온다.
		int lastScore2 = --gameScore;
		System.out.println(lastScore2); // 150
		

	}

}

package chapter4.loopexample;

//중첩for문을 이용한 구구단 예제
public class GuGuDan {

	public static void main(String[] args) {

		for(int i = 0; i <= 9; i++) { 
			for(int j=2; j <=9; j++) { 
				if(i == 0) {
					System.out.print(j + "단" + "\t");
					continue;
				}
				System.out.print(j + "*" + i + "=" + (j*i) + '\t'); // print = 줄바꿈 없음 , \t 띄어주기
			}
			System.out.println();
		}
	}

}

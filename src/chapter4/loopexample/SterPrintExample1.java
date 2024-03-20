package chapter4.loopexample;

// 별찍기 : 2차원배열
public class SterPrintExample1 {

	public static void main(String[] args) {
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("=========================================");
		
		//별찍기 : 삼각형
		for(int i=1; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

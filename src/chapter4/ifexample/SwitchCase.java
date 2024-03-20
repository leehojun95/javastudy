package chapter4.ifexample;

//선택문 : 다중 if 문과 유사
public class SwitchCase {

	public static void main(String[] args) {
		
		int ranking = 3; //1, 2, 3 기타 이외의 값
		char medalColor;
		
		switch(ranking) {
		case 1: medalColor = 'G';
				break;
		case 2: medalColor = 'S';
				break;
		case 3: medalColor = 'B';
				break;
		default :  //if문의 else 와 유사하다.
			medalColor = 'A';
		}
		
		System.out.println(ranking + "등 메달의 색깔은?" + medalColor + "입니다.");
	}

}

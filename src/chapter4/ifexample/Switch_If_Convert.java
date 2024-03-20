package chapter4.ifexample;

// switch 문을 다중 if문으로 변경
public class Switch_If_Convert {

	public static void main(String[] args) {
		
		int ranking = 3;
		char medalColor;
		
		if(ranking == 1) {
			medalColor = 'G';
		}else if(ranking == 2) {
			medalColor = 'S';
		}else if(ranking == 3) {
			medalColor = 'B';
		}else{
			medalColor = 'A';
		}
		System.out.println(ranking + "등 메달의 색깔은?" + medalColor + "입니다.");

	}

}

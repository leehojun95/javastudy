package chapter14.genetics2;

public class Power extends Material {

	public void doPrinting() {
		System.out.println("Power 재료로 출력합니다.");
	}
	
	@Override
	public String toString() {
		return "재료는 Power입니다.";
	}
}

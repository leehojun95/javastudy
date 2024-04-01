package chapter14.genetics3;

public class GennericMethod {
	
	//제너릭 메서드 문법형식
	// <T, V> : 메서드 타입파라미터
	// 제너릭메서드 호출 GennericMethod.<Integer, Double>makeRectangle(null, null)
	// <T, V>double makeRectangle(Point<Integer, Double> p1, Point<Integer, Double> p2)
	public static <T, V>double makeRectangle(Point<T,V>p1, Point<T,V>p2){
		double left = ((Number)p1.getX()).doubleValue();
		double right = ((Number)p2.getX()).doubleValue();
		double top = ((Number)p2.getY()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		
		double width = right - left;
		double height = bottom - top;
		
		return width * height;
		
	}

	public static void main(String[] args) {
		
		Point<Integer, Double> p1 = new Point<Integer, Double>(0, 0.0);
		Point<Integer, Double> p2 = new Point<Integer, Double>(10, 10.0);
		
		//제너릭 메서드 호출
		double rect = GennericMethod.<Integer, Double>makeRectangle(p1, p2);
		System.out.println("두 점으로 만들어진 사각형의 넓이는" + rect + "입니다.");
		
		//GennericMethod.<Long, Double>makeRectangle(null, null);


	}

}

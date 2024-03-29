package chapter14.genetics;

// 제네릭 기능이 있는 클래스
// <T> : 타입파라미터  이 클래스를 객체생성시 타입파라미터에는 참조타입만 사용가능.
public class GenericPrinter<T>{
	
	private T material;
	
	//gettr, setter 메서드작업
	public T getMaterial(){
		return material;
	}
	
	public void setMaterial(T material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return material.toString();
	}
	
}

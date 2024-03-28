package chapter10.multiinterfaceex;

//물건을 사다 : 인터페이스
public interface Buy {
	
	void buy();
	
	default void order() {
		System.out.println("구매 주문");
	}

}

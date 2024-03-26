package chapter8.inheritance;

public class VIPCustomer extends Customer {

	//상소
	
	//추가
	private int agentID; // 담당 상담원ID
	double saleRatio; // 할인율
	
	//생성자
	public VIPCustomer() {
		
		//상속
		customerGrade = "VIP";
		bonusRatio = 0.05;
		
		
		// 자신
		saleRatio = 0.1;
		System.out.println("VIPCustomer() 생성자 호출");
	}
	
	//매게변수가 있는 생성자.
	//super : 상속관계에서 부모(상위)클래스를 가리키는 의미.
	public VIPCustomer(int customerID, String cutomerName, int agentiD) {
		//부모의 매개변수가 있는 생성자 호출
		super(customerID, cutomerName);
		
		//부모상속
		customerGrade = "VIP";
		bonusRatio = 0.05;
		
		//자신
		saleRatio = 0.1;
		this.agentID = agentID;
		
		System.out.println("VIPCustomer()생성자 호출");
		
		}
	
	//부모클래스의 메서드이름만 사용하고 냉요은 변경해서 작업하고자할때
	//메서드 재정(overriding)
	
	@Override
	public int calcPrice(int price) {
		System.out.println("VIPCustomer.calcPrice");
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
		
	}

	// private int agentID; getter메서드
	public int getAgentID() {
		return agentID;
	}
}



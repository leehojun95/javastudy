package chapter6.cooperation;
// 책 175P
// 학생이 통학운송수단으로 사용한 버스  
public class Bus {

	public int busNumber; // 번스번호
	public int passengerCount; //승객수
	public int money; // 버스 수입액
	
	// 매개변수가 있는 생성자.
	// 접근자는 리턴타이비없다.(생성자매서드이름은 클래스이름을 사용하라는 규칙)
	public Bus(int busNumber){
		this.busNumber = busNumber;
	}
	/*
	 this.busNumber = busNumber
	 this.busNumber == public int busNumber class에있는 부분(첫번째)
	 busNumber == public Bus(int busNumber) 2번째줄
	*/
	
	//버스에 승객을 태우는 기능
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	//버스의 수입액과 승객인원수 확인
	public void showInfo() {
		System.out.println("버스" + busNumber + "번 승객은" + passengerCount + "명이고, 수입은" + money + "입니다.");
	}
}

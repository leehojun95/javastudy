package chapter5.classpart2;

public class CarExample {

	public static void main(String[] args) {
		// 객체생성
		Car myCar = new Car();  // 현대자동차그룹 차 제품이 생산
		myCar.company = "현대자동차";
		
		//new Car(); 실행이 될때, 힙영역에 생성된 기억장소의 초기값을 확인
		// 힙영역에 생성된 기억장소를 가리킬 때 객체. 필드 예)myCar.speed
		 System.out.println("myCar.company의 값은?" + myCar.company); //null -> 현대자동차
		 System.out.println("myCar.speed의 값은?" + myCar.speed); // 0
		 System.out.println("myCar.model의 값은?" + myCar.model); //null
		 System.out.println("myCar.color의 값은?" + myCar.color); //null
		 System.out.println("myCar.isAircon의 값은?" + myCar.isAircon); //false
		 
		 
		 
		 
		 //생성자 메서드를 사용한 예제 ctrl + 클릭으로 확인
		 Car yourCar = new Car("현대자동차");
		 System.out.println("youtCar.company의 값은? " + yourCar.company);
		 
		 Car childCar = new Car("현대자동차", "노란색");
		 System.out.println("childCar.company의 값은? " + childCar.company);
		 System.out.println("childCar.color의 값은? " + childCar.color);
		 

	}

}

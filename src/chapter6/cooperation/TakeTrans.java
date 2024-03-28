package chapter6.cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		// 2명의 학생객체를 생성
		Student stuJames = new Student(5000, "James");
		Student stuTomas = new Student(10000, "Tomas");
		
		Bus bus = new Bus(100); // Bus 차량번호 100번
		stuJames.takeBus(bus);
		stuJames.showInfo(); // 버스정보 출력
		
		Subway subwayGreen = new Subway("4호선");
		stuTomas.takeSubway(subwayGreen);
		stuTomas.showInfo();

	}

}

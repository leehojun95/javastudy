package chapter5.classpart;

public class PersonTest {

	public static void main(String[] args) {
		// Person클래스 사용 (다른 위치에 Person사용하면 안됨) - 기억장소가 생성된 의미.
		//데이터입[class] 이름 = new 데이터타입이름[class](); -> 클래스를 사용하는 문법
		
		Person ps1 = new Person();
		
		//ps1객체가 가르키는 기억장소표현
		ps1.name = "홍길동";
		ps1.height = 170;
		ps1.weight = 80;
		ps1.gender = 'M';
		ps1.marride = true;
		
		ps1.getPersonInfo();
		
		Person ps2 = new Person();
		
		ps2.name = "홍길서";
		ps2.height = 160;
		ps2.weight = 45;
		ps2.gender = 'W';
		ps2.marride = true;
		
		Person ps3 = new Person();
		
		ps2.name = "홍길남";
		ps2.height = 180;
		ps2.weight = 90;
		ps2.gender = 'M';
		ps2.marride = false;
		
		Person ps4 = new Person();
		
		ps2.name = "홍길북";
		ps2.height = 165;
		ps2.weight = 50;
		ps2.gender = 'W';
		ps2.marride = false;
		
		Person ps5 = new Person();
		
		ps2.name = "홍길중";
		ps2.height = 184;
		ps2.weight = 85;
		ps2.gender = 'M';
		ps2.marride = true;
	}
	

}

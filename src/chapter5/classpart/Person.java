package chapter5.classpart;

// 일반개인정보를 저장하기위한 데이터타입을 설계하는 크래스
// 개인정보 : 이름, 신장, 몸무게, 성별, 결혼유무
public class Person {
	
	//변수설계. -> 필드 : 기억장소
	String name;
	int height;
	double weight;
	char gender;
	boolean marride;
	
	//매서드 : 필드가 만든 기억장소에 접근해서 데이터를 이용한 기능목적.
	public void getPersonInfo() {
		System.out.println("이름 " + name);
		System.out.println("신장(키) " + height);
		System.out.println("몸무게 " + weight);
		System.out.println("성별 " + gender);
		System.out.println("결혼유무 " + marride);
	}

}

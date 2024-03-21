package chapter5.constrtctor;

//생성자 예제(Constructor)
public class Person {
	
	//필드
	String name;
	float height;
	float weight;
	
	//생성자
	// 컴파일과정에서 Person.class 파일에 기본생성자가 자동생성된다.
	
	// 생성자 메서드이름을 만들때 클래스이름을 사용해야 한다.(규칙)
	// 생성자를 수동으로 정의하면, 컴파일과정에서 Person.class 파일에 기본생성자가 자동으로 생성이 안된다.
	/*
	public Person() {
		//코드작성
		System.out.println("생성자 호출");
	}
	*/
	// 매개변수가 있는 생성자를 정의하면, 컴파일과정에서 Person.class 파일에 기본생성자가 자동으로 만들어진다.
	// 힙영역에 생성된 기억장소에 값을 주고자 할때 사용.
	public Person(String n) {
		name = n;
	}
	

	public Person(float h) {
		height = h;
	}

}

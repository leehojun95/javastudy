package chapter5.constrtctor;

public class PersonTest {

	public static void main(String[] args) {
		
		//Person p1 = new Person();
		  Person p1 = new Person("홍길동");
		  
		  p1.height = 50f;
		
		//힙영역에 생성된 Person클래스의 필드값을 확인
		System.out.println(p1.name); //null
		System.out.println(p1.height); //50.0
		System.out.println(p1.weight); //0.0
		
		Person p2 = new Person (50.0f);
		System.out.println(p2.height);
	}

}

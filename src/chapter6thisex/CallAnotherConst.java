package chapter6thisex;

// 다른 생성자를 호출하는 예제

class Person{
	String name;
	int age;
	
	//생성자
	Person(){
		this("이름없음", 1); //생성자끼리호출하는 구문.
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person noName2 = new Person("이름없음", 1);
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person ps1 = new Person("홍길동", 100);
		System.out.println(noName.name);
		System.out.println(noName.age);

	}

}

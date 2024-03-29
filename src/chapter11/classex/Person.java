package chapter11.classex;

public class Person /*extends Object*/ {

	// 필드 2개
	private String name;
	private int age;
	
	
	//생성자 3개
	
	//기본 생성자
	public Person() {}
	
	// String name 필드사용하는 생성자.
	public Person(String name) {
		this.name = name;
	}
	
	// String name, int age 2개 매개변수이용하는 생성자.
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//생성자 3개 까지
	
	
	//getter/setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAgeame() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}

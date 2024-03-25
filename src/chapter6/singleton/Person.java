package chapter6.singleton;

// 싱글턴 패턴지다인으로 설계하라.
public class Person {
	private static Person instance = new Person();
	
	private Person() {}
	
	public static Person getInstance() {
		if (instance == null) {
			instance = new Person();
		}
		return instance;
	}
}

package chapter6.singleton;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p1 = Person.getInstance();
		Person p2 = Person.getInstance();
		System.out.println(p1 == p2);

	}

}

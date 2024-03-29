package chapter11.classex;

//Class객체를 생성하는 방법
public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		// chapter11.classex 의 Person이 아닌 Person.class가르키고있다.
		Person person = new Person();
		//1)
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName());
		
		//2)
		Class pClass2 = Person.class; // 직접클래스파일을 사용한다.
		System.out.println(pClass2.getName());
		
		//3)
		Class pClass3 = Class.forName("chapter11.classex.Person");
		System.out.println(pClass3.getName());
	}

}

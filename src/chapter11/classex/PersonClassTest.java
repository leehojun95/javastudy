package chapter11.classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class PersonClass = Class.forName("chapter11.classex.Person");
		
		//Person클래스의 생성자정보 출력
	      Constructor[] cons = PersonClass.getConstructors();
	      for(Constructor c : cons) {
	         System.out.println(c);
	      }
	       System.out.println();
	       
		//person클래스의 필드 출력
	       Field[] fields = PersonClass.getFields();
	       for(Field f : fields) {
	    	   System.out.println(f);
	       }
		//person클래스의 메서드 출력
	       Method[] methods = PersonClass.getMethods();
	       for(Method m : methods) {
	    	   System.out.println(m);
	       }
	       
	}

}

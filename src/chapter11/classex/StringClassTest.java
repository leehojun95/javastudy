package chapter11.classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//jdk제공
//클래스이름: Class클래스 사용법.
public class StringClassTest {

   public static void main(String[] args) throws ClassNotFoundException {
      
      //String.class의 구성요소 확인 가능
      Class PersonClass = Class.forName("java.lang.String"); //java.lang.String.class
      
      //String클래스 생성자 정보 확인 가능
      Constructor[] cons = PersonClass.getConstructors();
      
      for(Constructor c : cons) {
         System.out.println(c);
      }
      
       System.out.println();
       
       //String클래스의 필드정보를 확인
       Field[] fields = PersonClass.getFields();
       for(Field f : fields) {
    	   System.out.println(f);
       }
       
       System.out.println();
       
       //String클래스의 메서드정보를 확인
       
       Method[] methods = PersonClass.getMethods();
       for(Method m : methods) {
    	   System.out.println(m);
       }
       
       String str;
       
       
   }

}
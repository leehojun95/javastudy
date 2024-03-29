package chapter11.string;

//문자열데이터를 관리하는 클래스
// 1)String클래스 2)StringBuilder클래스 3)StringBuffer클래스

//String클래스와 StringBuilder클래스의 데이터 관리의 다른점.
public class StringBuilderTest {

	public static void main(String[] args) {
		
		String str1 ="시작";
		
		//Stirng클래스로 문자열을 연결작업을 하면, 새로운 기억장소를 생성하여 관리한다.
		for(int i=1; i<=10; i++) {
			str1 += i + " 번째 문자열\n";
			System.out.println(System.identityHashCode(str1));
		}
		
		System.out.println(str1);
		
		// 처음 생성된 힙영역의 기억장소를 이용하여, 문자열 데이터가 관리된다.(이런경우는 성능이 좋다.)
		StringBuilder sb = new StringBuilder("시작");
		
		for(int i=1; i<=10; i++) {
			sb.append(i + " 번째 문자열\n");
			System.out.println(System.identityHashCode(sb));
		}
		System.out.println(sb);

	}

}

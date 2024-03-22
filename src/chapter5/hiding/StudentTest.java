package chapter5.hiding;

public class StudentTest {

	public static void main(String[] args) {
		// 객체생성작업
		// s1 객체에는(스택영역)  new Student() 힙영역의 생성된 기억장소의 주소가 대입니다.
		Student s1 = new Student();
		s1.address = "노원구";
		s1.studentId = 1;
		s1.grade = 5;
		s1.studenName = "홍길동";
		
		// private score필드는 접근금지.
 //		s1.address score = -23;
		
		s1.setScore(200);
		
		System.out.println(s1.getScore());
	}

}

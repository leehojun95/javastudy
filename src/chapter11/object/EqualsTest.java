package chapter11.object;

class Student{
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName) {
		//super(); 컴파일하면, 자동생성됨.
		this.studentId = studentId;
		this.studentName = studentName;
		
	}
	// 패키지명. 클래스명 주소 (첨부)값
	/*
	@Override
	public String toString() {
		return studentId + "," + studentName;
	}
	*/
	@Override
	public int hashCode() {
		System.out.println("hashCode()");
		//주소값
		return super.hashCode();  
		//return studentId;  //손흥민의 등넘버값  7
	}
	
	//st1.equals(st3)
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals()메서드");
//		return super.equals(obj);
		//st1과 st3의 객체가 가리키는 힙영역의 데이타를 비교하는 구문.
		if(obj instanceof Student) {
			Student std = (Student) obj;
			//힙 값의 주소비교
			if(studentId == std.studentId && studentName.equals(std.studentName))
				return true;
			else
				return false;
		}
		return false;
	}
	
	
	
}

public class EqualsTest {

	public static void main(String[] args) {
		
		Student st1 = new Student(7, "손흥민");
		Student st2 = st1; // 객체의 주소대입
		
		Student st3 = new Student(7, "손흥민");
		
		// st1객체의 주소와 st3객체의 주소는 다르다. 고로 다른 객체이다.
		// 객체가 동일한 지 비교 될때 내부적으로 Object클래스의 equals()와 hashCode()가 사용된다.
		//7, "손흥민"데이터가 같다면 동일한 객체로 인식되게 하자.
		//그럴려면, Object클래스의 equals()와 hashCode()재정의를 해야 동일한 객체로 결과를 만들 수 있다.
		
		/*
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		*/
		
		//주소비교
		if(st1 == st2) {
			System.out.println("st1과 st2는 주소가 같습니다.");
		}else {
			System.out.println("st1과 st2는 주소가 같지않습니다.");
		}
		
		//객체가 저장하고 있는 데이터관점으로 비교. equals()메서드 : Object클래스에서도 주소값으로 비교.
		if(st1.equals(st2)){
			System.out.println("st1과 st2는 주소가 동일하다.");
		}else {
			System.out.println("st1과 st2는 주소가 동일하지않다.");
		}
		
		//주소비교
		if(st1 == st3) {
			System.out.println("st1과 st3는 주소가 같습니다.");
		}else {
			System.out.println("st1과 st3는 주소가 같지않습니다.");
		}
		
		// equals()메서드 : Object클래스에서도 주소값으로 비교하지 말고 객체가 참조하는 힙영역의 데이터로 비교하여 판단할 수 있도록 equals()메서드를 재정의하자.
		if(st1.equals(st2)){
			System.out.println("st1과 st2는 주소가 동일하다.");
		}else {
			System.out.println("st1과 st2는 주소가 동일하지않다.");
		}
		
		//정리
		// 객체가 힙영역에 가지고 있는 정보(데이터)가 동일한 데이터라고 간주를 하고 싶다면
		// 객체비교시 내부적으로 Object클래스의 equals(), hashCode()메서드가 동작된다.
		// 객체가 참조하고 있는 힙영역의 데이터를 비교하도록, equals(), hashCode()메서드를 재정의하자.
		
		// toString()메서드가 자동으로 호출
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		
		//해쉬코드값 : 힙영역의 기억장소를 가리킬때 사용하는 코드값.
		System.out.println(st1.hashCode()); //1694819250 ->7
		System.out.println(st2.hashCode()); //1694819250 ->7
		System.out.println(st3.hashCode()); //1365202186 ->7
	}
	
	

	
}

package chapter5.classpart2;

// Student 클래스에 main() aptjem tkdydgkrl.
public class Student {
	
	//학생정보
	// 필드
	int studentID;
	String studentName;
	int grade;
	String address;
	
	//메서드
	public String getStudentName() {
		
		return studentName;
	}
	
	
	//Stuedent클래스의 맴버가 아니다.
	//일반적으로 main()메서드를 파일을 별도로 하여, 사용할수있지만
	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1. studentName = "홍길동";
		
		//"홍길동" 이 저장된 데이터를 출력
		// 실무에서는 필드를 직접접근하지 않고, 메서드를 이용하여 필드값을 읽어온다.
		System.out.println(stu1.studentName);
		System.out.println(stu1.getStudentName());
	}

}

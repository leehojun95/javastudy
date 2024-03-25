package chapter6.staticex;

// JVM이 운영체제로부터 메모리 할당을 위임받아서, 자바프로그램을 실행할 때, 사용되는 메모리의 영역을 학습하는 예제.
// static area(method area) : 정적영역
// 책은 예제의 단순함을 위하여, 필드의 접근자를 public을 사용했으나, 실제개발에서는 필드는 private, public getter/setter 메서드사용
public class Student {

	// 필드선언
	// 필드가 private접근자 일때만 getter/setter 메서드를 정의한다.
	// 문접 -> 접근자[static선택] 데이터타입 변수
	
	//자바프로그램이 실행될 때, JVM이 클래스의 내용을 보고, static 키워드를 사용하는 필드, ㅁ서드에 대하여, static area 메모리를 생성한다.
	// static 필드(정적필드)
	private static int serialNum; // static필드를 접근하는 메서드는 static이어야 한다.
	
	//인스턴스(instance) 필드 : Student stu1 = new Student(); 객체생성구문이 실행이 될때만 stack, heap 영역의 메모리를 사용한다.
	private int studentId;
	private String studentName;
	private int grade;
	private String address;
	private int count;
	
	//getter메서드 : studentName필드로 생성된 기억장소의 값을 읽어오기위한 목적의 메서드
	public String getStudentName() {
		return studentName;  
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	//3개필드에 대한 getter/setter 메서드 선언하기
	//int greade;
	public int getgGrade() {
		//serialNum++; 사용가능 . static 핃드또는 메서드는 jvm이 자동으로 메모리를 생성해주기 때문, 인스턴스 메서드가 호출이 된다면, 먼저생성되어 있는 메모리 접근이 당연하므로 문제가 안된다.
		return grade;
	}
	
	//setter 메서드는 void 이어야 한다.
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	//String address;
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	//int count;
	public int getcCunt() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	// static int seriaNum;
	public static int getSerialNum() {
		//studentName = "홍길동"; 에러발생. 이유는 static메서드에서 인스턴스필드는 객체
		serialNum++;
		
		//static 필드는 클래스명, static필드로 기억장소를 접근한다.
		return Student.serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		
		Student.serialNum = serialNum;
	}
}

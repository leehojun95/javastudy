package chapter6.singleton;

public class CompanyTest {

	public static void main(String[] args) {
		
		// 싱클턴 팬턴 클래스로 객체생성 불가능
//		Company company = new Company();
		
		// com1, com2, com3은 미리 생선된 동일한 객체의 주소를 잦게된다. / 객체생성
		Company com1 = Company.getInstance();
		Company com2 = Company.getInstance();

		System.out.println(com1 == com2);

	}

}

package chapter15.exception3;

public class IDFormatTest {

	private String userID;
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserId(String userID) throws IDFormatException {
		if(userID == null) {
			throw new IDFormatException("아이디는 null 일 수 없습니다."); // 예외발생
		}else if(userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("아이디는 8자이상 20자 이하로 사용가능"); // 예외발생
		}
		
		this.userID = userID;
	}
	
	public static void main(String[] args) {
		
		IDFormatTest test = new IDFormatTest();
		String userID = null;
		
		try {
			test.setUserId(userID);
		}catch(IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
		userID = "1234567"; // 아이디를 7자리
		
		try {
			test.setUserId(userID);
		}catch(IDFormatException e) {
			System.out.println(e.getMessage());
		}
	}

}

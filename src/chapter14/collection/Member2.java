package chapter14.collection;

//import java.util.Comparator;

//객체생성(데이터)
//아래객체가 TreeSet클래스 메모리에 저장될 때, 대소비교가 가능할게 할려면
// 1)Comparable인터페이스 또는 2)Comparator인터페이스를 구현해야 한다.
public class Member2 implements Comparable<Member2> {

	private int memberId;
	private String memberName;
	
	//매개변수가 있는 생성자
	public Member2(int memberId, String memberName) {
		super(); 
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	// 재정목적? 클래스의 필드내용 확인.
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + "]";
	}
	
	//객체비교로 사용되는 메서드 재정의
	@Override
	public int hashCode() {
		
		return memberId;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member2) {
			Member2 member = (Member2) obj;
			if(this.memberId == member.memberId && this.memberName.equals(member.memberName))
				return true;
			else
				return false;
		}
		return false;
	}

	// 객체가 대소비교에 사용되는 추상메서드 구현용도.
	/*
	@Override
	public int compare(Member2 o1, Member2 o2) {
		System.out.println("compare호출");
		//Member2클래스를 대소비교할 때 기준을 잡아야 한다.
		//memberID를 대소비교로 대상으로 기준을 잡음.
		return o1.getMemberId() - o2.getMemberId();
	}
	*/

	@Override
	public int compareTo(Member2 o) {
		System.out.println("compareTo호출");
		
//		System.out.println(memberId - o.getMemberId());
		
		//오름차순 1001 1002 순서로저장
		return memberId - o.getMemberId();
		//내림차순 1002 1001 순서로저장
//		return (this.memberId - o.memberId) * (-1);
	}
	
}

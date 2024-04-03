package chapter14.collection.treeset;

import chapter14.collection.Member2;

public class MemberTreeSetTest {

	private static MemberTreeSet memberHashSet;

	public static void main(String[] args) {
		MemberTreeSet memberLTreeSet = new MemberTreeSet();
		
		//객체생성(데이터)
		//아래객체가 TreeSet클래스 메모리에 저장될 때, 대소비교가 가능할게 할려면
		// Member2클래스가 Comparable인터페이스 또는 Comparator인터페이스를 구현해야 한다.
		Member2 memberSon = new Member2(1001, "손흥민");
		Member2 memberKim = new Member2(1002, "김민재");
		Member2 memberLee = new Member2(1003, "이강인");
		Member2 memberHwa = new Member2(1004, "황희찬");
		
		memberLTreeSet.addMember(memberSon);
		memberLTreeSet.addMember(memberKim);
		memberLTreeSet.addMember(memberLee);
		memberLTreeSet.addMember(memberHwa);
		
		memberLTreeSet.showAllMember(); //4개 member객체가 출력
		
		
		Member2 memberLee2 = new Member2(1003, "이강인");
		memberHashSet.addMember(memberLee2);
		
		memberLTreeSet.showAllMember(); //5개 member객체가 출력

	}

}

package chapter14.collection.hashset;

import chapter14.collection.Member2;

public class MemberHashSetTest {

	private static MemberHashSet memberHashSet;

	public static void main(String[] args) {
		MemberHashSet MemberHashSet = new MemberHashSet();
		
		//객체생성
		Member2 memberSon = new Member2(1001, "손흥민");
		Member2 memberKim = new Member2(1002, "김민재");
		Member2 memberLee = new Member2(1003, "이강인");
		Member2 memberHwa = new Member2(1004, "황희찬");
		
		MemberHashSet.addMember(memberSon);
		MemberHashSet.addMember(memberKim);
		MemberHashSet.addMember(memberLee);
		MemberHashSet.addMember(memberHwa);
		
		MemberHashSet.showAllMember(); //4개 member객체가 출력
		
		Member2 memberLee2 = new Member2(1003, "이강인");
		
		memberHashSet.addMember(memberLee2);
		
		MemberHashSet.showAllMember(); //5개 member객체가 출력

	}

}

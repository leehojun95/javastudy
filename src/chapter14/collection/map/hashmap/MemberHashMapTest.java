package chapter14.collection.map.hashmap;

import chapter14.collection.Member;
import chapter14.collection.Member2;

public class MemberHashMapTest {

	private static MemberHashMap memberHashMap;

	public static void main(String[] args) {
		MemberHashMap MemberHashMap = new MemberHashMap();
		
		//객체생성
		Member memberSon = new Member(1001, "손흥민");
		Member memberKim = new Member(1002, "김민재");
		Member memberLee = new Member(1003, "이강인");
		Member memberHwa = new Member(1004, "황희찬");
		
		MemberHashMap.addMember(memberSon);
		MemberHashMap.addMember(memberKim);
		MemberHashMap.addMember(memberLee);
		MemberHashMap.addMember(memberHwa);
		
		MemberHashMap.showAllMember(); //4개 member객체가 출력
		
		Member memberLee2 = new Member(1003, "이강인");
		MemberHashMap.addMember(memberLee2);
		
		MemberHashMap.showAllMember(); //5개 member객체가 출력

	}

}

package chapter14.collection.map.treemap;

import chapter14.collection.Member;
import chapter14.collection.Member2;

public class MemberTreeMapTest {

	private static MemberTreeMap memberHashMap;

	public static void main(String[] args) {
		MemberTreeMap memberTreeMap = new MemberTreeMap();
		
		//객체생성
		Member2 memberSon = new Member2(1001, "손흥민");
		Member2 memberKim = new Member2(1002, "김민재");
		Member2 memberLee = new Member2(1003, "이강인");
		Member2 memberHwa = new Member2(1004, "황희찬");
		
		memberTreeMap.addMember(memberSon);
		memberTreeMap.addMember(memberKim);
		memberTreeMap.addMember(memberLee);
		memberTreeMap.addMember(memberHwa);
		
		memberTreeMap.showAllMember(); //4개 member객체가 출력
		
		Member2 memberLee2 = new Member2(1003, "이강인");
		memberTreeMap.addMember(memberLee2);
		
		memberTreeMap.showAllMember(); //5개 member객체가 출력

	}

}

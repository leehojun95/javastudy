package chapter14.collection.linkedlist;

import java.util.LinkedList;

import chapter14.collection.Member;

//ArrayList클래스 데이터로 Member클래스 사용하기. 
public class MemberLinkedList {
	
	private LinkedList<Member> linkedlist;
	
	public MemberLinkedList() {
		linkedlist = new LinkedList<Member>();
	}
	
	//데이터추가(메서드 안에 추가)
	public void addMember(Member member) {
		linkedlist.add(member); //객체의 조소값저장
	}
	
	//데이터제거
	public boolean removeMember(int memberId) {
		
		//<arrayList.size() : 컬렉션기억장소의 요소의 개수.
		for(int i =0; i<linkedlist.size(); i++) {
			Member member = linkedlist.get(i);
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				linkedlist.remove(i); // 멤버를 삭제.
				return true;
			}
		}
		
		return false;
	}
	
	//모든데이터 보기
	public void showAllMember() {
		for(Member member : linkedlist) {
			System.out.println(member);
		}
		System.out.println();
	}

}

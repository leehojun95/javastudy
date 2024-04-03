package chapter14.collection.treeset;

import java.util.TreeSet;
import java.util.Iterator;

import chapter14.collection.Member2;


public class MemberTreeSet {


   private TreeSet<Member2> treeSet;
   
   public MemberTreeSet() {
      treeSet = new TreeSet<Member2>();
   }
   
   //데이터 추가 메소드
   public void addMember(Member2 member) { 
	   
	   //아래 메서드 동작하면서, Member2클래스의 compareTO()메서드가 호출됨.
      treeSet.add(member); // 객체의 주소값 지정
   }
   
   //데이터제거
  //Collection요소를 순회하는 Iterator잡업
   public boolean removeMember(int memberId) {
	   

      Iterator<Member2> ir = treeSet.iterator();
      //ir객체는 커서라는 포인터를 이용하여 데이터를 참조. 처음에 가리키는 위치에
      //데이터가 존재하면 hasNext()가 true 아니면 false를 반환한다.
      while(ir.hasNext()) {
         Member2 member = ir.next(); //커서가 가리키는 위치에서 데이터 읽은 후 다음 위치로 이동
         int tempId = member.getMemberId();
         if(tempId == memberId) {
            treeSet.remove(member); //멤버삭제
            return true;
         }
      }
      
      return false;
         
   }
   
   //모든 데이터 보기
   public void showAllMember() {
      //4번 반복
      for(Member2 member2 : treeSet) {
         System.out.println(member2); //member.toString()호출
      }
      System.out.println();
   }
}

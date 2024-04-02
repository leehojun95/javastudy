package chapter14.collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import chapter14.collection.Member2;

//HashSet클래스 데이터로 Member클래스 사용
public class MemberHashSet {

   //기억장소를 인덱스로 관리하는 특징(순서가 있다.) 데이터 중복 허용
   private HashSet<Member2> hashSet;
   
   public MemberHashSet() {
      hashSet = new HashSet<Member2>();
   }
   
   //데이터 추가 메소드
   public void addMember(Member2 member) {
      hashSet.add(member); // 객체의 주소값 지정
   }
   
   //데이터제거
  //Collection요소를 순회하는 Iterator잡업
   public boolean removeMember(int memberId) {
	   
      //hashSet객체가 가지고 있는 데이터를 순차적으로 접근할 수 있는 객체 ir
      Iterator<Member2> ir = hashSet.iterator();
      //ir객체는 커서라는 포인터를 이용하여 데이터를 참조. 처음에 가리키는 위치에
      //데이터가 존재하면 hasNext()가 true 아니면 false를 반환한다.
      while(ir.hasNext()) {
         Member2 member = ir.next(); //커서가 가리키는 위치에서 데이터 읽은 후 다음 위치로 이동
         int tempId = member.getMemberId();
         if(tempId == memberId) {
            hashSet.remove(member); //멤버삭제
            return true;
         }
      }
      
      return false;
         
   }
   
   //모든 데이터 보기
   public void showAllMember() {
      //4번 반복
      for(Member2 member2 : hashSet) {
         System.out.println(member2); //member.toString()호출
      }
      System.out.println();
   }
}

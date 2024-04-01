package chapter14.collection.arraylist;

import java.util.ArrayList;

// 컬렉션
// List인터페이스
// 특징? 데이터가 순서유지. 데이터 중복허용

public class ArrayListBasic {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		//추가
		al.add("손흥민");
		al.add("김민재");
		al.add("이강인");
		al.add("황희찬");
		
		
		//제거
		al.remove(0);
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		
		al2.add(10);
		al2.add(20);
		al2.add(30);
		al2.add(40);
		al2.add(50);
		
		//데이터 출력(읽기)
		System.out.println(al.get(2)); // 이강인
		
		System.out.println(al2.get(3)); // 40
	}

}

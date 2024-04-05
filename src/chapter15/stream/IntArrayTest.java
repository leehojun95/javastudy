package chapter15.stream;

import java.util.Arrays;

//스트림 예제
// 배열 또는 컬렉션의 요소를 특정기준에 따라 정렬한건, 요소중 특정값을 제외하고 출력하는 이런 형태의 기능들을
// 가지고 있는 클래스들을 스트림이라고 한다. 즉 여러 자료의 처리에 대한 기능을 제공하는 클래스.
public class IntArrayTest {

	public static void main(String[] args) {
		
		//배열은 참조타입이다. 참조타입은 기억장소를 스택영역과 힙영역 2가지영역으로 관리한다.
		int[] arr = {1, 2, 3, 4, 5};
		
		//arr배열의 데이터를 합계
		int sum = 0;
		
		//for문을 사용하여 합계를 구한 ㅇ{
		// arr배열의 첫번째 요소는 arr[0]으로 인덱스가 사용되기 때문에. for문의 i=0하는 이유이다.
		for(int i =0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println("총합계" + sum);
		
		//2)stream 기능을 사용하여 합계를 구한 예
		int sum2 = Arrays.stream(arr).sum();
		int count = (int)Arrays.stream(arr).count();
		
		System.out.println(sum2);
		System.out.println(count);

	}

}

//	Collections 클래스를 사용하기 위해서는 java.lang.Comparable를 상속받아야 한다.
package Chapter07__Collection_and_Generics;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionExample {
	static void printList(LinkedList<String> l){
		Iterator<String> it = l.iterator();
		
		while(it.hasNext()){
			String str = it.next();
			System.out.print(str);
			if(it.hasNext())
				System.out.print(" -> ");
			else
				System.out.print("\n");
		}
	}
	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();	// 빈 리스트 생성
		l.add("트랜스포머");
		l.add("스타워즈");
		l.add("매트릭스");
		l.add(0, "터미네이터");
		l.add(2, "아바타");

		printList(l);
		
		Collections.sort(l);	// 요소 정렬
		printList(l);		// 정렬된 요소 출력
		
		Collections.reverse(l);	// 요소의 순서를 역전
		printList(l);	// 요소 출력
		
		int index = Collections.binarySearch(l, "아바타")+1;	// 인덱스는 0번부터 그래서 +1해줌
		System.out.println("아바타는 "+index+"번째 요소입니다.");
	}
}

package Chapter07__Collection_and_Generics;

import java.util.Iterator;
import java.util.Vector;

public class IteratorExample {
	public static void main(String[] args) {
		// 정수 값만 다루는 제네릭 벡터 생성
		Vector<Integer> vector = new Vector<Integer>();
		vector.add(5);
		vector.add(4);
		vector.add(-1);
		vector.add(2,100);
		
		// Iterator를 이용한 모든 정수 출력하기
		Iterator<Integer> it =  vector.iterator();	// Iterator 객체 얻기
		while(it.hasNext()){
			int num = it.next();
			System.out.print(num+" ");
		}
		
		// Iterator를 이용하여 모든 정수 더하기
		int sum=0;
		it = vector.iterator();		// Iterator 객체 얻기
		while(it.hasNext()){
			int n = it.next();
			sum+=n;
		}
		System.out.println("\n모든 정수의 합 : "+sum);
	}

}

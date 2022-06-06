package Chapter07__Collection_and_Generics;

import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(); // 정수 값만 다루는 제네릭 벡터 생성
		// 삽입
		v.add(5); // auto-boxing
		v.add(new Integer(4));
		v.add(-1);

		System.out.println(v.size()); // 삽입된 객체의 갯수
		System.out.println(v.capacity()); // 베터의 크기
		// 벡터의 디폴트 용량은 10
		v.add(2, 100); // 중간에 삽입
		System.out.println(v.get(1) + "\n-----"); // 인덱스 1번의 값

		for (int i = 0; i < v.size(); i++)
			System.out.println(v.get(i));

	}

}

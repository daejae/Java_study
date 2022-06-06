package Chapter07__Collection_and_Generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapScoreExample {
	public static void main(String[] args) {
		// 사용자 이름과 점수를 기록하는 HashMap 컬렉션 생성
		HashMap<String, Integer> javaScore = new HashMap<String, Integer>();

		// 5개의 정수 저장
		javaScore.put("임창빈", 100);
		javaScore.put("이대재", 97);
		javaScore.put("이상묵", 96);
		javaScore.put("장영환", 98);
		javaScore.put("곽재영", 95);

		System.out.println("HashMap의 요소 개수 : " + javaScore.size());

		// 모든 사람의 점수 출력. javaScore에 들어 있는 모든 (key, value) 쌍 출력
		Set<String> set = javaScore.keySet();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String key = it.next();
			int value = javaScore.get(key);
			System.out.println("(" + key + ", " + value + ")");
		}
	}
}

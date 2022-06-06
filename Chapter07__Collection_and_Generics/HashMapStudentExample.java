package Chapter07__Collection_and_Generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class Student1 {
	int id;
	String tel;

	public Student1(int id, String tel) {
		this.id = id;
		this.tel = tel;
	}
}

public class HashMapStudentExample {
	public static void main(String[] args) {
		// 학생 이름과 Student 객체를 쌍으로 저장하는 HashMap 컬렉션 생성
		HashMap<String, Student1> map = new HashMap<String, Student1>();

		// 3명의 학생 저장
		map.put("이대재", new Student1(1, "010-4598-5641"));
		map.put("임창빈", new Student1(2, "010-1234-5678")); // 물론 실제번호 아님
		map.put("이상묵", new Student1(3, "010-3654-7510")); // 얘도

		System.out.println("HashMap의 요소 : " + map.size());

		// 모든 학생 출력
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String key = it.next();
			Student1 st = map.get(key);
			System.out.println(key + " : " + st.id + " " + st.tel);
			// System.out.println(key+" : "+map.get(key).id +" "+map.get(key).tel);
		}

	}

}

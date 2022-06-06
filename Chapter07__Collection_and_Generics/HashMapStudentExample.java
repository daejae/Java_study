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
		// �л� �̸��� Student ��ü�� ������ �����ϴ� HashMap �÷��� ����
		HashMap<String, Student1> map = new HashMap<String, Student1>();

		// 3���� �л� ����
		map.put("�̴���", new Student1(1, "010-4598-5641"));
		map.put("��â��", new Student1(2, "010-1234-5678")); // ���� ������ȣ �ƴ�
		map.put("�̻�", new Student1(3, "010-3654-7510")); // �굵

		System.out.println("HashMap�� ��� : " + map.size());

		// ��� �л� ���
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

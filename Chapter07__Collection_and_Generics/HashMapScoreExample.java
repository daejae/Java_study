package Chapter07__Collection_and_Generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapScoreExample {
	public static void main(String[] args) {
		// ����� �̸��� ������ ����ϴ� HashMap �÷��� ����
		HashMap<String, Integer> javaScore = new HashMap<String, Integer>();

		// 5���� ���� ����
		javaScore.put("��â��", 100);
		javaScore.put("�̴���", 97);
		javaScore.put("�̻�", 96);
		javaScore.put("�念ȯ", 98);
		javaScore.put("���翵", 95);

		System.out.println("HashMap�� ��� ���� : " + javaScore.size());

		// ��� ����� ���� ���. javaScore�� ��� �ִ� ��� (key, value) �� ���
		Set<String> set = javaScore.keySet();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String key = it.next();
			int value = javaScore.get(key);
			System.out.println("(" + key + ", " + value + ")");
		}
	}
}

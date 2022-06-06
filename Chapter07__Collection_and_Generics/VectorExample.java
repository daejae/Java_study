package Chapter07__Collection_and_Generics;

import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(); // ���� ���� �ٷ�� ���׸� ���� ����
		// ����
		v.add(5); // auto-boxing
		v.add(new Integer(4));
		v.add(-1);

		System.out.println(v.size()); // ���Ե� ��ü�� ����
		System.out.println(v.capacity()); // ������ ũ��
		// ������ ����Ʈ �뷮�� 10
		v.add(2, 100); // �߰��� ����
		System.out.println(v.get(1) + "\n-----"); // �ε��� 1���� ��

		for (int i = 0; i < v.size(); i++)
			System.out.println(v.get(i));

	}

}

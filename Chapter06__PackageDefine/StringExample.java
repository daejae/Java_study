package Chapter06__PackageDefine;

import java.util.*;

public class StringExample {
	public static void main(String[] args) {
		String a = new String(" abcd");
		String b = new String(",efg");

		// LinkedList p = new LinkedList();
		// p.add(new Integer(1));
		// p.
		//

		// ���ڿ� ����
		a = a.concat(b);
		System.out.println(a);

		// ���� ����
		a = a.trim();
		System.out.println(a);

		// ���ڿ� ��ġ
		a = a.replace("ab", "12");
		System.out.println(a);

		// ���ڿ� �и�
		String[] s = a.split(",");
		for (int i = 0; i < s.length; i++)
			System.out.println("�и��� " + i + "�� ���ڿ� " + s[i]);

		// ���� ��Ʈ��
		a = a.substring(3);
		System.out.println(a);

		// ���ڿ��� ����
		char c = a.charAt(2);
		System.out.println(c);

	}
}

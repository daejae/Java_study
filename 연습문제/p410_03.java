package Sol;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class p410_03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < 2; i++) {
			System.out.print("���� �̸��� �Է��ϼ��� : ");
			String name = in.next();
			System.out.print(name + "�� �α��� �Է��ϼ��� : ");
			int people = in.nextInt();
			map.put(name, people);
		}

		while (true) {
			System.out.print("�����̸��� �Է��ϼ��� : ");
			String key = in.next();
			System.out.println(key + "�� �α��� " + map.get(key) + "�� �Դϴ�.");
		}
	}
}

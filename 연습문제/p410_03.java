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
			System.out.print("나라 이름을 입력하세요 : ");
			String name = in.next();
			System.out.print(name + "의 인구를 입력하세요 : ");
			int people = in.nextInt();
			map.put(name, people);
		}

		while (true) {
			System.out.print("나라이르을 입력하세요 : ");
			String key = in.next();
			System.out.println(key + "의 인구는 " + map.get(key) + "명 입니다.");
		}
	}
}

package Sol;

import java.util.Scanner;

class Person3 {
	private String name;
	int[] a = new int[3];

	public Person3(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public boolean startGame() {

		System.out.println(this.getName()+"님이 주사위를 굴립니다.");
		for (int i = 0; i < a.length; i++)
			a[i] = Math.round((float) Math.random() * 3);

		if (a[0] == a[1] && a[1] == a[2] && a[0] == a[2])
			return true;
		else
			return false;
	}

	public void win() {
		System.out.println(this.getName() + "님이 승리하였습니다.");
	}
}

public class p365_12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Person3[] arr = new Person3[2];
		String name;

		System.out.print("플레이어1 이름 : ");
		name = in.next();
		arr[0] = new Person3(name);

		System.out.print("플레이어2 이름 : ");
		name = in.next();
		arr[1] = new Person3(name);

		boolean turn = false;
		while (true) {
			in.nextLine();
			if (turn == false) {
				if (arr[0].startGame()) {
					arr[0].win();
					break;
				}
				turn = true;
			} else {
				if (arr[1].startGame()) {
					arr[1].win();
					break;
				}
				turn = false;
			}
		}

	}
}

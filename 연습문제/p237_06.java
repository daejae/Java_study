/* 
 * Ŭ������ �̿��� ���� �ý��� �����
 * �Ӽ�(�ʵ�) : S,A,B(�¼� ����), �������� �̸�, ��ġ,
 * ��� �޼ҵ� �����, ���࿡ S����̶� B����� ���� �߰� �� ����
 */
package Sol;

import java.util.Scanner;

class Data {

}

class ReserveSystem {
	private String[] classS;
	private String[] classA;
	private String[] classB;

	public ReserveSystem() {
		classS = new String[10];
		classA = new String[10];
		classB = new String[10];
		for (int i = 0; i < classA.length; i++) {
			classS[i] = "___";
			classA[i] = "___";
			classB[i] = "___";
		}
	}

	int SeatDistinguish() {
		Scanner in = new Scanner(System.in);
		System.out.print("�¼����� S<1>, A<2>, B<3> : ");
		return in.nextInt();
	}

	int ShowMenu() {
		Scanner in = new Scanner(System.in);
		System.out.print("����<1>, ��ȸ<2>, ���<3>, ������<4> : ");
		return in.nextInt();
	}

	void CheckSeat() {
		ShowClassS();
		ShowClassA();
		ShowClassB();
		System.out.println("\n========== ��ȸ�� �Ϸ��Ͽ����ϴ� ==========");
	}

	void ShowClassS() {
		System.out.print("S : ");
		for (int i = 0; i < classS.length; i++)
			System.out.print(classS[i] + " ");
		System.out.println("");
	}

	void ShowClassB() {
		System.out.print("B : ");
		for (int i = 0; i < classB.length; i++)
			System.out.print(classB[i] + " ");
		System.out.println("");
	}

	void ShowClassA() {
		System.out.print("A : ");
		for (int i = 0; i < classA.length; i++)
			System.out.print(classA[i] + " ");
		System.out.print("\n");
	}

	void Reserve() {
		Scanner in = new Scanner(System.in);
		int isClass = SeatDistinguish();
		switch (isClass) {
		case 1:
			ShowClassS();
			break;
		case 2:
			ShowClassA();
			break;
		case 3:
			ShowClassB();
			break;
		}
		boolean isClear = false;
		String name;
		int number;

		while (isClear != true) {
			System.out.print("�̸� : ");
			name = in.next();
			System.out.print("��ȣ : ");
			number = in.nextInt();

			switch (isClass) {
			case 1:
				if (classS[number - 1] == "___") {
					classS[number - 1] = name;
					isClear = true;
				} else
					System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���.");
				break;
			case 2:
				if (classA[number - 1] == "___") {
					classA[number - 1] = name;
					isClear = true;
				} else
					System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���.");
				break;
			case 3:
				if (classB[number - 1] == "___") {
					classB[number - 1] = name;
					isClear = true;
				} else
					System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���.");
				break;
			}
		}
	}

	void Cancel() {
		Scanner in = new Scanner(System.in);
		int isClass = SeatDistinguish();
		switch (isClass) {
		case 1:
			ShowClassS();
			break;
		case 2:
			ShowClassA();
			break;
		case 3:
			ShowClassB();
			break;
		}

		String name;
		boolean flag = false;
		while (flag != true) {
			System.out.print("�̸� : ");
			name = in.next();
			switch (isClass) {
			case 1:
				for (int i = 0; i < classS.length; i++)
					if (classS[i].equals(name)) {
						classS[i] = "___";
						flag = true;
					} else
						System.out.println("���� �̸��Դϴ�. �ٽ� �Է��ϼ���.");
				break;
			case 2:
				for (int i = 0; i < classA.length; i++)
					if (classA[i].equals(name)) {
						classA[i] = "___";
						flag = true;
					} else
						System.out.println("���� �̸��Դϴ�. �ٽ� �Է��ϼ���.");
				break;
			case 3:
				for (int i = 0; i < classA.length; i++)
					if (classA[i].equals(name)) {
						classA[i] = "___";
						flag = true;
					} else
						System.out.println("���� �̸��Դϴ�. �ٽ� �Է��ϼ���.");
				break;
			}

		}
	}
}

public class p237_06 {
	public static void main(String[] args) {
		ReserveSystem costum1 = new ReserveSystem();

		while (true) {
			int choiceMenu = costum1.ShowMenu();
			switch (choiceMenu) {
			case 1:
				costum1.Reserve();
				break;
			case 2:
				costum1.CheckSeat();
				break;
			case 3:
				costum1.Cancel();
				break;
			}
			if (choiceMenu == 4)
				break;
		}
	}
}

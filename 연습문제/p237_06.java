/* 
 * 클래스를 이용한 예약 시스템 만들기
 * 속성(필드) : S,A,B(좌석 갯수), 예약자의 이름, 위치,
 * 취소 메소드 만들고, 예약에 S등급이랑 B등급의 오류 발견 및 수정
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
		System.out.print("좌석구분 S<1>, A<2>, B<3> : ");
		return in.nextInt();
	}

	int ShowMenu() {
		Scanner in = new Scanner(System.in);
		System.out.print("예약<1>, 조회<2>, 취소<3>, 끝내기<4> : ");
		return in.nextInt();
	}

	void CheckSeat() {
		ShowClassS();
		ShowClassA();
		ShowClassB();
		System.out.println("\n========== 조회를 완료하였습니다 ==========");
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
			System.out.print("이름 : ");
			name = in.next();
			System.out.print("번호 : ");
			number = in.nextInt();

			switch (isClass) {
			case 1:
				if (classS[number - 1] == "___") {
					classS[number - 1] = name;
					isClear = true;
				} else
					System.out.println("잘못된 입력입니다. 다시 입력하세요.");
				break;
			case 2:
				if (classA[number - 1] == "___") {
					classA[number - 1] = name;
					isClear = true;
				} else
					System.out.println("잘못된 입력입니다. 다시 입력하세요.");
				break;
			case 3:
				if (classB[number - 1] == "___") {
					classB[number - 1] = name;
					isClear = true;
				} else
					System.out.println("잘못된 입력입니다. 다시 입력하세요.");
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
			System.out.print("이름 : ");
			name = in.next();
			switch (isClass) {
			case 1:
				for (int i = 0; i < classS.length; i++)
					if (classS[i].equals(name)) {
						classS[i] = "___";
						flag = true;
					} else
						System.out.println("없는 이름입니다. 다시 입력하세요.");
				break;
			case 2:
				for (int i = 0; i < classA.length; i++)
					if (classA[i].equals(name)) {
						classA[i] = "___";
						flag = true;
					} else
						System.out.println("없는 이름입니다. 다시 입력하세요.");
				break;
			case 3:
				for (int i = 0; i < classA.length; i++)
					if (classA[i].equals(name)) {
						classA[i] = "___";
						flag = true;
					} else
						System.out.println("없는 이름입니다. 다시 입력하세요.");
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

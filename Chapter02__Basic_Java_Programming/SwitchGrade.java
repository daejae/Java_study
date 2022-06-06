package Chapter02__Basic_Java_Programming;

//import java.util.Scanner;
public class SwitchGrade {

	public static void main(String[] args) {
		// Scanner in = new Scanner(System.in);

		System.out.print("등급을 입력하세요 : ");
		// char grade = in.next();
		char grade = 'A';
		switch (grade) {
		case 'A':
		case 'B':
			System.out.println("참 잘하였습니다.");
			break;
		case 'C':
		case 'D':
			System.out.println("좀 더 노력하세요.");
			break;
		case 'F':
			System.out.println("다음 학기에 다시 수강하세여.");
			break;
		default:
			System.out.println("잘못된 학점입니다.");

		}

	}

}

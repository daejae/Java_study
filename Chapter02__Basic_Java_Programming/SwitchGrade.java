package Chapter02__Basic_Java_Programming;

//import java.util.Scanner;
public class SwitchGrade {

	public static void main(String[] args) {
		// Scanner in = new Scanner(System.in);

		System.out.print("����� �Է��ϼ��� : ");
		// char grade = in.next();
		char grade = 'A';
		switch (grade) {
		case 'A':
		case 'B':
			System.out.println("�� ���Ͽ����ϴ�.");
			break;
		case 'C':
		case 'D':
			System.out.println("�� �� ����ϼ���.");
			break;
		case 'F':
			System.out.println("���� �б⿡ �ٽ� �����ϼ���.");
			break;
		default:
			System.out.println("�߸��� �����Դϴ�.");

		}

	}

}

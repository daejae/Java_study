package Chapter02__Basic_Java_Programming;
import java.util.Scanner;

public class SuccessOrFail_if {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int score = in.nextInt();
		
		if(score >= 80)
			System.out.println("�հ��Դϴ�.");
		else
			System.out.println("���հ� �Դϴ�.");
	}
}

package Chapter02__Basic_Java_Programming;
import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		int time;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		time = sc.nextInt();
		
		System.out.print(time + "�ʴ� " + time/(60*60) + "�ð�, " + (time%3600)/60 + "��, " + time%60 + "�� �Դϴ�.");
	}
}
;
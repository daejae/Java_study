package Chapter02__Basic_Java_Programming;
import java.util.Scanner;

public class MultipleOfThree_if_else {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int integer = in.nextInt();
		
		if((integer%3)==0)
			System.out.println(integer + "�� 3�� ��� �Դϴ�.");
		else
			System.out.println(integer + "�� 3�� ����� �ƴյ�.");
		
	}
}

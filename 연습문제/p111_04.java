package Sol;
import java.util.Scanner;

public class p111_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("1 ~ 99 ������ ������ �Է��ϼ��� : ");
		int number = in.nextInt();
		
		switch(number/10) {
		case 3:
		case 6:
		case 9:
			System.out.print("�ڼ�¦");
		default:
			System.out.print("�ڼ�");
		}
		if((number%10)%3 == 0)
			System.out.print("¦");
		
		System.out.println("");
	}
}

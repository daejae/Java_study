package Sol;
import java.util.Scanner;

public class p111_06 {
	public static void main(String[] args) {
		System.out.print("�� ������ �Է��ϼ��� : ");
		Scanner in = new Scanner(System.in);
		
		int year = in.nextInt();
		
		if(year%4 == 0) {
			if(year % 100 ==0) 
				if(year%400 ==0)
					System.out.println("����Դϴ�.");
				else
					System.out.println("����Դϴ�.");
			else
				System.out.println("�����Դϴ�.");
				
				
		}
		else
			System.out.println("����Դϴ�,");
		
	}
}

package Sol;
import java.util.Scanner;

public class p111_05 {
	public static void main(String[] args) {
		System.out.print("�� ���� ���̸� �Է��ϼ��� : ");
		Scanner in = new Scanner(System.in);
		
		int tryangle1 = in.nextInt();
		int tryangle2 = in.nextInt();
		int tryangle3 = in.nextInt();
		
		if(tryangle1 > tryangle2 && tryangle1 > tryangle3) {
			if(tryangle1 < tryangle2 + tryangle3)
				System.out.println("�ﰢ�� �׸��Ⱑ �����ϴ�.");
			else
				System.out.println("�ﰢ���� �׸� �� �����ϴ�.");
		}
		else if(tryangle2 > tryangle1 && tryangle2 > tryangle3) {
			if(tryangle2 < tryangle1 + tryangle3)
				System.out.println("�ﰢ�� �׸��Ⱑ �����ϴ�");
			else 
				System.out.println("�ﰢ���� �׸� �� �����ϴ�.");
			
		}
		else {
			if(tryangle3 < tryangle1 + tryangle2)
				System.out.println("�ﰢ�� �׸��Ⱑ �����ϴ�.");
			else
				System.out.println("�ﰢ���� �׸� �� �����ϴ�.");
		}
		
	}
}

package Chapter03__LoopAndArrayAndException;
import java.util.Scanner;

public class ArithmeticException {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int dividend=0, divisor=0;
		
		System.out.print("������ �Է��ϼ��� : ");
		dividend = in.nextInt();
		
		System.out.print("�������� ���� �Է��ϼ��� : ");
		divisor = in.nextInt();
		

		try {
			System.out.println(dividend + "�� " + divisor + "�� ������ ���� "+ dividend/divisor+ "�Դϴ�.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("0���� ���� �� �����ϴ�.");
			e.printStackTrace();
			
		}

		
	}
}

package Chapter02__Basic_Java_Programming;
import java.util.Scanner;

public class ScannerExam {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);t
//		String str = scanner.nextLine();
//		
//		System.out.println(str);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("����, ü��, ������ �Է��ϼ��� : ");
		System.out.println("���̴� "+sc.nextInt() + "�� �Դϴ�.");
		System.out.println("ü���� "+ sc.nextFloat() + "Kg �Դϴ�.");
		int temp = sc.nextInt();
		System.out.println("������ " + temp/100 +"M " + temp%100 + "Cm �Դϴ�.");
		
		
	}
}

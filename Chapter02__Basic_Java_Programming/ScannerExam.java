package Chapter02__Basic_Java_Programming;
import java.util.Scanner;

public class ScannerExam {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);t
//		String str = scanner.nextLine();
//		
//		System.out.println(str);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이, 체중, 신장을 입력하세요 : ");
		System.out.println("나이는 "+sc.nextInt() + "살 입니다.");
		System.out.println("체중은 "+ sc.nextFloat() + "Kg 입니다.");
		int temp = sc.nextInt();
		System.out.println("신장은 " + temp/100 +"M " + temp%100 + "Cm 입니다.");
		
		
	}
}

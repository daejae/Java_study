package Sol;
import java.util.Scanner;

public class p111_06 {
	public static void main(String[] args) {
		System.out.print("몇 년인지 입력하세요 : ");
		Scanner in = new Scanner(System.in);
		
		int year = in.nextInt();
		
		if(year%4 == 0) {
			if(year % 100 ==0) 
				if(year%400 ==0)
					System.out.println("운년입니다.");
				else
					System.out.println("평년입니다.");
			else
				System.out.println("윤년입니다.");
				
				
		}
		else
			System.out.println("평년입니다,");
		
	}
}

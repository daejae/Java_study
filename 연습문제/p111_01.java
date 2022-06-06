package Sol;
import java.util.Scanner;

// this program is String conversion.
 
public class p111_01 {
	public static void main(String[] args) {
		// A = 65 a =97 z =122
		System.out.print("문자 하나를 입력하세요 : ");
		Scanner in = new Scanner(System.in);
		
		String a = in.next();
		char b=a.charAt(0);
		//System.out.println(b);
		
		if(b>64 && b<123) {
			if(b>=97) {
				
				System.out.println((char)(b-32));
			}
			else
				System.out.println(b);
		}
		else
			System.out.println("영문자가 아닙니다.");
	}
	
}

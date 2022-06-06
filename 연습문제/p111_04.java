package Sol;
import java.util.Scanner;

public class p111_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("1 ~ 99 사이의 정수를 입력하세요 : ");
		int number = in.nextInt();
		
		switch(number/10) {
		case 3:
		case 6:
		case 9:
			System.out.print("박수짝");
		default:
			System.out.print("박수");
		}
		if((number%10)%3 == 0)
			System.out.print("짝");
		
		System.out.println("");
	}
}

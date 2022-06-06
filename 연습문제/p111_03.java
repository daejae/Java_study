package Sol;
import java.util.Scanner;

public class p111_03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("금액을 입력하세요 : ");
		
		int money = in.nextInt();
		System.out.println("5만워 권 : " + money/50000);
		System.out.println("1만원 권 : " + (money%50000)/10000);
		System.out.println("5천원 권 : " + (money%10000)/5000);
		System.out.println("1천원 권 : " + (money%5000)/1000);
		System.out.println("500원 : "+ (money%1000)/500);
		System.out.println("100원 : " + (money%500)/100);
		System.out.println("50원 : " + (money%100)/50);
		System.out.println("10원 : " + (money%50)/10);
	}

}

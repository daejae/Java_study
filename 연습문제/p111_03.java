package Sol;
import java.util.Scanner;

public class p111_03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��ϼ��� : ");
		
		int money = in.nextInt();
		System.out.println("5���� �� : " + money/50000);
		System.out.println("1���� �� : " + (money%50000)/10000);
		System.out.println("5õ�� �� : " + (money%10000)/5000);
		System.out.println("1õ�� �� : " + (money%5000)/1000);
		System.out.println("500�� : "+ (money%1000)/500);
		System.out.println("100�� : " + (money%500)/100);
		System.out.println("50�� : " + (money%100)/50);
		System.out.println("10�� : " + (money%50)/10);
	}

}

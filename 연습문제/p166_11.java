package Sol;
import java.util.Scanner;

public class p166_11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
		System.out.print("�ݾ��� �Է��ϼ��� : ");
		int money = in.nextInt();
		
		for(int i=0; i<unit.length; i++) {
			System.out.println(unit[i] + " : " + money/unit[i]+"��");
			money%=unit[i];
		}
		
	}
}

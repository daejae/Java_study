package Chapter03__LoopAndArrayAndException;
import java.util.Scanner;

public class BreakExample {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count =0;
		
		while(true){
			if(in.nextInt()<0)
				break;
			count++;
		}
		System.out.println("�Է¹��� Ƚ���� "+ count + " �� �Դϴ�.");
			
	}
}

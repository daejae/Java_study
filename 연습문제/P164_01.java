package Sol;
import java.util.Scanner;

public class P164_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("������ ������ �Է��ϼ��� : ");
		int number = in.nextInt();
		
		for(int i=0 ; i < number ;i++){
			for(int j=0 ; j<number-i ; j++)
				System.out.print("*");
			System.out.println("");
		}
			
	}
	

}

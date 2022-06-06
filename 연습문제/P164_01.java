package Sol;
import java.util.Scanner;

public class P164_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("임의의 정수를 입력하세요 : ");
		int number = in.nextInt();
		
		for(int i=0 ; i < number ;i++){
			for(int j=0 ; j<number-i ; j++)
				System.out.print("*");
			System.out.println("");
		}
			
	}
	

}

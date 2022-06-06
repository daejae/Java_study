package Sol;
import java.util.Scanner;

public class p164_03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = in.nextInt();
		int array[] = new int[50];
		int count=0;
		
		
		for(int i=0;;i++){
			if(num==0) {
				count =i;
				break;
			}
			array[i] = num%2;
			num/=2;

		}
		
		for(int i = count-1 ; i>=0 ; i--)
			System.out.print(array[i]);
	}

}

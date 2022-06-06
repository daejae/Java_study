package Chapter03__LoopAndArrayAndException;
import java.util.Scanner;

public class ArrayLength {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[] = new int[5];
		int sum=0;
		for(int i=0; i <arr.length; i++) {
			arr[i]=in.nextInt();
			sum +=arr[i];
		}
		System.out.println("입련된 값들의 평군 : " + (double)sum/arr.length);
		
	}
}

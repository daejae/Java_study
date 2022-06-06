package Sol;
import java.util.Scanner;

public class p164_05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[] = new int[10];
		
		System.out.print("10개의 정수를 입력하세요 : ");
		for(int i=0 ; i<arr.length;i++)
			arr[i] = in.nextInt();
		
		for(int i=0; i<arr.length ; i++)
			if((arr[i]%3)==0)
				System.out.println(arr[i]);
		
	}
}

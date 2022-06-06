package Chapter03__LoopAndArrayAndException;
import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner in = new Scanner(System.in);
		
		for(int i=0; i<5 ; i++)
			arr[i] = in.nextInt();
		
		int temp = arr[0];
		for(int i=1 ; i<5; i++)
			if(temp<arr[i])
				temp = arr[i];
		System.out.println(temp);
	}
}
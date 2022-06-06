package Sol;
import java.util.Scanner;

public class p164_06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[] = new int[10];
		int temp=0;
		
		System.out.print("10개의 정수를 입력하세요 : ");
		for(int i=0 ; i < arr.length ; i++) 
			arr[i] = in.nextInt();
		
		for(int i=0; i<arr.length; i++) {
			for(int j =i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i=0 ; i < arr.length ; i++) 
			System.out.print(arr[i] + " ");
		}
	}

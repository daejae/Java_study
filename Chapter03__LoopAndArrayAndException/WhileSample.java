package Chapter03__LoopAndArrayAndException;
import java.util.Scanner;

public class WhileSample {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int temp;
		double avg=0;
		int count=0;
		
		while((temp = in.nextInt())!=0) {
			avg+=temp;
			count++;		
		}
		
		System.out.println("ÀÔ·ÂÀÇ °¹¼ö : " + count + "\nÆò±Õ : " + avg/count);
	}
}

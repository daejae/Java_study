package Sol;
import java.util.Scanner;

public class p164_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String typo =in.next();
		char a =typo.charAt(0);
		
		for(int i= a -'a'; i>=0 ; i--) {
			for(char j ='a' ; j<=a-i ; j++)
				System.out.print(j);
			System.out.println("");
		}
			
		
	
		
	}

}

package Sol;
import java.util.Scanner;

public class p164_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("최대 공약수를 구하려는 두 수를 입력하세요 : ");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		
		int answer=0;
		for(int i=1 ; i<=((num1>num2)?num1:num2);i++) {
			if((num1%i)==0 && (num2%i)==0)
				answer = i;
		}
		System.out.println(answer);
	}
}

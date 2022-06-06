package Chapter03__LoopAndArrayAndException;
import java.util.Scanner;

public class ArithmeticException {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int dividend=0, divisor=0;
		
		System.out.print("정수를 입력하세요 : ");
		dividend = in.nextInt();
		
		System.out.print("나누려는 수를 입력하세요 : ");
		divisor = in.nextInt();
		

		try {
			System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 "+ dividend/divisor+ "입니다.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("0으로 나눌 수 없습니다.");
			e.printStackTrace();
			
		}

		
	}
}

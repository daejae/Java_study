package Sol;
import java.util.Scanner;

public class p111_05 {
	public static void main(String[] args) {
		System.out.print("세 변의 길이를 입력하세요 : ");
		Scanner in = new Scanner(System.in);
		
		int tryangle1 = in.nextInt();
		int tryangle2 = in.nextInt();
		int tryangle3 = in.nextInt();
		
		if(tryangle1 > tryangle2 && tryangle1 > tryangle3) {
			if(tryangle1 < tryangle2 + tryangle3)
				System.out.println("삼각형 그리기가 가능하다.");
			else
				System.out.println("삼각형을 그릴 수 없습니다.");
		}
		else if(tryangle2 > tryangle1 && tryangle2 > tryangle3) {
			if(tryangle2 < tryangle1 + tryangle3)
				System.out.println("삼각형 그리기가 가능하다");
			else 
				System.out.println("삼각형을 그릴 수 없습니다.");
			
		}
		else {
			if(tryangle3 < tryangle1 + tryangle2)
				System.out.println("삼각형 그리기가 가능하다.");
			else
				System.out.println("삼각형을 그릴 수 없습니다.");
		}
		
	}
}

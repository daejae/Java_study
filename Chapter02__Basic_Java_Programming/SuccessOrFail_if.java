package Chapter02__Basic_Java_Programming;
import java.util.Scanner;

public class SuccessOrFail_if {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int score = in.nextInt();
		
		if(score >= 80)
			System.out.println("합격입니다.");
		else
			System.out.println("불합격 입니다.");
	}
}

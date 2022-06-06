package Chapter02__Basic_Java_Programming;
import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		int time;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		time = sc.nextInt();
		
		System.out.print(time + "초는 " + time/(60*60) + "시간, " + (time%3600)/60 + "분, " + time%60 + "초 입니다.");
	}
}
;
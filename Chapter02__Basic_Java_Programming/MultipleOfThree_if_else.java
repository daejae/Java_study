package Chapter02__Basic_Java_Programming;
import java.util.Scanner;

public class MultipleOfThree_if_else {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int integer = in.nextInt();
		
		if((integer%3)==0)
			System.out.println(integer + "은 3의 배수 입니다.");
		else
			System.out.println(integer + "은 3의 배수가 아닙디나.");
		
	}
}

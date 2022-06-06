package Sol;
import java.util.Scanner;
import java.util.Random;

public class p158_HiddenKardGame {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random random = new Random();
		
		int arr[] = new int[2];
		int answer =0;
		for(int i=1;;i++) {
			if(answer == 0) {
				answer = random.nextInt(100);	// 1 ~ 99 난수
				arr[0] = 1;
				arr[1] = 99;
				System.out.println("수를 경정하였습니다. 한번 맞춰보세요.");
			}
			System.out.println(arr[0] +" ~ " + arr[1]);
			System.out.print(i +"번째 입력 : ");
			int temp =in.nextInt();
			if(answer <temp) {
				System.out.println("더 낮게\n");
				arr[1] = temp;
			}
			else if(answer > temp) {
				System.out.println("더 높게\n");
				arr[0] =temp;
			}
			else{
				answer =0;
				i=0;
				System.out.println("맞았습니다.");
				System.out.print("다시하시겠습니까?(y/n) : "); // 45
				
				if(in.next().equals("n"))
					System.exit(0);
			}			
		}
	}
}

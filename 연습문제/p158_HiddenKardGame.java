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
				answer = random.nextInt(100);	// 1 ~ 99 ����
				arr[0] = 1;
				arr[1] = 99;
				System.out.println("���� �����Ͽ����ϴ�. �ѹ� ���纸����.");
			}
			System.out.println(arr[0] +" ~ " + arr[1]);
			System.out.print(i +"��° �Է� : ");
			int temp =in.nextInt();
			if(answer <temp) {
				System.out.println("�� ����\n");
				arr[1] = temp;
			}
			else if(answer > temp) {
				System.out.println("�� ����\n");
				arr[0] =temp;
			}
			else{
				answer =0;
				i=0;
				System.out.println("�¾ҽ��ϴ�.");
				System.out.print("�ٽ��Ͻðڽ��ϱ�?(y/n) : "); // 45
				
				if(in.next().equals("n"))
					System.exit(0);
			}			
		}
	}
}

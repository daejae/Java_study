package Sol;

import java.util.Scanner;

public class p365_11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int user;
		
		while(true){
			System.out.print("����(1), ����(2), ��(3), ����(-1) �� ���� : ");
			user=in.nextInt();
			if(user == -1)
				break;
			int com = Math.round((float)Math.random()*2+1);
			
			if(user == com)
				System.out.println("�����ϴ�.");
			else if(user==1 && com ==2)
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			else if(user==2 && com==3)
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			else if(user == 3 && com ==1)
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			else
				System.out.println("����ڰ� �̰���ϴ�.");
		}
	}
}

package Sol;

import java.util.Scanner;

public class p365_11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int user;
		
		while(true){
			System.out.print("가위(1), 바위(2), 보(3), 종료(-1) 중 선택 : ");
			user=in.nextInt();
			if(user == -1)
				break;
			int com = Math.round((float)Math.random()*2+1);
			
			if(user == com)
				System.out.println("비겼습니다.");
			else if(user==1 && com ==2)
				System.out.println("컴퓨터가 이겼습니다.");
			else if(user==2 && com==3)
				System.out.println("컴퓨터가 이겼습니다.");
			else if(user == 3 && com ==1)
				System.out.println("컴퓨터가 이겼습니다.");
			else
				System.out.println("사용자가 이겼습니다.");
		}
	}
}

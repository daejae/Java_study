package Sol;
import java.util.Scanner;

public class p106_GawiBawiBoGame {
	public static void main(String[] args) {
		System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		
		Scanner in = new Scanner(System.in);
		System.out.print("철수 >> ");
		String chulsu = in.next();
		
		System.out.print("영회 >> ");
		String yonghi = in.next();
		
		if(chulsu.equals(yonghi))
			System.out.println("비겼습니다.");
		else if(chulsu.equals("가위") && yonghi.equals("바위"))
			System.out.println("영희가 이겼습니다.");
		else if(chulsu.equals("바위") && yonghi.equals("보"))
			System.out.println("영희가 이겼습니다.");
		else if(chulsu.equals("보") && yonghi.equals("가위"))
			System.out.println("영희가 이겼습니다.");
		else
			System.out.println("철수가 이겼습니다.");
		System.out.println('c'+1);
	}
}


package Sol;
import java.util.Scanner;

public class p106_GawiBawiBoGame {
	public static void main(String[] args) {
		System.out.println("���� ���� �� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���");
		
		Scanner in = new Scanner(System.in);
		System.out.print("ö�� >> ");
		String chulsu = in.next();
		
		System.out.print("��ȸ >> ");
		String yonghi = in.next();
		
		if(chulsu.equals(yonghi))
			System.out.println("�����ϴ�.");
		else if(chulsu.equals("����") && yonghi.equals("����"))
			System.out.println("���� �̰���ϴ�.");
		else if(chulsu.equals("����") && yonghi.equals("��"))
			System.out.println("���� �̰���ϴ�.");
		else if(chulsu.equals("��") && yonghi.equals("����"))
			System.out.println("���� �̰���ϴ�.");
		else
			System.out.println("ö���� �̰���ϴ�.");
		System.out.println('c'+1);
	}
}


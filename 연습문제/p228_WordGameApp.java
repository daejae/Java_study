package Sol;
import java.util.Scanner;

class Player{
	private String name;
	private static String word;
	
	public String getNmae(){ return name;}
	public Player(String name) {
		this.name = name;
	}
	public void sayWord(String a) {
		word = a;
	}
	public boolean succed(String a){
		int lastIndex = word.length()-1;
		char lastChar = word.charAt(lastIndex);
		char firstChar = a.charAt(0);
		
		if(lastChar == firstChar) {
			word = a;
			return true;
		}
		else{
			System.out.println(getNmae()+"�� �����ϴ�.");
			return false;
		}
			
	}

}

public class p228_WordGameApp {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("���ӿ� �����ϴ� �ο��� ����Դϱ�? : ");
		int numberOfPlayer = in.nextInt();
		Player[] play = new Player[numberOfPlayer];
		
		for(int i=0; i<play.length; i++) {
			System.out.print("�������� �̸��� �Է��ϼ��� : ");
			String name = in.next();
			play[i] = new Player(name);
		}
		String str1 = "�ƹ���";
		System.out.println("�����ϴ� �ܾ�� "+str1 + " �Դϴ�.");
		play[0].sayWord(str1);
		
		for(int i=0;;i++){
			if(i==play.length) i=0;
			System.out.print(play[i].getNmae()+ ">>");
			boolean flag = play[i].succed(in.next());
			if(flag==false) break;
		}
		
	}

}

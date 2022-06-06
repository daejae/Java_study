package Chapter07__Collection_and_Generics;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
	public static void main(String[] args) {
		// ���ڿ��� ���԰����� ArrayList �÷��� ����
		ArrayList<String> a = new ArrayList<String>();
		
		// Ű����κ��� 4���� �̸��� �Է¹޾� ArrayList�� ����
		Scanner in = new Scanner(System.in);
		for(int i=0;i<4;i++){
			System.out.print("�̸��� �Է��ϼ��� : ");
			String s = in.next();
			a.add(s);
		}
		
		// ArrayList�� ��� �ִ� ��� �̸� ���
		for(int i=0;i<a.size();i++){
			System.out.print(a.get(i)+" ");
		}
		
		// ���� �� �̸� ���
		int longestIndex = 0; 	// ���� ���� �� �̸��� �ִ� ArrayList ���� �ε���
		for(int i=1;i<a.size();i++){
			if(a.get(longestIndex).length()<a.get(i).length())
				longestIndex=i;
		}
		System.out.println("\n���� �� �̸��� : "+ a.get(longestIndex));
	}

}

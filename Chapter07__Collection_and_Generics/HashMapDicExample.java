package Chapter07__Collection_and_Generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapDicExample {
	public static void main(String[] args) {
		// ���� �ܾ�� �ѱ� �ܾ��� ���� �����ϴ� HashMap �÷��� ����
		HashMap<String, String> dic = new HashMap<String, String>();
		
		// 3 ���� (key, value) ���� dic�� ����
		dic.put("baby", "�Ʊ�");
		dic.put("love",  "���");
		dic.put("apple", "���");
		
		// dic �÷��ǿ� ��� �ִ� ��� (key, value) �� ���
		Set<String> set = dic.keySet();		// key ���ڿ��� ���� ���� Set �÷��� ����
		Iterator<String> it = set.iterator();	// key ���ڿ��� ������� ������ �� �ִ� Iterator ����
		while(it.hasNext()){
			String str = it.next();
			System.out.println("("+str+", "+dic.get(str)+")");
		}
		
		//����ڷκ��� ���� �ܾ �Է¹ް� �ѱ� �ܾ� �˻�
		Scanner in = new Scanner(System.in);
		for(int i=0; i<3 ; i++){
			System.out.print("ã�� ���� �ܾ �Է��ϼ��� : ");
			String word = in.next();
			System.out.println(dic.get(word));
		}
		
	}
}

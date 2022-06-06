//	Collections Ŭ������ ����ϱ� ���ؼ��� java.lang.Comparable�� ��ӹ޾ƾ� �Ѵ�.
package Chapter07__Collection_and_Generics;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionExample {
	static void printList(LinkedList<String> l){
		Iterator<String> it = l.iterator();
		
		while(it.hasNext()){
			String str = it.next();
			System.out.print(str);
			if(it.hasNext())
				System.out.print(" -> ");
			else
				System.out.print("\n");
		}
	}
	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();	// �� ����Ʈ ����
		l.add("Ʈ��������");
		l.add("��Ÿ����");
		l.add("��Ʈ����");
		l.add(0, "�͹̳�����");
		l.add(2, "�ƹ�Ÿ");

		printList(l);
		
		Collections.sort(l);	// ��� ����
		printList(l);		// ���ĵ� ��� ���
		
		Collections.reverse(l);	// ����� ������ ����
		printList(l);	// ��� ���
		
		int index = Collections.binarySearch(l, "�ƹ�Ÿ")+1;	// �ε����� 0������ �׷��� +1����
		System.out.println("�ƹ�Ÿ�� "+index+"��° ����Դϴ�.");
	}
}

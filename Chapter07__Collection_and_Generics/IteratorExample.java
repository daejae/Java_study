package Chapter07__Collection_and_Generics;

import java.util.Iterator;
import java.util.Vector;

public class IteratorExample {
	public static void main(String[] args) {
		// ���� ���� �ٷ�� ���׸� ���� ����
		Vector<Integer> vector = new Vector<Integer>();
		vector.add(5);
		vector.add(4);
		vector.add(-1);
		vector.add(2,100);
		
		// Iterator�� �̿��� ��� ���� ����ϱ�
		Iterator<Integer> it =  vector.iterator();	// Iterator ��ü ���
		while(it.hasNext()){
			int num = it.next();
			System.out.print(num+" ");
		}
		
		// Iterator�� �̿��Ͽ� ��� ���� ���ϱ�
		int sum=0;
		it = vector.iterator();		// Iterator ��ü ���
		while(it.hasNext()){
			int n = it.next();
			sum+=n;
		}
		System.out.println("\n��� ������ �� : "+sum);
	}

}

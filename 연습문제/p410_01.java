package Sol;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class p410_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Vector<Double> vec = new Vector<Double>();

		for (int i = 0; i < 10; i++) {
			System.out.print((i + 1) + "��° �Ǽ� �Է� : ");
			double num = in.nextDouble();
			vec.add(num);
		}
		Iterator<Double> it = vec.iterator();
		double max = it.next();
		while (it.hasNext()) {
			double temp = it.next();
			if (max < temp)
				max = temp;
		}
		System.out.println("���� ū �Ǽ� ���� : " + max);

	}
}

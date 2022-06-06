package Chapter04__ClassAndObject;

import java.util.Scanner;

public class GoodsArray {
	public static void main(String[] args) {
		Good1s[] goodsArray;
		goodsArray = new Good1s[3];

		Scanner in = new Scanner(System.in);
		for (int i = 0; i < goodsArray.length; i++) {
			String a = in.next();
			int pri = in.nextInt();
			int sto = in.nextInt();
			int sol = in.nextInt();
			goodsArray[i] = new Good1s(a, pri, sto, sol);
		}
		for (int i = 0; i < goodsArray.length; i++)
			System.out.println(goodsArray[i].getName() + " " + goodsArray[i].getPrice() + " " + goodsArray[i].getStock()
					+ " " + goodsArray[i].getSold());

	}
}

class Good1s {
	private String name;
	private int price;
	private int numberOfStock;
	private int sold;

	Good1s(String name, int p, int stock, int sold) {
		this.name = name;
		price = p;
		numberOfStock = stock;
		this.sold = sold;
	}

	String getName() {
		return name;
	}

	int getPrice() {
		return price;
	}

	int getStock() {
		return numberOfStock;
	}

	int getSold() {
		return sold;
	}

}
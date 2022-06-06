// ��ºκ� �պ�����
[[]]
package Sol;

import java.util.Scanner;

class Product {
	Product next = null;
	private int ident;
	private String productExplain;
	private String creator;
	private int price;
	private static int count = 0;

	public Product(String name) {

		System.out.println("head ����");
		next = null;

	}

	public Product() {
		Scanner in = new Scanner(System.in);
		System.out.print("��ǰ ���� : ");
		productExplain = in.nextLine();
		System.out.print("������ : ");
		creator = in.nextLine();
		System.out.print("���� : ");
		price = in.nextInt();
		ident = count++;
	}

	public Product(String explain, String creat, int price) {
		ident = count++;
		this.productExplain = explain;
		this.creator = creat;
		this.price = price;
	}

	public boolean isNext() {
		if (next == null)
			return false;
		return true;
	}

	public Product getNext() {
		return this.next;
	}

	public void setIdent(int a) {
		ident = a;
	}

	public void setProductExplain(String a) {
		productExplain = a;
	}

	public void setCreator(String name) {
		creator = name;
	}

	public void setPrice(int num) {
		price = num;
	}

	public int getIdent() {
		return ident;
	}

	public String getExplain() {
		return productExplain;
	}

	public String getCreator() {
		return creator;
	}

	public int getPrice() {
		return price;
	}

	public void printInfo() {
		System.out.println("��ǰ ID : " + this.getIdent());
		System.out.println("��ǰ ���� : " + this.getExplain());
		System.out.println("������ : " + this.getCreator());
		System.out.println("���� : " + this.getPrice());
	}

}

class CompactDisc extends Product {
	private String albumTitle;
	private String singer;

	public CompactDisc() {
		super();
		Scanner in = new Scanner(System.in);

		System.out.print("�ٹ� ���� : ");
		albumTitle = in.next();
		System.out.print("���� �̸� : ");
		singer = in.next();
	}

	public void setAlbumTitle(String name) {
		albumTitle = name;
	}

	public void setSinger(String name) {
		singer = name;

	}

	public String getAlbumTitle() {
		return albumTitle;
	}

	public String getSinger() {
		return singer;
	}

	public void printInfo() {
		super.printInfo();
		System.out.println("�ٹ� ���� : " + this.getAlbumTitle());
		System.out.println("���� �̸� : " + this.getSinger());
	}
}

class Book extends Product {
	private int isbn;
	private String author;
	private String bookTitle;

	public Book() {
		super();
		Scanner in = new Scanner(System.in);
		System.out.print("å ���� : ");
		bookTitle = in.nextLine();
		System.out.print("����  : ");
		author = in.nextLine();
		System.out.print("ISBN ��ȣ : ");
		isbn = in.nextInt();
	}

	public void setBookTitle(String name) {
		bookTitle = name;
	}

	public void setAuthor(String name) {
		author = name;
	}

	public void setISBN(int num) {
		isbn = num;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public String getAuthor() {
		return author;
	}

	public int getISBN() {
		return isbn;
	}

	public void printInfo() {
		super.printInfo();
		System.out.println("å ���� : " + this.getBookTitle());
		System.out.println("���� : " + this.getAuthor());
		System.out.println("ISBN : " + this.getISBN());
	}

}

class ConverstationBook extends Book {
	private String language;

	public ConverstationBook() {
		super();
		Scanner in = new Scanner(System.in);

		System.out.print("��� : ");
		language = in.nextLine();
	}

	public void setLanguage(String lang) {
		language = lang;

	}

	public String getLanguage() {
		return language;
	}

	public void printInfo() {
		super.printInfo();
		System.out.println("��� : " + this.getLanguage());
	}
}

public class p293_ProductInfo_ReCheck {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Product arr = new Product(null);

		while (true) {
			int choice = Menu();

			switch (choice) {
			case 1:
				System.out.print("��ǰ ���� å(1), ����CD(2), ȸȭå(3) : ");
				createNode(arr, in.nextInt());
				break;

			case 2:
				loopPrint(arr);
				break;
			case 3:
				break;
			}

			if (choice == 3)
				break;
		}

	}

	public static void loopPrint(Product arr) {
		try {
			arr = arr.getNext();
			do {
				arr.printInfo();
				arr = arr.getNext();
			} while (!arr.isNext());
		} catch (NullPointerException e) {
			// e.printStackTrace();
//			arr.printInfo();
			return;
		}
	}

	public static int Menu() {
		Scanner in = new Scanner(System.in);
		System.out.print("��ǰ �߰�(1), ��� ��ǰ ��ȸ(2), ������(3) : ");
		return in.nextInt();
	}

	public static Product endNode(Product head) {
		try {
			while (!head.isNext()) {
				System.out.println(head.next);
				head = head.getNext();
			}
		} catch (NullPointerException e) {
		} finally {
			return head;
		}
	}

	public static Product createNode(Product head, int choice) {
		head = endNode(head);
		try {
			switch (choice) {
			case 1:
				head.next = new Book();
				break;
			case 2:
				head.next = new CompactDisc();
				break;
			case 3:
				head.next = new ConverstationBook();
			}
			return head;
		} catch (NullPointerException e) {

		} finally {
			return head;
		}
	}
}

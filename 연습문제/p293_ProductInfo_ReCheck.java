// 출력부분 손봐야함
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

		System.out.println("head 생성");
		next = null;

	}

	public Product() {
		Scanner in = new Scanner(System.in);
		System.out.print("상품 설명 : ");
		productExplain = in.nextLine();
		System.out.print("생산자 : ");
		creator = in.nextLine();
		System.out.print("가격 : ");
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
		System.out.println("상품 ID : " + this.getIdent());
		System.out.println("상품 설명 : " + this.getExplain());
		System.out.println("생산자 : " + this.getCreator());
		System.out.println("가격 : " + this.getPrice());
	}

}

class CompactDisc extends Product {
	private String albumTitle;
	private String singer;

	public CompactDisc() {
		super();
		Scanner in = new Scanner(System.in);

		System.out.print("앨범 제목 : ");
		albumTitle = in.next();
		System.out.print("가수 이름 : ");
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
		System.out.println("앨범 제목 : " + this.getAlbumTitle());
		System.out.println("가수 이름 : " + this.getSinger());
	}
}

class Book extends Product {
	private int isbn;
	private String author;
	private String bookTitle;

	public Book() {
		super();
		Scanner in = new Scanner(System.in);
		System.out.print("책 제목 : ");
		bookTitle = in.nextLine();
		System.out.print("저자  : ");
		author = in.nextLine();
		System.out.print("ISBN 번호 : ");
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
		System.out.println("책 제목 : " + this.getBookTitle());
		System.out.println("저자 : " + this.getAuthor());
		System.out.println("ISBN : " + this.getISBN());
	}

}

class ConverstationBook extends Book {
	private String language;

	public ConverstationBook() {
		super();
		Scanner in = new Scanner(System.in);

		System.out.print("언어 : ");
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
		System.out.println("언어 : " + this.getLanguage());
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
				System.out.print("상품 종류 책(1), 음악CD(2), 회화책(3) : ");
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
		System.out.print("상품 추가(1), 모든 상품 조회(2), 끝내기(3) : ");
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

package Chapter04__ClassAndObject;

public class Book {
	private String title;
	private String author;
	private int ISBN;
	
	public Book(String title, String author, int isbn) {
		this.title = title;
		this.author = author;
		this.ISBN = isbn;
		
	}
	
	public static void main(String[] args) {
		Book bp = new Book("JDK", "이클립스", 1234567);
		
	}
}

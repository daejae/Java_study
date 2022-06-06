package Sol;

class MyPoint1 {
	private int x;
	private int y;

	public MyPoint1(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return this.getClass().getName() + "(" + this.x + ", " + this.y + ")";
	}

}

public class p364_01 {
	public static void main(String[] args) {
		MyPoint1 p = new MyPoint1(3, 4);
		System.out.println(p);
	}
}

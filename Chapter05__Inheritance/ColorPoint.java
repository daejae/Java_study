package Chapter05__Inheritance;
class Point {
	private int x;
	private int y;
	
	void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	void showPoint() {
		System.out.printf("(%d, %d)\n", x, y);
	}
}
public class ColorPoint extends Point{
	private String color;
	
	void setColor(String color) {
		this.color = color;
	}
	void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
	
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint();
		cp.set(10, 20);
		cp.setColor("red");
		cp.showColorPoint();
	}
}

package Sol;

class CPoint {
	int x;
	int y;

	public CPoint(int x, int y) {
		this.x = x;
		this.y = y;

	}
	public int getX() { return x;}
	public int getY () { return y;}

	public void show() {
		System.out.printf("(%d, %d)\n", this.x, this.y);
	}
	public void show(String color) {
		System.out.printf("(%d, %d)%s\n", this.x, this.y, color);
	}
	public String toString(){
		return "("+x+", "+y+")"+ "¿‘¥œ¥Ÿ.";
	}

}

class CColorPoint extends CPoint {
	String color;

	public CColorPoint(int x, int y, String col) {
		super(x, y);
		color = col;
	}
	public void show(){
		super.show(color);
	}
	
}

public class p303_04 {
	public static void main(String[] args) {
		CPoint a,b;
		
		a = new CPoint(2,3 );
		b = new CColorPoint(3,4,"red");
		a.show();
		b.show();
		System.out.println(a);
		System.out.println(b);
		
	}
}

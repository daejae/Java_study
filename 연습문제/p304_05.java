package Sol;
abstract class MyPoint{
	int x;
	int y;
	
	public MyPoint(int x, int y) {
		this.x   = x;
		this.y = y;
	}
	
	protected abstract void move(int x, int y);
	protected abstract void reverse();
	protected void show() {
		System.out.println(x+" " + y);
	}
}
class MyColorPoint extends MyPoint{
	private String color;
	
	public MyColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void move(int x, int y) {
		// TODO Auto-generated method stub
		super.x = x;
		super.y = y;
	}

	@Override
	protected void reverse() {
		// TODO Auto-generated method stub
		int temp = super.x;
		super.x = super.y;
		super.y = temp;
	}
	protected void show(){
		System.out.println(super.x +", "+super.y+", "+color);
	}

	
	
}

public class p304_05 {
	public static void main(String[] args) {
		MyPoint p = new MyColorPoint(2, 3, "blue");
		p.move(3, 4);
		p.reverse();
		p.show();
		
	}

}

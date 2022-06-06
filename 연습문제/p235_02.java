package Sol;
class Rectangle{
	private int x1,x2,y1,y2;
	
	public Rectangle() {
		x1 =0;
		x2 = 0;
		y1 = 0;
		y2 = 0;
	}
	public Rectangle(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	public void set(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	public int square() {
		return Math.abs(y1-y2) *Math.abs(x1-x2);
	}
	public void show() {
		System.out.printf("(%d, %d)   (%d, %d)\n",x1, y1, x2, y2);
		System.out.println("사각형의 넓이 : " + square());
		
	}
	
	public boolean equals(Rectangle r) {
		if(this.x1 == r.x1 && this.x2 == r.x2 && this.y1 == r.y1 && this.y2 == r.y2)
			return true;
		else 
			return false;
	}
}

public class p235_02 {
	public static void main(String[] args){
		Rectangle r = new Rectangle();
		Rectangle s = new Rectangle(1, 1, 2, 3);
		
		r.show();
		s.show();
		System.out.println(s.square());
		r.set(-2, -2, -1, 4);
		r.show();
		System.out.println(r.square());
		if(r.equals(s))
			System.out.println("두 사각형은 같습니다.");
	}
}

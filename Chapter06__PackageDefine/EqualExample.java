package Chapter06__PackageDefine;
class Rect {
	int width;
	int height;
	public Rect(int x, int y) {
		width = x;
		height = y;
	}
	
	public boolean equals(Rect p)
	{
		if(this.width*this.height == p.width*p.height) return true;
		return false;
	}
	
}

public class EqualExample {
	public static void main(String[] args) {
		Rect a= new Rect(2,3);
		Rect b = new Rect(3,2);
		
		if(a.equals(b))
			System.out.println("same");
	}
}

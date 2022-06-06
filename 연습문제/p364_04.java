package Sol;

class Circle1 {
	private int x;
	private int y;
	private int radius;

	public Circle1(int x, int y, int z) {
		this.x = x;
		this.y = y;
		radius = z;
	}

	public int getRadius() {
		return radius;
	}

	public boolean equals(Circle1 c) {
		if (this.radius == c.getRadius())
			return true;
		else
			return false;
	}
}

public class p364_04 {
	public static void main(String[] args) {
		Circle1 c1 = new Circle1(3, 2, 5);
		Circle1 c2 = new Circle1(1, 1, 5);

		if (c1.equals(c2))
			System.out.println("같은 값을 가진 객체입니다.");
	}

}

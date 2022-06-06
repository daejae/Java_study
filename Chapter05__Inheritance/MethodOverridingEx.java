
package Chapter05__Inheritance;

class DObject {
	public DObject next;

	public DObject() {
		next = null;
	}

	public void draw() {
		System.out.println("DObject draw");
	}
}

class Line extends DObject {
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends DObject {
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends DObject {
	public void draw() {
		System.out.println("circle");
	}
}

public class MethodOverridingEx {
	public static void main(String[] args) {
		DObject obj = new DObject();
		Line line = new Line();
		DObject p = new Line();
		DObject r = line;

		obj.draw();		// obj
		line.draw();	// line
		p.draw();		// line
		r.draw();		// line

		DObject rect = new Rect();
		DObject circle = new Circle();
		rect.draw();		// rect
		circle.draw();		// circle
	}

}

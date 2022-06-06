package Chapter07__Collection_and_Generics;

import java.util.Vector;

class Point1 {
	private int x;
	private int y;

	public Point1(int x, int y) {
		this.x = x;
		this.y = y;

	}
	public String toString(){
		return "("+x+", "+y+")";
	}

}

public class PointVectorExample {
	public static void main(String[] args) {
		Vector<Point1> v = new Vector<Point1>();
		v.add(new Point1(2,3));
		v.add(new Point1(-5,20));
		v.add(new Point1(30, -8));
		
		for(int i=0; i<v.size();i++){
			Point1 p = v.get(i);
			System.out.println(p);
		}
	}
}

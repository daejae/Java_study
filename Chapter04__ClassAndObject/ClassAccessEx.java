package Chapter04__ClassAndObject;

class Simple {
	public int a;
	private int b;
	int c;	// default
	public int getB() { return b;}
	public void setB(int value) { b = value;}
}

public class ClassAccessEx {
	public static void main(String[] args) {
		Simple test = new Simple();
		test.a = 10;
		//test.b = 10;
		test.setB(10);
		test.c = 10;
	
	}

}

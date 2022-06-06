package Chapter04__ClassAndObject;

public class GarbageEx {
	public static void main(String[] args) {
		String a = new String("good");
		String b = new String("bad");
		String c = new String("normal");
		String d,e;
		
		a= null;		// Create the garbage.
		d = c;
		c= null;
	}

}

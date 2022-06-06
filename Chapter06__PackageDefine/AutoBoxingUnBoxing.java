package Chapter06__PackageDefine;

public class AutoBoxingUnBoxing {
	public static void main(String[] args) {
		int i = 10;
		Integer intObject = i; // auto boxing
		// Integer intObject = new Integer(10);
		System.out.println("intObject = " + intObject);
		i = intObject + i; // auto unboxing
		// i = intObject.intValue() + i;
		System.out.println("i = " + i);

	}
}

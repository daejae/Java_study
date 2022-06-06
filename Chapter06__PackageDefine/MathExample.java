package Chapter06__PackageDefine;

public class MathExample {
	public static void main(String[] args) {
		double a = -2.123321551234;
		System.out.println(Math.abs(a));
		System.out.println(Math.ceil(a));
		System.out.println(Math.floor(a));
		System.out.println(Math.sqrt(9.0));
		System.out.println(Math.exp(1.5));
		System.out.println(Math.rint(3.123456));
		
		for(int i=0; i< 5; i++)
			System.out.println(Math.round(1+Math.random()*44));
		
	}
}

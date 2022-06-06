package Chapter05__Inheritance;
abstract class Calculator{
	public abstract int add(int a, int b);
	public abstract int subtract(int a, int b);
	public abstract double average(int[] a);
}
public class GoodCalc extends Calculator{
	public int add(int a, int b) {
		return a + b;
	}
	public int subtract(int a, int b) {
		return a-b;
	}
	public double average(int[] a) {
		double sum =0;
		for(int i=0 ; i < a.length;i++)
			sum+=a[i];
		
		return sum/a.length;
	}
	public static void main(String[] args) {
		Calculator cal = new GoodCalc();
		System.out.println(cal.add(3, 6));
		System.out.println(cal.subtract(10, 2));
		System.out.println(cal.average(new int[] {2,3,4,5}));
	}
}

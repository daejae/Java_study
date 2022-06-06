package Chapter01__Start_Java;

public class hello2 {
	public static void main(String[] args) {
		int i, j;
		char c;
		String b;
		final int TEN = 10;
		
		i=1;
		j = sum(i, TEN);
		c = '?';
		b="Hello";
		
		java.lang.System.out.println(c);
		System.out.println(b);
		System.out.println(j);
		System.out.println(TEN);
		
		
	}
	public static int sum(int i, int j) {
		return i+j;
	}
}

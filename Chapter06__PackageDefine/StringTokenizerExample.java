package Chapter06__PackageDefine;

//import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		java.util.StringTokenizer st = new java.util.StringTokenizer("이대재/홍길동/장화/옥계/경운대/컴공/2015", "/");

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		String a = "as";
		StringBuffer b = new StringBuffer("as");
		
		System.out.println(a+b);
		String a1 = a.concat("gg");
		b.append(new StringBuffer("gg"));
		System.out.println(a1);
		System.out.println(b);
	}
}
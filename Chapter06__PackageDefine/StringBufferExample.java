package Chapter06__PackageDefine;

public class StringBufferExample {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb.hashCode());
		sb.append(" is pencill");
		System.out.println(sb);
		sb.insert(7, " my");
		System.out.println(sb);
		sb.replace(8, 10, "your");
		System.out.println(sb);
		sb.setLength(5);
		System.out.println(sb);
		System.out.println(sb.hashCode());
		}
}

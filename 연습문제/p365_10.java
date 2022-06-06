package Sol;

import java.util.StringTokenizer;

public class p365_10 {
	public static void main(String[] args) {
		String str = new String();
		for(int i=0 ;i<args.length;i++)
			str = str.concat(args[i]);
		System.out.println(str);
		StringTokenizer st = new StringTokenizer(str,"&=");
		int a= st.countTokens();
		for(int i=1; i<=a;i++)
		{
//			System.out.println(i);
			System.out.print(st.nextToken()+"\t");
			if(i%2==0)
				System.out.println("");
		}
	}
}

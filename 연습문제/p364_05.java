package Sol;

public class p364_05 {
	public static void main(String[] args) {
//		String str = new String(args);
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<args.length;i++){
			if(args[i].equals("is"))
				sb.append("are ");
			else
			sb.append(args[i]+" ");
		}
//		System.out.println(args.replace("is","are"));
		System.out.println(sb);
		
	}

}
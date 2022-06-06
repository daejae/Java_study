package Sol;

public class p165_10_isNumber {
	public static void main(String[] args) {
		int sum=0;
	
		for(int i=0 ; i<args.length ; i++)
			if(isNum(args[i]))
				sum+=Integer.parseInt(args[i]);
			System.out.println(sum);

	}
	static boolean isNum(String arr) {
		boolean is = false;
		try {
			if(Integer.parseInt(arr)!=0)
				is = true;
			return is;
		}
		catch (NumberFormatException e){
			return is;
		}
	}
}

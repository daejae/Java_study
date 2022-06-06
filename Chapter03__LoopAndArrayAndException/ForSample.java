package Chapter03__LoopAndArrayAndException;

public class ForSample {
	public static void main(String[] args) {
		int i,j;
		
		for(i=1, j=0 ; i<=10 ; i++) {
			j+=i;
			System.out.print(i);
			if(i==10)
				System.out.print("=");
			else
				System.out.print("+");
		}
		System.out.println(j);
	}

}

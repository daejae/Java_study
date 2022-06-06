package Chapter03__LoopAndArrayAndException;

public class Two_Dimensional_Array_Regular {
	public static void main(String[] args) {
		int intArray[][] = { {90, 90, 110, 110},
							 {120, 110, 100, 110},
							 {120, 140, 130, 150}};
		double sum=0;
		for(int i=0; i<intArray.length;i++)
		{
			for(int j=0; j<intArray[i].length; j++)
				sum+=intArray[i][j];
		}
		System.out.println(sum);
		System.out.println(sum/intArray.length);
		
}

}

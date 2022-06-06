package Chapter03__LoopAndArrayAndException;

public class RetuenArray_Function {
	
	public static void main(String[] args) {
		int arr[];
		arr = makeArray();
		
		for(int i=0; i< arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println("");
		
		// 문제풀이 p145 _ 03
		
		int array[][] = new int[4][];
		array[0] = new int[4];
		array[1] = new int[1];
		array[2] = new int[1];
		array[3] = new int[4];
		
		
		
	}
	static int[] makeArray() {
		int arr[] = new int[5];
		
		for(int i=0; i<arr.length ; i++)
			arr[i] = i;
		return arr;
	}
}

package Sol;
class ArrayUtility{
	
	static double[] intToDouble(int[] source){
		double[] arr = new double[source.length];
		for(int i=0; i<source.length;i++)
			arr[i] = (double)source[i];
		return arr;		
	}
	
	static int[] doubleToInt(double[] source){
		int[] arr = new int[source.length];
		for(int i=0 ; i<source.length ; i++)
			arr[i] = (int)source[i];
		return arr;
	}
	
	static void printArray(int[] arr){
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println("");
	}
	static void printArray(double[] arr){
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println("");
	}
}

class ArrayUtility2 {
	static int[] concat(int[] s1, int[] s2) {
		int[] arr = new int[s1.length + s2.length];
		for(int i=0 ; i<s1.length ;i++)
			arr[i] = s1[i];
		for(int i=0; i<s2.length ; i++)
			arr[i+s1.length] = s2[i];
		return arr;
	}
	static int[] remove(int[]s1, int[] s2) {
		int count=0;
		for(int i=0; i<s1.length; i++) {
			for(int j =0; j<s2.length;j++)
				if(s1[i] == s2[j])
					count++;
		}
		System.out.println("같은 숫자의 개수 : "+ count);
		int[] arr = new int[s1.length-count];
		
		for(int z=0, k=0 ; z<s1.length;z++){
			boolean flag= true;
			for(int j=0;j<s2.length;j++)
				if(s1[z]==s2[j])
					flag = false;
			if(flag == true){
				arr[k] = s1[z];
				k++;
			}
		}
		return arr;		
	
}
}

public class p236_03 {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
		double[] arr2 = {1.0, 2,3, 4, 5, 6,7.12, 8, 9.123,10123.123};
		
		ArrayUtility.printArray(arr2);
		arr1 = ArrayUtility.doubleToInt(arr2);
		ArrayUtility.printArray(arr1);
		
		int[] arr3 = {1,2,3,4,5,6,7,8,9};
		int[] arr4 = {5, 6,7,8,9};
		ArrayUtility.printArray(ArrayUtility2.remove(arr3, arr4));
		
	}		
}

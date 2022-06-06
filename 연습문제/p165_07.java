package Sol;
import java.util.Random;
public class p165_07 {
	public static void main(String[] args) {
		Random random = new Random();
		int arr[][] = new int[4][4];
		for(int i=0;i<arr.length ; i++)
			for(int j=0; j<arr[i].length ; j++)
				//arr[i][j] =(int)Math.round(Math.random()*9 +1);
				arr[i][j] = random.nextInt(10)+1;
		for(int i=0;i<arr.length ; i++){
			for(int j=0; j<arr[i].length ; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println("");
		}
	}
}

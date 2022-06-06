package Sol;
import java.util.Random;

public class p165_08 {
	public static void main(String[] args) {
		Random random = new Random();
		int arr[][] =new int[4][4];
		int count=0;
		int temp[] =new int[2];
		
		while(count!=8){
			temp[0] = random.nextInt(4);
			temp[1] = random.nextInt(4); 
			if(arr[temp[0]][temp[1]]==0) {
					arr[temp[0]][temp[1]] = random.nextInt(9)+1;
					count++;
			}
		}
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0; j<arr[i].length; j++)
				System.out.print(arr[i][j]+" ");
			System.out.println("");
		}
	}
}

package Sol;

import java.util.Random;

public class p364_02 {
	public static void main(String[] args) {
		Random random = new Random();
		for(int i=0; i<10;i++)
			System.out.println(Math.round(random.nextDouble()*40+10));
		
		
	}
}

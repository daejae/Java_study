package Sol;

public class p166_12 {
	public static void main(String[] args) {
		for(int i=1 ; i<100 ; i++) {
			int count=0;
			if(i%10 == 3 || i%10 == 6 || i%10 == 9) count++;
			if(i/10 == 3 || i/10 == 6 || i/10 == 9) count++;
			if(count!=0) {
				System.out.print(i + " �ڼ� ");
				if(count==1)
					System.out.println("�ѹ�");
				else
					System.out.println("�ι�");
			}
			
		}
			
	}
}

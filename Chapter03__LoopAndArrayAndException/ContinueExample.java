package Chapter03__LoopAndArrayAndException;

public class ContinueExample {
	public static void main(String[] args) {
		int sum=0;
		
		for(int i=0 ; i<=100 ; i++){
			if(i%2 ==1)
				continue;
			sum+=i;
		}
		System.out.println("1 ~ 100 까지 짝수의 합은 " + sum +  " 입니다.");
	}
	

}

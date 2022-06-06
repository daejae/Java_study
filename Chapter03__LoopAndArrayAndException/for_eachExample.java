package Chapter03__LoopAndArrayAndException;

public class for_eachExample {
	enum Week {월, 화, 수, 목, 금, 토, 일};
	public static void main(String[] args) {
		int num[] = {1, 2, 3, 4, 5};
		String str[] = { "사과", "배", "딸기", "바나", "체리", "포도"};
		int sum=0;
		
		for(int i : num)
			sum+=i;
		System.out.println("합 : " + sum);
		
		for(String a : str)
			System.out.print(a + " ");
		System.out.println("");
		
		for(Week day : Week.values())
			System.out.print(day + " ");
		System.out.println(" ");
			
	}

}
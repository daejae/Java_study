package Chapter03__LoopAndArrayAndException;

public class for_eachExample {
	enum Week {��, ȭ, ��, ��, ��, ��, ��};
	public static void main(String[] args) {
		int num[] = {1, 2, 3, 4, 5};
		String str[] = { "���", "��", "����", "�ٳ�", "ü��", "����"};
		int sum=0;
		
		for(int i : num)
			sum+=i;
		System.out.println("�� : " + sum);
		
		for(String a : str)
			System.out.print(a + " ");
		System.out.println("");
		
		for(Week day : Week.values())
			System.out.print(day + " ");
		System.out.println(" ");
			
	}

}
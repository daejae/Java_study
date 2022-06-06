package Chapter02__Basic_Java_Programming;

public class UnaryOperator {
	public static void main(String[] args) {
		int opr=0;
		opr +=3;
		System.out.println(opr++);	// 3
		System.out.println(opr);	// 4
		System.out.println(++opr);	//5
		System.out.println(opr);	//5
		System.out.println(opr--);	// 5\
		System.out.println(opr);	// 4
		System.out.println(--opr);	//3
		System.out.println(opr);	//3
		
	}
	
}
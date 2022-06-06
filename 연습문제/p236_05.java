package Sol;
import java.util.Scanner;

class Add{
	private int a,b;
	void setValue(int x, int y) {
		a = x;
		b = y;
	}
	int calculate(){
		return a+b;
	}	
}

class Sub{
	private int a;
	private int b;
	
	void setValue(int x, int y) {
		a = x;
		b = y;
	}
	int calculate() {
		return a-b;
	}
}
class Mul {
	private int a;
	private int b;
	void setValue(int x, int y) {
		a = x;
		b = y;	
	}
	int calculate() {
		return a*b;
	}
	
}

class Div{
	private int a;
	private int b;
	void setValue(int x, int y) {
		a = x;
		b = y;
	}
	int calculate(){
		return a/b;
	}
}

public class p236_05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오  : ");
		int operand1 = in.nextInt();
		int operand2 = in.nextInt();
		String operator = in.next();
		char op = operator.charAt(0);
		
		switch(op){
		case '+' :
			Add add = new Add();
			add.setValue(operand1, operand2);
			System.out.println(add.calculate());
			break;
		case '-':
			Sub sub = new Sub();
			sub.setValue(operand1, operand2);
			System.out.println(sub.calculate());
			break;
		case '*':
			Mul mul = new Mul();
			mul.setValue(operand1, operand2);
			System.out.println(mul.calculate());
			break;
		case '/':
			Div div = new Div();
			div.setValue(operand1, operand2);
			System.out.println(div.calculate());
			break;
		}
		
		}
		
}

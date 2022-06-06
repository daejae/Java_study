package Sol;

interface Stack {
	int length();

	Object pop();

	boolean push(Object ob);
}

class StringStack implements Stack {
	private String[] stack;
	private int top;

	public StringStack(int size) {
		stack = new String[size];
		top = -1;
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return this.stack.length;
	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		this.top--;
		return null;
	}

	@Override
	public boolean push(Object ob) {
		this.stack[++top] = (String) ob;
		// TODO Auto-generated method stub
		return true;
	}
	public void print() {
		for(int i=0;i<= top;i++)
			System.out.print(stack[i]+ " ");
		System.out.println("");
	}

}

public class p303_03 {
	public static void main(String[] args) {
		StringStack arr = new StringStack(10);
		arr.push("이대재");
		arr.push("이상묵");
		arr.push("컴퓨터공학과");
		
		arr.print();
		arr.pop();
		arr.print();
	}
}

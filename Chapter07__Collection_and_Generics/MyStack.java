package Chapter07__Collection_and_Generics;
class GStack<T>{
	int top;
	Object[] ob;
	public GStack(){
		top = -1;
		ob = new Object[10];
	}
	public void push(T a){
		if(top<10){
			ob[++top]=a;
		}
	}
	public T pop(){
		if(top>-1 && top<10)
			return (T)ob[top--];
		return null;
	}
}

public class MyStack {
	public static void main(String[] args) {
		GStack<String> stringStack = new GStack<String>();
		stringStack.push("이대재");
		stringStack.push("컴공");
		stringStack.push("java");
		
		for(int i=0; i<3;i++)
			System.out.println(stringStack.pop());
		
		GStack<Integer> integerStack = new GStack<Integer>();
		integerStack.push(10);
		integerStack.push(-1);
		integerStack.push(54);
		
		for(int i=0; i<3 ; i++)
			System.out.println(integerStack.pop());
		
	}
}

package Chapter05__Inheritance;

class A {
	public A() {
		// TODO Auto-generated constructor stub
		System.out.println("A �⺻ ������");
	}

	public A(int x) {
		// TODO Auto-generated constructor stub
		System.out.println("A �⺻ ������");
		System.out.println(x);
	}
}

class B extends A {
	public B() {
		// TODO Auto-generated constructor stub
		System.out.println("B �⺻ ������");
	}

	public B(int x) {
		// TODO Auto-generated constructor stub
		super(x);
		System.out.println("B �⺻ ������");
		System.out.println(x);
	}

}

public class MP {
	public static void main(String[] args) {
		B b = new B(3);
		
	}
}

package Chapter05__Inheritance;
class Person01 {
	int age;
	public String name;
	protected int height;
	private int weight;
	
	void setWeight(int a) {
		weight = a;
	}
	int getWeight() {
		return weight;
	}
}

public class Student01 extends Person01{
	void set() {
		age = 20;
		name="¿Ã¥Î¿Á";
		height=175;
		setWeight(65);
	}
	public static void main(String[] args) {
		Student01 st = new Student01();
		st.set();
	}

}

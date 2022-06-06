package Chapter05__Inheritance;

class Person02 {
}

class Student02 extends Person02 {
}

class Researcher02 extends Person02 {

}

class Professor02 extends Researcher02 {

}

public class InstanceofExample {
	public static void main(String[] args) {
		Person02 jee = new Student02();
		Person02 lee = new Researcher02();
		Person02 kim = new Professor02();

		if (jee instanceof Person02)
			System.out.println("jee is Person class");
		if (jee instanceof Student02)
			System.out.println("jee is Student class");
		if (jee instanceof Researcher02)
			System.out.println("jee is Researcher calss");
		if (jee instanceof Professor02)
			System.out.println("jee is Professor class");
		if (lee instanceof Person02)
			System.out.println("lee is Person class");
		if (lee instanceof Student02)
			System.out.println("lee is Student class");
		if (lee instanceof Researcher02)
			System.out.println("lee is Researcher class");
		if (lee instanceof Professor02)
			System.out.println("lee is Professor class");
		if (kim instanceof Person02)
			System.out.println("kim is Person class");
		if (kim instanceof Student02)
			System.out.println("kim is Student class");
		if (kim instanceof Researcher02)
			System.out.println("kim is Researcher class");
		if (kim instanceof Professor02)
			System.out.println("kim is Professor class");
		
		Integer i = new Integer(55);
		if(i instanceof Integer)
			System.out.println(i);
	}
}

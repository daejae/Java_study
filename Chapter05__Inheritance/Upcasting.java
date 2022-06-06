package Chapter05__Inheritance;

class PersonEx{
	String name;
	String id;
	
	public PersonEx(String name, String id){
		this.name = name;
		this.id = id;
	}
	
}

class StudentEx1 extends PersonEx{
	String grade;
	String department;
	
	public StudentEx1(String name, String id, String grade, String department){
		super(name, id);
		this.grade = grade;
		this.department = department;
	}
	
}

public class Upcasting {
	public static void main(String[] args){
		StudentEx1 s = new StudentEx1("leedaejae", "201502004", "ASD", "ce");
		PersonEx p = s;
	}

}

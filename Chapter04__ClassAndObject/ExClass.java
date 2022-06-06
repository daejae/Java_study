package Chapter04__ClassAndObject;
class ExPerson{
	private String name;
	private int age;
	
	public ExPerson(){
		
	}
	public ExPerson(String name){
		this.name = name;
	}
	public String getName(){
		return name;
		
	}
	public void setAge(int age){
		this.age =age;
	}
	public int getAge(){
		return age;
	}
}

public class ExClass {
	public static void main(String[] args) {
		ExPerson person = new ExPerson("이미남");
		person.setAge(30);
		System.out.println("이름 : "+ person.getName() +"\n나이 : "+person.getAge());
	}
}

package Chapter05__Inheritance;

class Person03{
	private String phone;
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return phone;
	}
	
}
class Professor03 extends Person03 {
	public String getPhone() {
		return "Professor : " + super.getPhone();
	}

}

public class Overriding {
	public static void main(String[] args) {
		Professor03 a = new Professor03();
		a.setPhone("010-4598-5641");
		System.out.println(a.getPhone());
		
		Person03 p = a;
		System.out.println(p.getPhone());
	}
}

package Chapter04__ClassAndObject;

public class PersonArray01 {
	public static void main(String[] args){
		ExPerson[] pa;
		pa = new ExPerson[10];
		
		for(int i=0;i <pa.length;i++){
			pa[i] = new ExPerson();
			pa[i].setAge(i+30);
			System.out.println("pa[" + i +"]" + pa[i].getAge());
			
		}
	}
}

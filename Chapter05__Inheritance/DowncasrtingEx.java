package Chapter05__Inheritance;

public class DowncasrtingEx {
	public static void main(String[] args){
		PersonEx p = new PersonEx("leedaejae", "201502004");
		//StudentEx1 s = p;
		StudentEx1 s = (StudentEx1)p;
		
	}
}

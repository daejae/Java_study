package Chapter04__ClassAndObject;
class StaticSample{
	public int N;
	public void g(){
		m=20;
	}
	public void h(){
		m = 20;
	}
	public static int m;
	public static void f(){
		m=5;
	}
}

public class Ex {
	public static void main(String[] args){
		StaticSample s1, s2;
		s1 = new StaticSample();
		s1.N=5;
		s1.g();
		s1.m=50;
		s2 = new StaticSample();
		s2.N=8;
		s2.h();
		s2.f();
		System.out.println(s1.m);
		
		StaticSample.m = 10;
		
		StaticSample s3 = new StaticSample();
		System.out.println(s3.m);
		s3.f();
		StaticSample.f();
		
		
	}
}

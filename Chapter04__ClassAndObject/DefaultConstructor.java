package Chapter04__ClassAndObject;

public class DefaultConstructor {
	int x;
	public void setX(int x) { this.x = x;}
	public int getX(){return this.x;}
	public DefaultConstructor(int x){this.x =x;}
	
	public static void main(String[] args){
		DefaultConstructor p1 = new DefaultConstructor(3);
		int n = p1.getX();
		
		
	}	
}

package Chapter02__Basic_Java_Programming;

public class Ex2_01_CircleArea {
	public static void main(String[] args) {
		final double PI = 3.14;
		double circleArea=0;
		double radius=10;
		
		circleArea = radius * PI;
		
		System.out.println("원의 면적 = "+circleArea);
	}

}

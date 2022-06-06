package Sol;

import java.util.Scanner;

abstract class DObject {
	public DObject next;

	public DObject() {
		next = null;
	}

	abstract public void draw();
}

class Line extends DObject {
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends DObject {
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends DObject {
	public void draw() {
		System.out.println("circle");
	}
}

public class p305_06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DObject[] p = new DObject[10];
		int count=-1;
		int choice = 0;

		while (choice != 4) {
			choice = menu();
			switch (choice) {
			case 1:
				create(p,++count);
				break;
			case 2:
				remove(p, count--);
				break;
			case 3:
				for( int i=0 ; i< p.length && i<=count ; i++)
					p[i].draw();
				break;
			}
		}
	}

	public static void remove(DObject[] p, int count){
		Scanner in = new Scanner(System.in);
		System.out.print("삭제할 도형의 위치 : ");
		int point = in.nextInt();
		
		for(int i = point-1 ; i<count ; i++)
			p[i] = p[i+1];
		
		
	}
	public static int menu() {
		Scanner in = new Scanner(System.in);
		System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) 선택 : ");
		return in.nextInt();
	}
	public static void create(DObject[] p, int count) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("도형 종류  Line(1), Rect(2), Circle(3) : ");
		int cho = in.nextInt();
		
		switch(cho){
		case 1:
			p[count]= new Line();
			break;
		case 2:
			p[count] = new Rect();
			break;
		case 3:
			p[count] = new Circle();
			break;
		}
	}
}

package Sol;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Student3{
	private String name;
	private String major;
	private int iNumber;
	private int iScore;
	
	public Student3(){
		Scanner in = new Scanner(System.in);
		System.out.print("이름 : ");
		this.name = in.next();
		System.out.print("학과 : ");
		this.major=in.next();
		System.out.print("학번 : ");
		this.iNumber=in.nextInt();
		System.out.print("평균 학점 : ");
		this.iScore = in.nextInt();
	}
	public String toString(){
		return "학점 : "+this.iScore;
	}
}
public class p411_05 {
	public static void main(String[] args) {
		ArrayList<Student3> list = new ArrayList<Student3>();
		for(int i=0; i<5;i++)
			list.add(new Student3());
		Iterator<Student3> it = list.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
	
	}
}

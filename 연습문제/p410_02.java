package Sol;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class p410_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Character> list = new ArrayList<>();
		
		for(int i=0; i< 5; i++){
			System.out.print("학점을 입력하세요 : ");
			char score = in.next().charAt(0);
			list.add(score);
		}
		
		Iterator it = list.iterator();
		while(it.hasNext()){
			char temp = (char)it.next();
			switch(temp){
			case 'A':
				System.out.println("4.0");
				break;
			case 'B':
				System.out.println("3.0");
				break;
			case 'C':
				System.out.println("2.0");
				break;
			case 'D':
				System.out.println("1.0");
				break;
			case 'F':
				System.out.println("0");
				break;
			}
		}
	}
}

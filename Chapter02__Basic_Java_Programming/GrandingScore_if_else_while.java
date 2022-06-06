package Chapter02__Basic_Java_Programming;
import java.util.Scanner;

public class GrandingScore_if_else_while {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			//System.out.print("성적을 입력하세요 : ");	// 이건 출력이 안됨 왜그런지 모름 확인 요망.
			int score = in.nextInt();
			char grade;
			
			grade = (score>=90)?'A':(score>=80)?'B':(score>=70)?'C':'D';
			System.out.println(grade);
			/*
			if(score>=95)
				System.out.println("A+ 입니다.");
			else if(score >=90)
				System.out.println("A 입니다.");
			else if(score >=85)
				System.out.println("B+ 입니다.");
			else if(score >=80)
				System.out.println("B 입니다.");
			else if(score >=70)
				System.out.println("C 입니다.");
			else
				System.out.println("D 입니다.");
				*/
			
		}
	}
}

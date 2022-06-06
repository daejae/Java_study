package Chapter07__Collection_and_Generics;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
	public static void main(String[] args) {
		// 문자열만 삽입가능한 ArrayList 컬렉션 생성
		ArrayList<String> a = new ArrayList<String>();
		
		// 키보드로부터 4개의 이름을 입력받아 ArrayList에 삽입
		Scanner in = new Scanner(System.in);
		for(int i=0;i<4;i++){
			System.out.print("이름을 입력하세요 : ");
			String s = in.next();
			a.add(s);
		}
		
		// ArrayList에 들어 있는 모든 이름 출력
		for(int i=0;i<a.size();i++){
			System.out.print(a.get(i)+" ");
		}
		
		// 가장 긴 이름 출력
		int longestIndex = 0; 	// 현재 가장 긴 이름이 있는 ArrayList 내의 인덱스
		for(int i=1;i<a.size();i++){
			if(a.get(longestIndex).length()<a.get(i).length())
				longestIndex=i;
		}
		System.out.println("\n가장 긴 이름은 : "+ a.get(longestIndex));
	}

}

package Sol;

import java.io.IOException;
import java.io.InputStreamReader;

public class p360_AlphabetHistory {
	public static void main(String[] args) {
		InputStreamReader rd = new InputStreamReader(System.in);
		char[] arr = new char[26];
		char ch;
		int a;
		try{
			while(true) {
				a = rd.read();
				if(a == -1)
					break;
				//System.out.println((char)a);
				if(a>=65&&a<=90)
					arr[a-65]++;
				else if(a>=97&&a<=122)
					arr[a-97]++;
			}
			for(int i=0;i<arr.length;i++){
				ch=(char)(i+65);
				System.out.print(ch+" : ");
				for(int j=0;j<arr[i];j++)
					System.out.print("_");
				System.out.println("");
			}
		}
		catch(IOException e) {
			System.out.println("입력 오류 발생");
		}
	}
}

package Chapter16__NetWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class URLRead {
	public static void main(String[] args){
		try{
			URL aURL = new URL("http://www.nate.com");
			BufferedReader in = new BufferedReader(new InputStreamReader(aURL.openStream()));
			String inputLine;
			
			while((inputLine = in.readLine()) != null)	// 한 행씩 읽음
				System.out.println(inputLine);
			in.close();
		}catch(IOException e){
			System.out.println("URL에서 데이터를 읽는 중 오류가 발생했습니다.");
			
		}
	}
}
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
			
			while((inputLine = in.readLine()) != null)	// �� �྿ ����
				System.out.println(inputLine);
			in.close();
		}catch(IOException e){
			System.out.println("URL���� �����͸� �д� �� ������ �߻��߽��ϴ�.");
			
		}
	}
}
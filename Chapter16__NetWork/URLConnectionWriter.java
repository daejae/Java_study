package Chapter16__NetWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionWriter {
	public static void main(String[] args) {
		try{
			URL aURL = new URL("http://httpbin.org/post");	// POST�� ������ ����Ʈ URL ��ü ����
			URLConnection uc = aURL.openConnection();	// URLConnectuin ��ü ����
			uc.setDoOutput(true);	// ��� ��� ����
			OutputStreamWriter out = new OutputStreamWriter(uc.getOutputStream());	// ��� ��Ʈ�� ����
			out.write("Firstname=Lee&Lastname=daejae");	// ������ ������ ������
			out.close();
			
			BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));	
			// �������� ������ �б� ���� �Է� ��Ʈ�� ����
			String inputLine;
			
			while((inputLine=in.readLine())!=null){
				System.out.println(inputLine);
			}
			in.close();
			
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}

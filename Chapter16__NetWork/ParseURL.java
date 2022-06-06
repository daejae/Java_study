package Chapter16__NetWork;

import java.net.MalformedURLException;
import java.net.URL;

public class ParseURL {
	public static void main(String[] args){
		URL opinion = null;
		URL homePage = null;
		try{
			homePage = new URL("http://news.hankooki.com:80");
			opinion = new URL(homePage, "opinion/editorial.htm");
			
		} catch(MalformedURLException e){
			System.out.println("잘못된 URL입니다.");
		}
		System.out.println("protocol : "+ opinion.getProtocol());
		System.out.println("host : "+ opinion.getHost());
		System.out.println("port : "+opinion.getPort());
		System.out.println("filename : " + opinion.getFile());		
	}
}

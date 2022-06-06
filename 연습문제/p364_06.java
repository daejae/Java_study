package Sol;

import java.io.IOException;
import java.io.InputStreamReader;

public class p364_06 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		try {
			int count = 0;
			int a;
			while (true) {
				if ((a = in.read()) == -1)
					break;
				if(a>='A' && a<='Z')
					count++;
			}
			System.out.println(count);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

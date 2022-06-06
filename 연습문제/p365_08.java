package Sol;

import java.io.IOException;
import java.io.InputStreamReader;

public class p365_08 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		int c_lenght = 0;
		int a;
		try {
			for (int i = 0, j = 0; (a = in.read()) != -1; i++) {
				if (a == ' ') {
					if (c_lenght < (i - j))
						c_lenght = i - j;
					j = i+1;
				}
			}
			System.out.println(c_lenght);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

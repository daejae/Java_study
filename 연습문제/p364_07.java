package Sol;

import java.io.IOException;
import java.io.InputStreamReader;

public class p364_07 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		int count = 0;
		int a;

		try {
			while (true) {
				if ((a = in.read()) == -1)
					break;
				if (a == ' ')
					count++;
			}
			System.out.println(count+1);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

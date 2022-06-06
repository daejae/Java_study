package Sol;

import java.util.Calendar;

public class p364_03 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Calendar cal1 = Calendar.getInstance();
		cal1.set(Calendar.HOUR_OF_DAY, 3);
		// int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
		int hourOfDay = cal1.get(Calendar.HOUR_OF_DAY);

		System.out.println(hourOfDay);
		if (hourOfDay >= 4 && hourOfDay < 13) // 4 ~ 12
			System.out.println("Good Morning");
		else if (hourOfDay < 18 && hourOfDay >= 13) // 13 ~ 17
			System.out.println("Good Afternoon");
		else if (hourOfDay < 20 && hourOfDay >= 18) // 18 ~ 19
			System.out.println("Good Evening");
		else
			System.out.println("Good Night");
	}
}

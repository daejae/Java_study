package Chapter06__PackageDefine;

import java.util.Calendar;

public class CalenderExample {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		printCalendar("지금", now);
		
		Calendar FirstContectHer = Calendar.getInstance();
		FirstContectHer.clear();
		FirstContectHer.set(2016, 9,1);
		FirstContectHer.set(Calendar.HOUR_OF_DAY, 23);
		FirstContectHer.set(Calendar.MINUTE, 10);
		printCalendar("처음 제대로 작정하고 말한 날은 ", FirstContectHer);
		

	}

	public static void printCalendar(String msg, Calendar cal) {
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		int hour = cal.get(Calendar.HOUR);
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);	
		int amap = cal.get(Calendar.AM_PM);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int millisecond = cal.get(Calendar.MILLISECOND);

		System.out.print(msg + " " + year + "/" + month + "/" + day + "/");

		switch (dayOfWeek) {
		case Calendar.SUNDAY:
			System.out.print("일요일");
			break;
		case Calendar.MONDAY:
			System.out.print("월요일");
			break;
		case Calendar.TUESDAY:
			System.out.print("화요일");
			break;
		case Calendar.WEDNESDAY:
			System.out.print("수요일");
			break;
		case Calendar.THURSDAY:
			System.out.print("목요일");
			break;
		case Calendar.FRIDAY:
			System.out.print("금요일");
			break;
		case Calendar.SATURDAY:
			System.out.print("토요일");
			break;
		}

		System.out.print("(" + hourOfDay + "시" + ")");
		if (amap == Calendar.AM)
			System.out.print("오전");
		else
			System.out.print("오후");
		System.out.println(hour+ "시 "+minute+"분 "+second+"초 "+ millisecond+"밀리초");

	}
}

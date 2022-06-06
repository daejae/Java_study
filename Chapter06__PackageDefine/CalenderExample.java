package Chapter06__PackageDefine;

import java.util.Calendar;

public class CalenderExample {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		printCalendar("����", now);
		
		Calendar FirstContectHer = Calendar.getInstance();
		FirstContectHer.clear();
		FirstContectHer.set(2016, 9,1);
		FirstContectHer.set(Calendar.HOUR_OF_DAY, 23);
		FirstContectHer.set(Calendar.MINUTE, 10);
		printCalendar("ó�� ����� �����ϰ� ���� ���� ", FirstContectHer);
		

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
			System.out.print("�Ͽ���");
			break;
		case Calendar.MONDAY:
			System.out.print("������");
			break;
		case Calendar.TUESDAY:
			System.out.print("ȭ����");
			break;
		case Calendar.WEDNESDAY:
			System.out.print("������");
			break;
		case Calendar.THURSDAY:
			System.out.print("�����");
			break;
		case Calendar.FRIDAY:
			System.out.print("�ݿ���");
			break;
		case Calendar.SATURDAY:
			System.out.print("�����");
			break;
		}

		System.out.print("(" + hourOfDay + "��" + ")");
		if (amap == Calendar.AM)
			System.out.print("����");
		else
			System.out.print("����");
		System.out.println(hour+ "�� "+minute+"�� "+second+"�� "+ millisecond+"�и���");

	}
}

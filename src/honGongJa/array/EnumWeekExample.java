package honGongJa.array;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String args[]) {
		Week today = null;
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);// 일~ 토까지의 숫자를 리턴 1 ~7
	
		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDENSDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SUNDAY;
			break;
		}
		System.out.println("오늘 요일 : " + today);
		if (today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 한다.");
		}else {
			System.out.println("Keep calm and do programming");
		}
		
	}
}

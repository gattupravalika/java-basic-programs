package Task;

import java.util.Scanner;

public class DayName {

	public String dayName;
	String week[] = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

	public String getDayName() {
		return dayName;
	}

	public void setDayName(String dayName) {
		this.dayName = dayName;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the choice");
		String choice = s.next();
		String name = choice.toUpperCase();
		switch (name) {
		case "SUNDAY":
			System.out.println(this.dayName = "SUN");
			break;
		case "MONDAY":
			System.out.println(this.dayName = "MON");
			break;
		case "TUESDAY":
			System.out.println(this.dayName = "TUE");
			break;
		case "WEDNESDAY":
			System.out.println(this.dayName = "WED");
			break;
		case "THURSDAY":
			System.out.println(this.dayName = "THU");
			break;
		case "FRIDAY":
			System.out.println(this.dayName = "FRI");
			break;
		case "SATURDAY":
			System.out.println(this.dayName = "SAT");
			break;
		default:
			System.out.println("the value in dayName :" + (this.dayName = null));
		}
	}

	public static void main(String[] args) {

		DayName obj = new DayName();
		obj.setDayName(obj.dayName);
		obj.getNextDay();
		obj.getPreviousDay();
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number ");
		int number = s.nextInt();
		obj.addToCurrentDay(number);

	}

	public void getNextDay() {
		String name = this.dayName;
		for (int i = 0; i < week.length; i++) {
			if (week[i] == name) {
				System.out.println("next dayname:" + week[i + 1]);
			}
			else if(week[i]==week[6] )
			{
				System.out.println("next dayname:" + week[1]);
			}
			

		}
	}

	public void getPreviousDay() {
		String name = this.dayName;
		for (int i = 0; i < week.length; i++) {
			if (week[i] == name) {
					System.out.println("previous dayname:" + week[i - 1]);
				}
			else if(week[i]==week[1] )
			{
				System.out.println("previous dayname:" + week[6]);
			}
		}

	}

	public void addToCurrentDay(int noOfDays) {

		for (int i = 0; i < week.length; i++) {
			if (week[i] == this.dayName) {
				if (noOfDays > 0) {
					i += noOfDays;
				} else

					System.out.println("days after adding the number:" + week[i]);
			}
		}

	}
}
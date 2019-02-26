import java.math.*;
import java.util.List;
import java.util.*;

public class Day {
	private static List<String> dayOfTheWeek;
	private static String today;
	private static int todayIndex;
	
	public Day() {
		dayOfTheWeek = Arrays.asList("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");
		today = "";
		todayIndex = 0;
		}
	
	public static void setDay(String day) {
		today = day;
	}
	
	public static void printDay() {
		System.out.printf("Today is %s.", today);
	}
	
	public static String returnDay() {
		return today;
	}
	
	public static String nextDay() {
		String nextDay;
		Day.getDayIndex();
		try {
			nextDay = dayOfTheWeek.get(todayIndex + 1);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			nextDay = dayOfTheWeek.get(0);
		}
		return nextDay;
	}
	
	public static String previousDay() {
		String prevDay;
		Day.getDayIndex();
		prevDay = dayOfTheWeek.get(todayIndex - 1);
		return prevDay;
	}
	
	public static int getDayIndex() {
		todayIndex = Arrays.asList(dayOfTheWeek).indexOf(today);
		return todayIndex;
	}
	
	public static void main(String[] args) {
		Day.setDay("Sunday");
		printDay();
	}
}


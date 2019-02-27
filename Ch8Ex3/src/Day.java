import java.util.concurrent.ThreadLocalRandom;

public class Day {
	
	final static int SUN = 0;
	final static int MON = 1;
	final static int TUE = 2;
	final static int WED = 3;
	final static int THU = 4;
	final static int FRI = 5;
	final static int SAT = 6;
	
	public static int today;
	
	private static void setDay(int userDay) {
		today = userDay;
	}
	
	private static void printDay(int day) {
		System.out.print(daySelect(day) + ".\n");
	}
	
	private static void returnNextDay() {
		int thisDay = today; // Used so would not overwrite user's setDate. 
		
		if (thisDay == SAT)
			System.out.println("The day after Saturday is Sunday.");
		else {
			System.out.printf("The day after %s is ", daySelect(today));
			thisDay += 1;
			printDay(thisDay);
		}
	}
	
	private static void returnPrevDay() {
		int thisDay = today; // Used so would not overwrite user's setDate.
		
		if (thisDay == SUN)
			System.out.println("The day before Sunday is Saturday");
		else {
			System.out.printf("The day before %s is ", daySelect(today));
			thisDay -= 1;
			printDay(thisDay);
		}
	}
	
	private static void calculateDay(int numOfDays) {
		int thisDay = today; // Used so would not overwrite user's setDate;
		thisDay += numOfDays % 7;
		
		if (numOfDays == 1 || numOfDays == -1) {
			System.out.printf("%d day from %s is ", numOfDays, daySelect(today));
			printDay(thisDay);
		}
		else {
			System.out.printf("%d days from %s is ", numOfDays, daySelect(today));
			printDay(thisDay);
		}
	}
	
	private static String daySelect(int dayNumber) {
		
		String day = "";
		
		switch (dayNumber) {
		case SUN :
		case 7 : // Used for fixing issue if a user inputed very large numbers into the calculateDay method.
			day = "Sunday";
			break;
		case MON :
		case 8 : // Used for fixing issue if a user inputed very large numbers into the calculateDay method.
		case -6 : // Used for fixing issue if a user inputed very large negative numbers into the calculateDay method.
			day = "Monday";
			break;
		case TUE :
		case 9 : // Used for fixing issue if a user inputed very large numbers into the calculateDay method.
		case -5 : // Used for fixing issue if a user inputed very large negative numbers into the calculateDay method.
			day = "Tuesday";
			break;
		case WED :
		case 10: // Used for fixing issue if a user inputed very large numbers into the calculateDay method.
		case -4 : // Used for fixing issue if a user inputed very large negative numbers into the calculateDay method.
			day = "Wednesday";
			break;
		case THU :
		case 11 : // Used for fixing issue if a user inputed very large numbers into the calculateDay method.
		case -3 : // Used for fixing issue if a user inputed very large negative numbers into the calculateDay method.
			day = "Thursday";
			break;
		case FRI :
		case 12 : // Used for fixing issue if a user inputed very large numbers into the calculateDay method.
		case -2 : // Used for fixing issue if a user inputed very large negative numbers into the calculateDay method.
			day = "Friday";
			break;
		case SAT :
		case -1 : // Used for fixing issue if a user inputed very large negative numbers into the calculateDay method.
			day = "Saturday";
			break;
		default :
			System.out.printf("Switch error! dayNumber = %d day = %s", dayNumber, day);
		}
		
		return day;
	}
	
	// Tests the program through all methods, day values and random day calculations.
	private static void programTester() {
		int i;
		for (i = 0; i < 7; i++) {
			int x;
			setDay(i);
			System.out.print("Today is ");
			printDay(i);
			returnPrevDay();
			returnNextDay();
			for (x = 0; x < 4; x++) {
				int number = ThreadLocalRandom.current().nextInt(-365, 365 + 1);
				calculateDay(number);
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		programTester();
	}
}
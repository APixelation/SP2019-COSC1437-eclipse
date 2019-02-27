import java.util.*;

public class Day {
	private String name;
	private static int dayNumber;

	Day(String n, int d) {
		this.name = n;
		this.dayNumber = d;
	}
	
	private static Day sun = new Day("Sunday", 1);
	private static Day mon = new Day("Monday", 2);
	private static Day tue = new Day("Tuesday", 3);
	private static Day wed = new Day("Wednesday", 4);
	private static Day thu = new Day("Thursday", 5);
	private static Day fri = new Day("Friday", 6);
	private static Day sat = new Day("Saturday", 7);
	

	void printDay() {
		System.out.printf("Today is %s.\n", this.name);
	}
	
	void daySelect(int num) {
		String day = "";
		switch(num) {
			case 0 : 
				day = sat.returnDay();
				break;
			case 1 : 
				day = sun.returnDay();
				break;
			case 2 : 
				day = mon.returnDay();
				break;
			case 3 : 
				 day = tue.returnDay();
				break;
			case 4 :
				day = wed.returnDay();
				break;
			case 5 :
				day = thu.returnDay();
				break;
			case 6 : 
				day = fri.returnDay();
				break;
			case 7 :
				day = sat.returnDay();
				break;
			case 8 :
				day = sun.returnDay();
				break;
			default :
				System.out.printf("Switch error, this is num : %d.\n", num);
		}
		System.out.println(day + ".");
	}
	
	String returnDay() {
		return this.name;
	}
	
	void returnPrevDay() {
		int prevDayNum = this.dayNumber - 1;
		System.out.printf("The day before %s is ", this.name);
		daySelect(prevDayNum);
	}
	
	void returnNextDay() {
		int nextDayNum = this.dayNumber + 1;
		System.out.printf("The next day after %s is ", this.name);
		daySelect(nextDayNum);
	}
	
	
	public static void main(String[] args) {
		sat.printDay();
		sat.returnNextDay();
		sat.returnPrevDay();
	}
}
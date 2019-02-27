import java.util.*;

public class Day {
	String name;
	int dayNumber;

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
		System.out.println("Today is " + this.name);
	}
	
	void daySelectSwitch(int num) {
		switch(num) {
			case 0 : 
				sat.returnDay();
				break;
			case 1 : 
				sun.returnDay();
				break;
			case 2 : 
				mon.returnDay();
				break;
			case 3 : 
				tue.returnDay();
				break;
			case 4 :
				wed.returnDay();
				break;
			case 5 :
				thu.returnDay();
				break;
			case 6 : 
				fri.returnDay();
				break;
			case 7 :
				sat.returnDay();
				break;
			case 8 :
				sun.returnDay();
				break;
			default :
				System.out.printf("Switch error, this is num : %d.\n", num);
		}
	}
	
	String returnDay() {
		return this.name;
	}
	
	int returnPrevDay() {
		int prevDayNum = this.dayNumber - 1;
		return prevDayNum;
	}
	
	int returnNextDay() {
		int nextDayNum = this.dayNumber + 1;
		return nextDayNum;
	}
	
	
	public static void main(String[] args) {
	}
}
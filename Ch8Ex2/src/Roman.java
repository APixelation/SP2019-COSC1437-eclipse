import java.util.*;

public class Roman {
	
	private static int decimalNumber;
	private static boolean convertRoman = true;
	private static char nextChar;
	
	// Constructor
	public Roman() {
	}
	
	public static void setDecimal() {
		Roman.decimalNumber = 0;
	}
	
	public static void romanToDecimal() {
		String romNum;
		System.out.print("Please enter a roman numeral: ");
		romNum = console.next().toUpperCase();
		for (int i = 0; i < romNum.length(); i++) {
			char currentChar = romNum.charAt(i);
			try {
				nextChar = romNum.charAt(i+1);
			}
			catch (StringIndexOutOfBoundsException e) {
			}
			switch(currentChar) {
			case 'M' :
				Roman.decimalNumber += 1000;
				break;
			case 'D' :
				Roman.decimalNumber += 500;
				break;
			case 'C' : 
				Roman.decimalNumber += 100;
				break;
			case 'L' :
				Roman.decimalNumber += 50;
				break;
			case 'X' :
				Roman.decimalNumber += 10;
				break;
			case 'V' :
				Roman.decimalNumber += 5;
				break;
			case 'I' :
				if (nextChar == 'V' || nextChar == 'X')
					Roman.decimalNumber -= 1;
				else
					Roman.decimalNumber += 1;
				break;
			default :
				System.out.printf("%c is not a roman numeral.\n", currentChar);
			}
		}
		System.out.printf("The roman numeral %s is %d.\n", romNum, decimalNumber);
	}
	
	public static void tryAgain() {
		String answer = "";
		System.out.print("Convert another roman numeral? Y/N: ");
		answer = console.next().toUpperCase();
		
			if (answer.equals("Y")) {
				setDecimal();
				return;
			}
			
			else if (answer.equals("N")) {
				System.out.println("Quitting...");
				Roman.convertRoman = false;
			}
			
			else {
				System.out.println("Did not understand answer, quitting!");
				Roman.convertRoman = false;
			}
			
			
		
	}
	
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		do {
			romanToDecimal();
			tryAgain();
		}
		
		while(convertRoman);
	}
	
}

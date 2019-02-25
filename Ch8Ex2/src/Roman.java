import java.util.*;

public class Roman {
	
	private static String romanNumeral;
	private static int decimalNumber;
	private static boolean convertRoman = true;
	
	public Roman() {
		romanNumeral = "";
		decimalNumber = 0;
	}
	
	public static void romanToDecimal() {
		String romNum;
		System.out.print("Please enter a roman numeral: ");
		romNum = console.next().toUpperCase();
		for (int i = 0; i < romNum.length(); i++) {
			char currentChar = romNum.charAt(i);
			switch(currentChar) {
			case 'M' :
				decimalNumber += 1000;
				break;
			case 'D' :
				decimalNumber += 500;
				break;
			case 'C' : 
				decimalNumber += 100;
				break;
			case 'L' :
				decimalNumber += 50;
				break;
			case 'X' :
				decimalNumber += 10;
				break;
			case 'V' :
				decimalNumber += 5;
				break;
			case 'I' :
				decimalNumber += 1;
				break;
			default :
				System.out.printf("%c is not a roman numeral.\n", currentChar);
			}	
		}
		System.out.printf("The Roman Numeral %s is %d.\n", romNum, decimalNumber);
	}
	
	public static void tryAgain() {
		String answer = "";
		System.out.print("Convert another roman numeral? Y/N");
		answer = console.next().toUpperCase();
		
			if (answer.equals("Y")) {
				return;
			}
			
			else if (answer.equals("N")) {
				System.out.println("Quitting...");
				convertRoman = false;
			}
			
			else {
				System.out.println("Did not understand answer, quitting!");
				convertRoman = false;
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

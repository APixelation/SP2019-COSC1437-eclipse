import java.util.*;

public class Ch5_PrExercise5 {

	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {

		boolean anotherNumber;
		String phoneNumber, newPhoneNumber, answer;
		int i;
		char phoneLetter;
		anotherNumber = false;
		
		newPhoneNumber = "";
		
		do {
			newPhoneNumber = "";
			phoneNumber = "";
			
			System.out.print("Please enter the phone number you'd like to translate to numeric values: ");
			phoneNumber = console.next().toUpperCase();
			
			for (i = 0; i <= 7; i++) {
				phoneLetter = phoneNumber.charAt(i);
				
				if (i == 3)
					newPhoneNumber += '-';
				
				switch (phoneLetter) {
				case 'A':
				case 'B':
				case 'C':
					newPhoneNumber += "2";
					break;
				case 'D':
				case 'E':
				case 'F':
					newPhoneNumber += "3";
					break;
				case 'G':
				case 'H':
				case 'I':
					newPhoneNumber += "4";
					break;
				case 'J':
				case 'K':
				case 'L':
					newPhoneNumber += "5";
					break;
				case 'M':
				case 'N':
				case 'O':
					newPhoneNumber += "6";
					break;
				case 'P':
				case 'Q':
				case 'R':
				case 'S':
					newPhoneNumber += "7";
					break;
				case 'T':
				case 'U':
				case 'V':
					newPhoneNumber += "8";
					break;
				case 'W':
				case 'X':
				case 'Y':
				case 'Z':
					newPhoneNumber += "9";
					break;
				case '-':
					break;
				default:
					newPhoneNumber += phoneLetter;
					
				}
			}
			
			System.out.printf("The number %s was translated to %s. %n", phoneNumber, newPhoneNumber);
			System.out.print("Would you like to enter another number? Y/N ");
			answer = console.next().toUpperCase();
			if (answer.equals("Y"))
				anotherNumber = true;
			else if (answer.equals("N")) {
				anotherNumber = false;
				System.out.println("Exiting...");
			}
			else {
				System.out.println("Did not understand the answer, exiting...");
				anotherNumber = false;
			}
		}
		while (anotherNumber);
	}
}

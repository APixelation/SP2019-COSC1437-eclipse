import java.util.*;

public class StarPattern {
	
	static Scanner input = new Scanner(System.in);
	
	public static int argumentNumber;
	public static boolean validNumber;
	
	public static void main(String[] args) {
		starBuilder(getNumber());	
	}
	
	StarPattern() {
		argumentNumber = 0;
		validNumber = false;
	}
	
	// Gets and checks valid number
	public static int getNumber() {
		while (!validNumber) {
			System.out.print("Please enter the number of stars: ");
			try {
				argumentNumber = input.nextInt();
				if (argumentNumber > 0)
					validNumber = true;
				else if (argumentNumber == 0) {
					System.out.println("Zero stars are printed.");
					validNumber = true;
					System.exit(0);
				}
				else
					System.out.println("Please enter a non-negative integer.");
			}
			
			catch (InputMismatchException e) {
				System.out.println("Enter a whole non-negative integer without commas.");
				input.next();
			}
		}
		return argumentNumber;
	}
	
	// Builds the entire star picture.
	public static void starBuilder(int number) {
		descendingStar(number);
		ascendingStar(1);
	}
	
	// Prints stars in descending order.
	public static void descendingStar(int number) {
		 if (number == 1)
			 printStar(number);
		 
		 else {
			 // System.out.println("Else bracket, number is: " + number);
			 printStar(number);
			 // System.out.println("Beginning recursion");
			 descendingStar(number - 1);
		 }
	}
	
	// Prints the stars in ascending order.
	public static void ascendingStar(int number){
		if (number == argumentNumber)
			printStar(number);
		
		else {
			printStar(number);
			ascendingStar(number + 1);
		}
	}

	// Prints the stars for each row
	public static void printStar(int number) {
		for (int i = 0; i < number; i++)
			System.out.print("*");
		System.out.println();
	}
}

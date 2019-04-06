import java.util.Scanner;

public class StarPattern {
	
	static Scanner input = new Scanner(System.in);
	
	public static int argumentNumber;
	public static boolean validNumber;
	
	public static void main(String[] args) {
		
		
	}
	
	StarPattern() {
		argumentNumber = 0;
		validNumber = false;
	}
	
	public static void getNumber() {
		while (!validNumber) {
			System.out.println("Please enter the number of stars: ");
			try {
				argumentNumber = input.nextInt();
			}
			
			catch (NumberFormatException e) {
				System.out.println("Please enter a non-negative integer.");
			}
		}

	}
	
	public static void descendingStar(int number) {
		 if (number == 1)
			 printStar(number);
		 
		 else {
			 System.out.println("Else bracket, number is: " + number);
			 printStar(number);
			 System.out.println("Beginning recursion");
			 descendingStar(number - 1);
		 }
	}
	
	public static int ascendingStar(int number){
		if (number == argumentNumber)
			return number;
		
		else
			return ascendingStar(number +1);
	}

	public static void printStar(int number) {
		for (int i = 0; i < number; i++)
			System.out.print("*");
		System.out.println();
	}
}

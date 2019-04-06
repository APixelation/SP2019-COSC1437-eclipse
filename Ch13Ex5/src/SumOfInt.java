import java.util.*;

public class SumOfInt {
	
	public static Random rn = new Random();
	public static int[] intArray;
	public static int arrayLength, arrayNumber, i, sum;
	public static final int MAX = 10;
	public static final int MIN = 1;
	
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++)
			programTester();
	}
	
	SumOfInt() {
		sum = 0;
	}
	
	// Test the program
	public static void programTester() {
		arrayLength = rn.nextInt((MAX - MIN) + 1) + MIN;
		System.out.println("The length of this array is: " + arrayLength);
		arrayBuilder(arrayLength);
		arrayContent();
		System.out.println("The sum of this array is: " + arraySum(arrayLength));
		System.out.println();
	}
	
	// Creates the length of the array
	public static void arrayBuilder(int number) {
		intArray = new int[number];
	}
	
	// Fill the Array with Numbers
	public static void arrayContent() {
		int number = 0;
		for (i = 0; i < intArray.length; i++) {
			number = rn.nextInt(100);
			intArray[i] = number;
			System.out.printf("Adding %d to array index %d.\n", number, i);
		}
	}
	
	// Recursive Sum Method
	public static int arraySum(int number) {
		if (number == 0 || number == 1)
			return intArray[0];
		else {
			sum = intArray[number - 1] + arraySum(number - 1);
			// System.out.printf("Current number: %d and current sum: %d.\n", number, sum);
			return sum;
		}
	}

}

import java.util.*;

public class SumOfInt {
	
	public static Random rn = new Random();
	public static int[] intArray;
	public static int arrayLength, arrayNumber, i, sum;
	
	public static void main(String[] args) {
		programTester();
	}
	
	SumOfInt() {
	}
	
	public static void programTester() {
		arrayLength = rn.nextInt(20);
		System.out.println(arrayLength);
		arrayBuilder(arrayLength);
		arrayContent();
		arraySum(arrayLength);
		
	}
	public static void arrayBuilder(int number) {
		intArray = new int[number];
	}
	
	public static void arrayContent() {
		int number = 0;
		for (i = 0; i < intArray.length; i++) {
			number = rn.nextInt(100);
			intArray[i] = number;
			System.out.printf("Adding %d to array index: %d.\n", number, i);
		}
	}
	
	public static int arraySum(int number) {
		if (number == 0)
			return intArray[0];
		
		else {
			sum += intArray[arraySum(number - 1)];
			return sum;
		}
	}

}

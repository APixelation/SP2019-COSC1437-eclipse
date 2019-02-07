import java.util.*;

public class Ch3Ex4 
{
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		double cost;
		double area;
		
		double bagSize;
		
		System.out.print("Enter the amount of fertilizer, in pounds, in one bag: ");
		bagSize = console.nextDouble();
		System.out.println();
		
		System.out.printf("Enter the cost of the %.0f pound fertilizer bag: $", bagSize);
		cost = console.nextDouble();
		System.out.println();
		
		System.out.print("Enter the area, in square feet, that can be fertilized by one bag: ");
		area = console.nextDouble();
		System.out.println();
		
		System.out.printf("The cost of the fertilizer per pound is: $%.2f%n", cost / bagSize);
		System.out.printf("The cost of fertilizing per square foot is: $%.2f%n",  cost / area);
		
	}

}

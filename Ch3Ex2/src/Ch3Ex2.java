import java.util.*;

public class Ch3Ex2 {

	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		final double PI = 3.14159;
		double height, radius, volume, surfaceArea;
		
		System.out.print("Enter the height of the cylinder: ");
		height = console.nextDouble();
		System.out.print("Enter the radius of the base of the cylinder: ");
		radius = console.nextDouble();
		
		volume = PI * Math.pow(radius, 2.0) * height;
		surfaceArea = (2 * PI * Math.pow(radius, 2.0) + (2 * PI * radius * height));
		
		System.out.println();
		System.out.printf("Volume of the cylinder = %.2f", volume);
		
		System.out.println();
		System.out.printf("Surface area of the cylinder = %.2f", surfaceArea);
		
		
	}

}

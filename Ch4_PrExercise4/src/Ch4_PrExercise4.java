import java.util.*;

public class Ch4_PrExercise4 {
	
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		final double PI = 3.1416;
		double length;
		double width;
		double height;
		double radius;
		String shape;
		
		System.out.print("Enter the shape type: (rectangle, circle, cylinder) ");
		shape = console.next();
		
		
		if (shape.compareTo("rectangle") == 0) {
			System.out.print("Enter the length of the rectangle: ");
			length = console.nextDouble();
			
			System.out.print("Enter the width of the rectangle: ");
			width = console.nextDouble();
			System.out.println();
			
			
			System.out.printf("Area of the rectangle = %.2f%n", (length * width));
			System.out.println();
			System.out.printf("Perimeter of the rectangle = %.2f%n", (2 * (length + width)));
			
		}
		else if (shape.compareTo("circle") == 0) {
			System.out.print("Enter the radius of the circle: ");
			radius = console.nextDouble();
			System.out.println();
			
			
			System.out.printf("Area of the circle = %.2f%n", (PI * Math.pow(radius,  2.0)));
			System.out.println();
			System.out.printf("Circumference of the circle: %.2f%n", (2 * PI * radius));
			
		}
		
		else if (shape.compareTo("cylinder") == 0) {
			
			System.out.print("Enter the height of the cylinder: ");
			height = console.nextDouble();
			System.out.print("Enter the radius of the base of the cylinder: ");
			radius = console.nextDouble();
			System.out.println();
			
			
			
			System.out.printf("Volume of the cylinder = %.2f%n", (PI * Math.pow(radius, 2.0)));
			System.out.println();
			System.out.printf("Surface area of the cylinder: %.2f%n", (2 * PI * radius * height + 2 * PI * Math.pow(radius, 2.0)));
			
		}
		
		else
			System.out.println("The program does not handle " + shape);
		
	}

}

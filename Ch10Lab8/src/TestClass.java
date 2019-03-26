import java.util.Random;

public class TestClass {
	
	public static Point myPoint = new Point();
	public static Circle myCircle = new Circle();
	public static Point anotherPoint = new Point();
	public static Circle anotherCircle = new Circle();
	public static Random randomNumber = new Random();
	public static int xPoint, yPoint, rPoint;
	
	public TestClass( ) {
		
	}

	public static void generateInt() {
		xPoint = randomNumber.nextInt(40);
		yPoint = randomNumber.nextInt(40);
		rPoint = randomNumber.nextInt(40);
		
	}

	public static void main(String[] args) {
		
		// Auto Test Point Class
		for (int i = 0; i <= 3; i++) {
			generateInt();
			myPoint.setPoint(xPoint, yPoint);
			System.out.println("X Coordinate: " + myPoint.returnX());
			System.out.println("Y Coordinate: " + myPoint.returnY());
			myPoint.print();
		}
		
		// Auto Test Circle Class
		for (int i = 0; i <= 3; i++) {
			generateInt();
			myCircle.setPoint(xPoint, yPoint, rPoint);
			myCircle.calcArea();
			myCircle.calcCirc();
			myCircle.print();
		}
		
		// Manual Test
		System.out.println("Manual Test Below: ");
		anotherPoint.setPoint(7, 11);
		System.out.println(anotherPoint.returnX());
		System.out.println(anotherPoint.returnY());
		anotherPoint.print();
		
		anotherCircle.setPoint(20, 35, 25);
		anotherCircle.calcArea();
		anotherCircle.calcCirc();
		anotherCircle.print();
	}
}

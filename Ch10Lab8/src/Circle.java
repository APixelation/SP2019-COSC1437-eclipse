
public class Circle extends Point {
	private double radius, area, circumference;
	
	public Circle() {
		radius = 0;
		area = 0;
		circumference = 0;
	}
	
	public void setPoint(int x, int y, int r) {
		super.setPoint(x, y);
		radius = r;
	}
	
	public void setRadius(int r) {
		radius = r;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void printRadius() {
		System.out.println("Radius: " + getRadius());
	}
	
	public double calcArea() {
		return area = (Math.PI * Math.pow(radius, 2));
	}
	
	public double calcCirc() {
		return circumference = (2 * (Math.PI * radius));
	}
	
	@Override
	public void print(){
		System.out.printf("Radius: %.2f Area: %.2f Circumference: %.2f\n", radius, area, circumference);
		System.out.print("Center point: ");
		super.print();
	}
}

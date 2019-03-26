
public class Point {
	
	// Instance Variables
	private int x, y;
	
	public Point() {
		x = 0;
		y = 0;
	}
	
	public Point(int xVar, int yVar) {
		x = xVar;
		y = yVar;
	}
	
	public void setPoint(int xVar, int yVar) {
		x = xVar;
		y = yVar;
	}
	
	public int returnX( ) {
		return x;
	}
	
	public int returnY() {
		return y;
	}
	
	public void print() {
		System.out.printf("(%d,%d)\n\n", x, y);
	}
}


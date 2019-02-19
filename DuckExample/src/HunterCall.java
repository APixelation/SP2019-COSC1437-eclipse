
public class HunterCall extends DuckCall {
	
	public HunterCall() {
		quackBehavior = new Quack();
	}
	
	public void display() {
		System.out.println("I'm a hunter duck call.");
	}
}

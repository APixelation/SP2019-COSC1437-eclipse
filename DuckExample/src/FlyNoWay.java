// Flying behavior implemented by ducks that don't fly.
public class FlyNoWay implements FlyBehavior {
	public void fly() {
		System.out.println("I can't fly!");
	}
}

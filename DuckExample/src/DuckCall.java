
public abstract class DuckCall {

	QuackBehavior quackBehavior;
	
	public DuckCall() {
		
	}
		public abstract void display();
		
		public void performQuack() {
			quackBehavior.quack();
		}
}

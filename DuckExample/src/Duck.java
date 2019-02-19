// Duck is an abstract superclass that will be used by more than one subclass.
public abstract class Duck {
	
	//Interface / Reference
	FlyBehavior flyBehavior; // 'flyBehavior' is a reference variable for the FlyBehavior Interface
	QuackBehavior quackBehavior; // 'quackBehavior is a reference variable for the QuackBehavior Interface
	public Duck() {
	}
	
	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly(); // delegates to the respective behavior class
	}
	
	public void performQuack() {
		quackBehavior.quack(); // delegates to the respective behavior class
	}
	
	// Methods to change the behavior on the fly (anytime)
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
	
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
}

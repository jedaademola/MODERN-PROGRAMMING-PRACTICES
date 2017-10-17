package edu.mum.mpp.lesson7.prob5;

public class RubberDuck extends Duck {
	public RubberDuck() {
		setQuackBehavior(new Squeak());
		setFlyBehavior(new CannotFly());
	}
	@Override
	public void display() {
		System.out.println("  displaying");
		
	}
}

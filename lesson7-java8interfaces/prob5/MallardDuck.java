package edu.mum.mpp.lesson7.prob5;

public class MallardDuck extends Duck {
	public MallardDuck() {
		setQuackBehavior(new Quack());
		setFlyBehavior(new FlyWithWings());
	}
	@Override
	public void display() {
		System.out.println("  display");
		
	}

}

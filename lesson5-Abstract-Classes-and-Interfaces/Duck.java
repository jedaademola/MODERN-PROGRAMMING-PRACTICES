package edu.mum.mpp.lesson5;

abstract public class Duck {
	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;
	
	abstract public void display();
	
	protected Duck(FlyBehavior flyBehavior,QuackBehavior quackBehavior ){
		this.flyBehavior = flyBehavior;
		this.quackBehavior = quackBehavior;
	}
	
	public void fly() {
		flyBehavior.fly();
	}
	
	public void quack() {
		quackBehavior.quack();
	}

	
	public void swim() {
		System.out.println("  swimming");
	}
	
}

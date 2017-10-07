package edu.mum.mpp.lesson5;

public class RedheadDuck extends Duck {
	public RedheadDuck() {
		super(new FlyWithWings(),new Quack());
	}
	
	@Override
	public void display() {
		System.out.println("  displaying");
		
	}
}

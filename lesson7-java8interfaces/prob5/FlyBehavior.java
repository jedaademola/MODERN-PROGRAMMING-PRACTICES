package edu.mum.mpp.lesson7.prob5;

public interface FlyBehavior {
	default public void fly()
	{
		System.out.println("Flying with wings");
	}
}

package edu.mum.mpp.lesson7.prob5;

public interface QuackBehavior {
	default public void quack()
	{
		System.out.println("Quack by squeaking");
	}
}

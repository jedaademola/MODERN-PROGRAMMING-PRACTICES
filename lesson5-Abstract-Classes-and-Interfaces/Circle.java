package edu.mum.mpp.lesson5;

public final class Circle implements Figure{
	
	
	//PI * radius * radius
	private final double radius;
	

	
	public Circle(double _radius)
	{
		this.radius= _radius;
		
	}
	public double getRadius() {
		return radius;
	}


	@Override
	public double computeArea()
	{
		
		return Math.PI * radius * radius;
	}

}

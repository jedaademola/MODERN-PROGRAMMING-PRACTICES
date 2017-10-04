package edu.mm.lesson3;

public class Cylinder extends Circle{

	private double height;
	
	Cylinder()
	{
		height=1.0;
	}
	
	Cylinder(double radius)
	{
		super(radius);
	}
	
	Cylinder(double radius,double height)
	{
		super(radius);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}
	
	public double getVolume() {
		return Math.PI * Math.pow(super.getRadius(),2) * height;
	}
}

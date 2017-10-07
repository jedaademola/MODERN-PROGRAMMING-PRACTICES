package edu.mum.mpp.lesson5;

public final class Triangle implements Figure{
	
	final double HALF = 0.5;
	
	//1/2 * base * height
	
	private final double base;
	private final double height;
	
	
	public Triangle(double _base, double _height)
	{
		this.base= _base;
		this.height=_height;
	}
		
	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}

	@Override
	public double computeArea()
	{
		return HALF * base * height;
	}


}

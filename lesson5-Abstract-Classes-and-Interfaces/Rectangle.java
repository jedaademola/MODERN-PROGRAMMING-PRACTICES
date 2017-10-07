package edu.mum.mpp.lesson5;

public final class Rectangle implements Figure{
	
	private final double width;
	private final double length;
	
	//width * length
	
	public Rectangle(double _width, double _length)
	{
		this.width= _width;
		this.length=_length;
	}
	
	

	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}

	@Override
	public double computeArea()
	{
		
		return width * length;
	}

	
}

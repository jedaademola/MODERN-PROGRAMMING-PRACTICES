package lab3;

public class Circle {
	private double radius;
	
	private String color;
	
	Circle(double radius)
	{
		this.radius=radius;
		
	}
	
	Circle()
	{
		color ="red";
		radius =1.0;
	}
	
	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}

}

package lab3;

public class CylinderComposition {

	private double height;
	private Circle circle;//= new Circle();

	CylinderComposition() {
		circle= new Circle();
		height = 1.0;
	}

	@Override
	public String toString() {
		return "CylinderComposition [height=" + height + ", circle=" + circle + "]";
	}

	CylinderComposition(double radius) {
	
		circle= new Circle(radius);
		//this.circle.getRadius();
	}

	CylinderComposition(double radius, double height) {
		//this.circle.getRadius();
		circle= new Circle(radius);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public double getVolume() {
		return Math.PI * Math.pow(this.circle.getRadius(),2) * height;
	}

}

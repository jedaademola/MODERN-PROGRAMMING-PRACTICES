package edu.mm.lesson3;

public class CylinderComposition {

	private double height;
	private Circle circle= new Circle();

	CylinderComposition() {
		height = 1.0;
	}

	CylinderComposition(double radius) {
	
		this.circle.getRadius();
	}

	CylinderComposition(double radius, double height) {
		this.circle.getRadius();
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public double getVolume() {
		return Math.PI * Math.pow(this.circle.getRadius(),2) * height;
	}

}

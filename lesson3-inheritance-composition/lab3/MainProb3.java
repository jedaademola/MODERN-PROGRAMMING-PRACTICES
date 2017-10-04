package edu.mm.lesson3;

public class MainProb3 {

	public static void main(String[] args) {
		
		Circle circle = new Circle();
		Circle circle2 = new Circle(2);
		Cylinder cylinder = new Cylinder();
		CylinderComposition newCylinder1 = new CylinderComposition();
		CylinderComposition newCylinder2 = new CylinderComposition(2);
		
		System.out.println("Area:"  + circle.getArea() + " Radius:" + circle.getRadius());
		System.out.println();
		System.out.println("Area2:"  + circle2.getArea() + " Radius:" + circle2.getRadius());
		System.out.println();
		System.out.println("Volume:"  + cylinder.getVolume() + " Height:" + cylinder.getHeight());
		System.out.println();
		System.out.println("Composition Volume:"  + newCylinder1.getVolume() + " Height:" + newCylinder1.getHeight());
		System.out.println();
		System.out.println("Composition Volume2:"  + newCylinder2.getVolume() + " Height:" + newCylinder2.getHeight());
		

	}

}

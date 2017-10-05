package lab3;

public class MainProb3 {

	public static void main(String[] args) {
		
		Circle circle = new Circle();
		Circle circle2 = new Circle(2);
		
		Cylinder cylinder = new Cylinder();
		
		CylinderComposition newCylinder1 = new CylinderComposition();
		CylinderComposition newCylinder2 = new CylinderComposition(2);
		CylinderComposition newCylinder3 = new CylinderComposition(2,3);
		
		System.out.println("Area of Circle1(default constructor):"  + circle.getArea() + " Radius:" + circle.getRadius());
		System.out.println();
		System.out.println("Area of Circle2(radius as parameter):"  + circle2.getArea() + " Radius:" + circle2.getRadius());
		System.out.println();
		System.out.println("Volume of Cylinder without Composition:"  + cylinder.getVolume() + " Height:" + cylinder.getHeight());
		System.out.println();
		System.out.println("Composition Volume of Cylinder1:"  + newCylinder1.getVolume() + " Height:" + newCylinder1.getHeight());
		System.out.println();
		System.out.println("Composition Volume of Cylinder2:"  + newCylinder2.getVolume() + " Height:" + newCylinder2.getHeight());
		System.out.println();
		System.out.println("Composition Volume of Cylinder3:"  + newCylinder3.getVolume() + " Height:" + newCylinder3.getHeight());
		

	}

}

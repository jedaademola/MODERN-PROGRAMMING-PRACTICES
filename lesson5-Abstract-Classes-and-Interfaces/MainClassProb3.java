package edu.mum.mpp.lesson5;



public class MainClassProb3 {

	public static void main(String[] args) {
		
		Figure[] figures = new Figure[3];
		
		Circle circle = new Circle(5);
		Triangle tri = new Triangle(4, 12);
		Rectangle rec = new Rectangle(8, 9);
		
		figures[0] = circle;
		figures[1] = tri;
		figures[2] = rec;
		
		displayArea(figures);

	}
	
	public static void displayArea(Figure[] figures)
	{
		double totalArea=0.0;
		
		if(figures != null)
		{
			for(Figure f:figures)
				totalArea+=f.computeArea();
		}
		
		System.out.printf("Sum of Areas = %.2f",totalArea );
	}

}

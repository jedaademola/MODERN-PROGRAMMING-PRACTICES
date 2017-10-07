package edu.mum.mpp.lesson5;

public class MainDuckProb2 {

	public static void main(String[] args) {
		Duck[] ducks = 
			{new MallardDuck(), new DecoyDuck(), new RedheadDuck(), new RubberDuck()};
		for(Duck d: ducks) {
			System.out.println(d.getClass().getSimpleName() + ":");
			d.display();
			d.fly();
			d.quack();
			d.swim();
		}

	}

}

package edu.mm.lesson3;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		
		Apartment app1 = new Apartment(1,100);
		Apartment app2 = new Apartment(2,150);
		Apartment app3 = new Apartment(3,200);
		
		List<Apartment> appList = new ArrayList<>();
		appList.add(app1);
		appList.add(app2);
		appList.add(app3);
		
		Building building1 = new Building(1,"Des Moines",200,appList);
		
		
		Apartment app4 = new Apartment(1,10);
		Apartment app5 = new Apartment(2,15);
		Apartment app6 = new Apartment(3,20);
		List<Apartment> appList2 = new ArrayList<>();
		appList2.add(app4);
		appList2.add(app5);
		appList2.add(app6);
		
		Building building2 = new Building(2,"Fairfield",10,appList2);
		
		
		List<Building> buildingList =new ArrayList<>();
		buildingList.add(building1);
		buildingList.add(building2);
		
		Landlord landlord = new Landlord("Bob","123-678",buildingList);
		System.out.println(landlord);
		
		double totalProfit=0.0;
		for (Building b: landlord.getBuilding())
			totalProfit+= b.profit();
			
		System.out.println("Landlord’s monthly total profits:" + totalProfit);
		
		
	}

}

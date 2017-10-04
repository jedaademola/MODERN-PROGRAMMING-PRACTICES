package edu.mm.lesson3;

import java.util.List;

public class Building {
	
	private int buildingId;
	private String location;
	private List<Apartment> apartment; 
	private double maintenance;
	
	Building(int buildingId,String location,double maintenance,List<Apartment> apartment)
	{
		this.buildingId = buildingId;
		this.location= location;
		this.maintenance=maintenance;
		this.apartment=apartment;
	}

	@Override
	public String toString() {
		return "Building [buildingId=" + buildingId + ", location=" + location + ", apartment=" + apartment
				+ ", maintenance=" + maintenance + "]";
	}
	
	public double profit()
	{
		double sum=0.0;
		for(Apartment a : apartment)
			sum+=a.getRent();
		
		return sum - maintenance;
	}
	
}
